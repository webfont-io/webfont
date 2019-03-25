package webfontsdk

import (
	"context"
	"log"
	"testing"
	"time"

	"google.golang.org/grpc"
	"google.golang.org/grpc/status"
)

var err error
var conn *grpc.ClientConn

func initConnect() {
	conn, err = grpc.Dial("localhost:5000", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
}
func Test_build(t *testing.T) {
	initConnect()
	c := NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &FontBuildRequest{
		FontId:   45803,
		Apikey:   "5873b2bc-84e7-490b-b637-58aaf7d59240",
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
	initConnect()
	c := NewGreeterClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	req := &FontListRequest{
		Apikey: "5873b2bc-84e7-490b-b637-58aaf7d59240",
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

func Benchmark_context_len5(b *testing.B) {
	initConnect()
	c := NewGreeterClient(conn)
	ctx, _ := context.WithTimeout(context.Background(), 5*time.Second)
	//defer cancel()
	b.RunParallel(func(pb *testing.PB) {
		for pb.Next() {
			req := &FontBuildRequest{
				FontId:   45803,
				Apikey:   "798e7dac-bdd4-4049-b03c-7cce5832e013",
				Text:     "方式阿道夫",
				NeedTtf:  true,
				NeedEot:  true,
				NeedWoff: true,
			}
			if _, err := c.BuildFont(ctx, req); err != nil {
				if actual, ok := status.FromError(err); ok {
					b.Fatal("actual", "code", actual.Code(), "err:", actual.Message())
				}
			} else {
			}
		}
	})
}

func Benchmark_context_lenx(b *testing.B) {
	initConnect()
	c := NewGreeterClient(conn)
	ctx, _ := context.WithTimeout(context.Background(), 5*time.Second)
	//defer cancel()
	b.RunParallel(func(pb *testing.PB) {
		for pb.Next() {
			req := &FontBuildRequest{
				FontId: 45803,
				Apikey: "798e7dac-bdd4-4049-b03c-7cce5832e013",
				Text: `原标题：立德树人，习近平这样阐释教育的根本任务

				　　[编前语]国无德不兴，人无德不立。习近平总书记一贯高度重视培养社会主义建设者和接班人，把立德树人作为教育的中心环节。新华社《学习进行时》为您梳理十八大以来总书记的有关精彩论述，与您共同学习感悟。
				
				　　1、好老师应该懂得，选择当老师就选择了责任，就要尽到教书育人、立德树人的责任，并把这种责任体现到平凡、普通、细微的教学管理之中。
				
				　　——2014年9月9日，同北京师范大学师生代表座谈时的讲话
				
				　　2、高校立身之本在于立德树人。只有培养出一流人才的高校，才能够成为世界一流大学。
				
				　　——2016年12月7日至8日，在全国高校思想政治工作会议上的讲话
				
				　　3、要坚持把立德树人作为中心环节，把思想政治工作贯穿教育教学全过程，实现全程育人、全方位育人，努力开创我国高等教育事业发展新局面。
				
				　　——2016年12月7日至8日，在全国高校思想政治工作会议上的讲话
				
				　　4、要全面贯彻党的教育方针，落实立德树人根本任务，发展素质教育，推进教育公平，培养德智体美全面发展的社会主义建设者和接班人。
				
				　　——2017年10月18日，在中国共产党第十九次全国代表大会上的报告
				
				　　5、人无德不立，育人的根本在于立德。这是人才培养的辩证法。办学就要尊重这个规律，否则就办不好学。
				
				　　——2018年5月2日，在北京大学师生座谈会上的讲话
				
				　　6、要把立德树人的成效作为检验学校一切工作的根本标准，真正做到以文化人、以德育人，不断提高学生思想水平、政治觉悟、道德品质、文化素养，做到明大德、守公德、严私德。
				
				　　——2018年5月2日，在北京大学师生座谈会上的讲话
				
				　　7、要把立德树人内化到大学建设和管理各领域、各方面、各环节，做到以树人为核心，以立德为根本。
				
				　　——2018年5月2日，在北京大学师生座谈会上的讲话
				
				　　8、要在加强品德修养上下功夫，教育引导学生培育和践行社会主义核心价值观，踏踏实实修好品德，成为有大爱大德大情怀的人。
				
				　　——2018年9月10日，在全国教育大会上的讲话
				
				　　9、要深化教育体制改革，健全立德树人落实机制，扭转不科学的教育评价导向，坚决克服唯分数、唯升学、唯文凭、唯论文、唯帽子的顽瘴痼疾，从根本上解决教育评价指挥棒问题。
				
				　　——2018年9月10日，在全国教育大会上的讲话
				
				　　10、要把立德树人融入思想道德教育、文化知识教育、社会实践教育各环节，贯穿基础教育、职业教育、高等教育各领域，学科体系、教学体系、教材体系、管理体系要围绕这个目标来设计，教师要围绕这个目标来教，学生要围绕这个目标来学。凡是不利于实现这个目标的做法都要坚决改过来。
				
				　　——2018年9月10日，在全国教育大会上的讲话`,
				NeedTtf:  true,
				NeedEot:  true,
				NeedWoff: true,
			}
			if _, err := c.BuildFont(ctx, req); err != nil {
				if actual, ok := status.FromError(err); ok {
					b.Fatal("actual", "code", actual.Code(), "err:", actual.Message())
				}
			} else {
			}
		}
	})
}
