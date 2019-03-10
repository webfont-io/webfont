package webfontsdk

import (
	"context"
	"log"
	"testing"
	"time"

	"google.golang.org/grpc"
	"google.golang.org/grpc/status"
)

func Test_build(t *testing.T) {
	var err error
	var conn *grpc.ClientConn
	conn, err = grpc.Dial("localhost:5000", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	defer conn.Close()
	c := NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &FontBuildRequest{
		FontId:   45803,
		Apikey:   "8d9ebc26-39fc-4415-ab16-731d23aa7f97",
		Text:     "苏打粉地方",
		NeedTtf:  true,
		NeedEot:  true,
		NeedWoff: true,
	}
	if ret, err := c.BuildFont(ctx, req); err != nil {
		if actual, ok := status.FromError(err); ok {
			t.Fatal("actual", "code", actual.Code(), "err:", actual.Message())
		}
	} else {
		t.Log("ttf", len(ret.GetBytesTtf()), "eot", len(ret.GetBytesEot()), "woff", len(ret.GetBytesWoff()))
		//拼装font-familly
	}
}

func Test_getlist(t *testing.T) {
	var err error
	var conn *grpc.ClientConn
	conn, err = grpc.Dial("localhost:5000", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	defer conn.Close()
	c := NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &FontListRequet{
		Apikey: "8d9ebc26-39fc-4415-ab16-731d23aa7f97",
	}
	if ret, err := c.FontList(ctx, req); err != nil {
		if actual, ok := status.FromError(err); ok {
			t.Fatal("actual", "code", actual.Code(), "err:", actual.Message())
		}
	} else {
		for k, v := range ret.Fonts {
			t.Log("list", k, v)
		}
		//拼装font-familly
	}
}
