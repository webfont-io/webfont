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
}

func fontList() {
	c := webfontsdk.NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &webfontsdk.FontListRequest{
		Apikey: "5873b2bc-84e7-490b-b637-58aaf7d59240",
	}
	if ret, err := c.FontList(ctx, req); err != nil {
		if actual, ok := status.FromError(err); ok {
			log.Println("actual", "code", actual.Code(), "err:", actual.Message())
		}
	} else {
		for k, v := range ret.Fonts {
			log.Println("list", k, v)
		}
	}
}

func fontBuild() {
	c := webfontsdk.NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &webfontsdk.FontBuildRequest{
		FontId:   45803,
		Apikey:   "5873b2bc-84e7-490b-b637-58aaf7d59240",
		Text:     "苏打粉地方",
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
}

func multfontBuild() {
	c := webfontsdk.NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &webfontsdk.MultFontBuildRequest{}
	req.Items = make([]*webfontsdk.FontBuildRequest, 0)
	req.Items = append(req.Items, &webfontsdk.FontBuildRequest{
		FontId:   45803,
		Apikey:   "5873b2bc-84e7-490b-b637-58aaf7d59240",
		Text:     "苏打粉地方",
		NeedTtf:  true,
		NeedEot:  true,
		NeedWoff: true,
	})

	req.Items = append(req.Items, &webfontsdk.FontBuildRequest{
		FontId:   168,
		Apikey:   "5873b2bc-84e7-490b-b637-58aaf7d59240",
		Text:     "测试",
		NeedTtf:  true,
		NeedEot:  true,
		NeedWoff: true,
	})
	if rets, err := c.MultBuildFont(ctx, req); err != nil {
		if actual, ok := status.FromError(err); ok {
			log.Println("actual", "code", actual.Code(), "err:", actual.Message())
		}
	} else {
		for _, ret := range rets.Items {

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
	}
}

func main() {

}
