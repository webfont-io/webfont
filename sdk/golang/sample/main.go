package main

import (
	"context"
	"log"
	"time"

	"github.com/webfont-io/webfont/sdk/golang/webfontsdk"
	"google.golang.org/grpc"
	"google.golang.org/grpc/status"
)

var conn *grpc.ClientConn

func init() {
	var err error
	conn, err = grpc.Dial("localhost:5000", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	//defer conn.Close()
	//c := webfontsdk.NewGreeterClient(conn)
}

func main() {
	c := webfontsdk.NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)

	req := &webfontsdk.FontBuildRequest{
		FontId:   12,
		NeedTtf:  true,
		NeedEot:  true,
		NeedWoff: true,
	}
	if ret, err := c.BuildFont(ctx, req); err != nil {
		if actual, ok := status.FromError(err); ok {
			log.Println("actual", "code", actual.Code(), "err:", actual.Message())
		}
	} else {
		if len(ret.GetBytesTtf()) > 0 {
			//savettf
		}

		if len(ret.GetBytesEot()) > 0 {
			//saveeot
		}

		if len(ret.GetBytesWoff()) > 0 {
			//savewoff
		}

		//拼装font-familly
	}
	defer cancel()
}
