// Code generated by protoc-gen-go. DO NOT EDIT.
// source: webfont.proto

package webfontsdk

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	grpc "google.golang.org/grpc"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type FontListRequest struct {
	Apikey               string   `protobuf:"bytes,1,opt,name=apikey,proto3" json:"apikey,omitempty" bson:"apikey,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-" bson:"-"`
	XXX_unrecognized     []byte   `json:"-" bson:"-"`
	XXX_sizecache        int32    `json:"-" bson:"-"`
}

func (m *FontListRequest) Reset()         { *m = FontListRequest{} }
func (m *FontListRequest) String() string { return proto.CompactTextString(m) }
func (*FontListRequest) ProtoMessage()    {}
func (*FontListRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e04e5ea2200a7886, []int{0}
}

func (m *FontListRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FontListRequest.Unmarshal(m, b)
}
func (m *FontListRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FontListRequest.Marshal(b, m, deterministic)
}
func (m *FontListRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FontListRequest.Merge(m, src)
}
func (m *FontListRequest) XXX_Size() int {
	return xxx_messageInfo_FontListRequest.Size(m)
}
func (m *FontListRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_FontListRequest.DiscardUnknown(m)
}

var xxx_messageInfo_FontListRequest proto.InternalMessageInfo

func (m *FontListRequest) GetApikey() string {
	if m != nil {
		return m.Apikey
	}
	return ""
}

type FontListResult struct {
	//uint32 font_id = 1;
	//uint64 express = 2;
	Fonts                map[uint32]int64 `protobuf:"bytes,1,rep,name=fonts,proto3" json:"fonts,omitempty" bson:"fonts,omitempty" protobuf_key:"varint,1,opt,name=key,proto3" protobuf_val:"varint,2,opt,name=value,proto3"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-" bson:"-"`
	XXX_unrecognized     []byte           `json:"-" bson:"-"`
	XXX_sizecache        int32            `json:"-" bson:"-"`
}

func (m *FontListResult) Reset()         { *m = FontListResult{} }
func (m *FontListResult) String() string { return proto.CompactTextString(m) }
func (*FontListResult) ProtoMessage()    {}
func (*FontListResult) Descriptor() ([]byte, []int) {
	return fileDescriptor_e04e5ea2200a7886, []int{1}
}

func (m *FontListResult) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FontListResult.Unmarshal(m, b)
}
func (m *FontListResult) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FontListResult.Marshal(b, m, deterministic)
}
func (m *FontListResult) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FontListResult.Merge(m, src)
}
func (m *FontListResult) XXX_Size() int {
	return xxx_messageInfo_FontListResult.Size(m)
}
func (m *FontListResult) XXX_DiscardUnknown() {
	xxx_messageInfo_FontListResult.DiscardUnknown(m)
}

var xxx_messageInfo_FontListResult proto.InternalMessageInfo

func (m *FontListResult) GetFonts() map[uint32]int64 {
	if m != nil {
		return m.Fonts
	}
	return nil
}

type FontBuildRequest struct {
	FontId               uint32   `protobuf:"varint,1,opt,name=font_id,json=fontId,proto3" json:"font_id,omitempty" bson:"font_id,omitempty"`
	Text                 string   `protobuf:"bytes,2,opt,name=text,proto3" json:"text,omitempty" bson:"text,omitempty"`
	Apikey               string   `protobuf:"bytes,3,opt,name=apikey,proto3" json:"apikey,omitempty" bson:"apikey,omitempty"`
	NeedTtf              bool     `protobuf:"varint,4,opt,name=need_ttf,json=needTtf,proto3" json:"need_ttf,omitempty" bson:"need_ttf,omitempty"`
	NeedEot              bool     `protobuf:"varint,5,opt,name=need_eot,json=needEot,proto3" json:"need_eot,omitempty" bson:"need_eot,omitempty"`
	NeedWoff             bool     `protobuf:"varint,6,opt,name=need_woff,json=needWoff,proto3" json:"need_woff,omitempty" bson:"need_woff,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-" bson:"-"`
	XXX_unrecognized     []byte   `json:"-" bson:"-"`
	XXX_sizecache        int32    `json:"-" bson:"-"`
}

func (m *FontBuildRequest) Reset()         { *m = FontBuildRequest{} }
func (m *FontBuildRequest) String() string { return proto.CompactTextString(m) }
func (*FontBuildRequest) ProtoMessage()    {}
func (*FontBuildRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e04e5ea2200a7886, []int{2}
}

func (m *FontBuildRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FontBuildRequest.Unmarshal(m, b)
}
func (m *FontBuildRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FontBuildRequest.Marshal(b, m, deterministic)
}
func (m *FontBuildRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FontBuildRequest.Merge(m, src)
}
func (m *FontBuildRequest) XXX_Size() int {
	return xxx_messageInfo_FontBuildRequest.Size(m)
}
func (m *FontBuildRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_FontBuildRequest.DiscardUnknown(m)
}

var xxx_messageInfo_FontBuildRequest proto.InternalMessageInfo

func (m *FontBuildRequest) GetFontId() uint32 {
	if m != nil {
		return m.FontId
	}
	return 0
}

func (m *FontBuildRequest) GetText() string {
	if m != nil {
		return m.Text
	}
	return ""
}

func (m *FontBuildRequest) GetApikey() string {
	if m != nil {
		return m.Apikey
	}
	return ""
}

func (m *FontBuildRequest) GetNeedTtf() bool {
	if m != nil {
		return m.NeedTtf
	}
	return false
}

func (m *FontBuildRequest) GetNeedEot() bool {
	if m != nil {
		return m.NeedEot
	}
	return false
}

func (m *FontBuildRequest) GetNeedWoff() bool {
	if m != nil {
		return m.NeedWoff
	}
	return false
}

type MultFontBuildRequest struct {
	Items                []*FontBuildRequest `protobuf:"bytes,1,rep,name=items,proto3" json:"items,omitempty" bson:"items,omitempty"`
	XXX_NoUnkeyedLiteral struct{}            `json:"-" bson:"-"`
	XXX_unrecognized     []byte              `json:"-" bson:"-"`
	XXX_sizecache        int32               `json:"-" bson:"-"`
}

func (m *MultFontBuildRequest) Reset()         { *m = MultFontBuildRequest{} }
func (m *MultFontBuildRequest) String() string { return proto.CompactTextString(m) }
func (*MultFontBuildRequest) ProtoMessage()    {}
func (*MultFontBuildRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e04e5ea2200a7886, []int{3}
}

func (m *MultFontBuildRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MultFontBuildRequest.Unmarshal(m, b)
}
func (m *MultFontBuildRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MultFontBuildRequest.Marshal(b, m, deterministic)
}
func (m *MultFontBuildRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MultFontBuildRequest.Merge(m, src)
}
func (m *MultFontBuildRequest) XXX_Size() int {
	return xxx_messageInfo_MultFontBuildRequest.Size(m)
}
func (m *MultFontBuildRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_MultFontBuildRequest.DiscardUnknown(m)
}

var xxx_messageInfo_MultFontBuildRequest proto.InternalMessageInfo

func (m *MultFontBuildRequest) GetItems() []*FontBuildRequest {
	if m != nil {
		return m.Items
	}
	return nil
}

type FontBuildBufResult struct {
	FontId               uint32   `protobuf:"varint,1,opt,name=font_id,json=fontId,proto3" json:"font_id,omitempty" bson:"font_id,omitempty"`
	FontFormatVersion    uint32   `protobuf:"varint,2,opt,name=font_format_version,json=fontFormatVersion,proto3" json:"font_format_version,omitempty" bson:"font_format_version,omitempty"`
	FontChecksum         uint32   `protobuf:"varint,3,opt,name=font_checksum,json=fontChecksum,proto3" json:"font_checksum,omitempty" bson:"font_checksum,omitempty"`
	NameEn               string   `protobuf:"bytes,4,opt,name=name_en,json=nameEn,proto3" json:"name_en,omitempty" bson:"name_en,omitempty"`
	BytesTtf             []byte   `protobuf:"bytes,5,opt,name=bytes_ttf,json=bytesTtf,proto3" json:"bytes_ttf,omitempty" bson:"bytes_ttf,omitempty"`
	BytesEot             []byte   `protobuf:"bytes,6,opt,name=bytes_eot,json=bytesEot,proto3" json:"bytes_eot,omitempty" bson:"bytes_eot,omitempty"`
	BytesWoff            []byte   `protobuf:"bytes,7,opt,name=bytes_woff,json=bytesWoff,proto3" json:"bytes_woff,omitempty" bson:"bytes_woff,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-" bson:"-"`
	XXX_unrecognized     []byte   `json:"-" bson:"-"`
	XXX_sizecache        int32    `json:"-" bson:"-"`
}

func (m *FontBuildBufResult) Reset()         { *m = FontBuildBufResult{} }
func (m *FontBuildBufResult) String() string { return proto.CompactTextString(m) }
func (*FontBuildBufResult) ProtoMessage()    {}
func (*FontBuildBufResult) Descriptor() ([]byte, []int) {
	return fileDescriptor_e04e5ea2200a7886, []int{4}
}

func (m *FontBuildBufResult) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FontBuildBufResult.Unmarshal(m, b)
}
func (m *FontBuildBufResult) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FontBuildBufResult.Marshal(b, m, deterministic)
}
func (m *FontBuildBufResult) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FontBuildBufResult.Merge(m, src)
}
func (m *FontBuildBufResult) XXX_Size() int {
	return xxx_messageInfo_FontBuildBufResult.Size(m)
}
func (m *FontBuildBufResult) XXX_DiscardUnknown() {
	xxx_messageInfo_FontBuildBufResult.DiscardUnknown(m)
}

var xxx_messageInfo_FontBuildBufResult proto.InternalMessageInfo

func (m *FontBuildBufResult) GetFontId() uint32 {
	if m != nil {
		return m.FontId
	}
	return 0
}

func (m *FontBuildBufResult) GetFontFormatVersion() uint32 {
	if m != nil {
		return m.FontFormatVersion
	}
	return 0
}

func (m *FontBuildBufResult) GetFontChecksum() uint32 {
	if m != nil {
		return m.FontChecksum
	}
	return 0
}

func (m *FontBuildBufResult) GetNameEn() string {
	if m != nil {
		return m.NameEn
	}
	return ""
}

func (m *FontBuildBufResult) GetBytesTtf() []byte {
	if m != nil {
		return m.BytesTtf
	}
	return nil
}

func (m *FontBuildBufResult) GetBytesEot() []byte {
	if m != nil {
		return m.BytesEot
	}
	return nil
}

func (m *FontBuildBufResult) GetBytesWoff() []byte {
	if m != nil {
		return m.BytesWoff
	}
	return nil
}

type MultFontBuildBufResult struct {
	Items                []*FontBuildBufResult `protobuf:"bytes,1,rep,name=items,proto3" json:"items,omitempty" bson:"items,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-" bson:"-"`
	XXX_unrecognized     []byte                `json:"-" bson:"-"`
	XXX_sizecache        int32                 `json:"-" bson:"-"`
}

func (m *MultFontBuildBufResult) Reset()         { *m = MultFontBuildBufResult{} }
func (m *MultFontBuildBufResult) String() string { return proto.CompactTextString(m) }
func (*MultFontBuildBufResult) ProtoMessage()    {}
func (*MultFontBuildBufResult) Descriptor() ([]byte, []int) {
	return fileDescriptor_e04e5ea2200a7886, []int{5}
}

func (m *MultFontBuildBufResult) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MultFontBuildBufResult.Unmarshal(m, b)
}
func (m *MultFontBuildBufResult) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MultFontBuildBufResult.Marshal(b, m, deterministic)
}
func (m *MultFontBuildBufResult) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MultFontBuildBufResult.Merge(m, src)
}
func (m *MultFontBuildBufResult) XXX_Size() int {
	return xxx_messageInfo_MultFontBuildBufResult.Size(m)
}
func (m *MultFontBuildBufResult) XXX_DiscardUnknown() {
	xxx_messageInfo_MultFontBuildBufResult.DiscardUnknown(m)
}

var xxx_messageInfo_MultFontBuildBufResult proto.InternalMessageInfo

func (m *MultFontBuildBufResult) GetItems() []*FontBuildBufResult {
	if m != nil {
		return m.Items
	}
	return nil
}

func init() {
	proto.RegisterType((*FontListRequest)(nil), "webfontsdk.FontListRequest")
	proto.RegisterType((*FontListResult)(nil), "webfontsdk.FontListResult")
	proto.RegisterMapType((map[uint32]int64)(nil), "webfontsdk.FontListResult.FontsEntry")
	proto.RegisterType((*FontBuildRequest)(nil), "webfontsdk.FontBuildRequest")
	proto.RegisterType((*MultFontBuildRequest)(nil), "webfontsdk.MultFontBuildRequest")
	proto.RegisterType((*FontBuildBufResult)(nil), "webfontsdk.FontBuildBufResult")
	proto.RegisterType((*MultFontBuildBufResult)(nil), "webfontsdk.MultFontBuildBufResult")
}

func init() { proto.RegisterFile("webfont.proto", fileDescriptor_e04e5ea2200a7886) }

var fileDescriptor_e04e5ea2200a7886 = []byte{
	// 502 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x84, 0x94, 0xcf, 0x6e, 0xd3, 0x4c,
	0x14, 0xc5, 0x3b, 0x4d, 0xe3, 0xc4, 0xf7, 0x8b, 0x3f, 0xc2, 0x50, 0x15, 0x93, 0x02, 0xb2, 0x8c,
	0x90, 0xc2, 0xc6, 0x8b, 0xc0, 0xa2, 0x82, 0x5d, 0x50, 0x8a, 0xf8, 0xab, 0x6a, 0x84, 0xc8, 0x32,
	0x4a, 0xea, 0x6b, 0x61, 0x25, 0xf1, 0x14, 0xfb, 0xba, 0x25, 0x4f, 0xc0, 0xbb, 0xf0, 0x7c, 0x88,
	0x35, 0x9a, 0x6b, 0x27, 0x76, 0x20, 0x81, 0x9d, 0xcf, 0x3d, 0x67, 0x8e, 0x67, 0x7e, 0xce, 0x04,
	0x9c, 0x1b, 0x9c, 0x45, 0x3a, 0xa1, 0xe0, 0x2a, 0xd5, 0xa4, 0x25, 0x94, 0x32, 0x0b, 0xe7, 0xfe,
	0x13, 0xb8, 0x75, 0xae, 0x13, 0x7a, 0x17, 0x67, 0xa4, 0xf0, 0x4b, 0x8e, 0x19, 0xc9, 0x13, 0xb0,
	0xa6, 0x57, 0xf1, 0x1c, 0x57, 0xae, 0xf0, 0x44, 0xdf, 0x56, 0xa5, 0xf2, 0xbf, 0x09, 0xf8, 0xbf,
	0xca, 0x66, 0xf9, 0x82, 0xe4, 0x0b, 0x68, 0x72, 0x91, 0x2b, 0xbc, 0x46, 0xff, 0xbf, 0xc1, 0xe3,
	0xa0, 0x6a, 0x0e, 0xb6, 0xa3, 0x2c, 0xb3, 0x51, 0x42, 0xe9, 0x4a, 0x15, 0x6b, 0x7a, 0x67, 0x00,
	0xd5, 0x50, 0x76, 0xa1, 0xb1, 0x7e, 0xa5, 0xa3, 0xcc, 0xa3, 0x3c, 0x86, 0xe6, 0xf5, 0x74, 0x91,
	0xa3, 0x7b, 0xe8, 0x89, 0x7e, 0x43, 0x15, 0xe2, 0xf9, 0xe1, 0x99, 0xf0, 0xbf, 0x0b, 0xe8, 0x9a,
	0xa5, 0xc3, 0x3c, 0x5e, 0x84, 0xeb, 0x6d, 0xdf, 0x85, 0x96, 0xe9, 0x9d, 0xc4, 0x61, 0x59, 0x62,
	0x19, 0xf9, 0x3a, 0x94, 0x12, 0x8e, 0x08, 0xbf, 0x12, 0xd7, 0xd8, 0x8a, 0x9f, 0x6b, 0x67, 0x6c,
	0xd4, 0xcf, 0x28, 0xef, 0x41, 0x3b, 0x41, 0x0c, 0x27, 0x44, 0x91, 0x7b, 0xe4, 0x89, 0x7e, 0x5b,
	0xb5, 0x8c, 0xfe, 0x48, 0xd1, 0xc6, 0x42, 0x4d, 0x6e, 0xb3, 0xb2, 0x46, 0x9a, 0xe4, 0x29, 0xd8,
	0x6c, 0xdd, 0xe8, 0x28, 0x72, 0x2d, 0xf6, 0x38, 0x3b, 0xd6, 0x51, 0xe4, 0xbf, 0x81, 0xe3, 0xf7,
	0xf9, 0x82, 0xfe, 0xd8, 0xef, 0x00, 0x9a, 0x31, 0xe1, 0x72, 0xcd, 0xee, 0xfe, 0xef, 0xec, 0xea,
	0x61, 0x55, 0x44, 0xfd, 0x1f, 0x02, 0xe4, 0xc6, 0x1b, 0xe6, 0x51, 0xf9, 0x19, 0xf6, 0x1e, 0x3d,
	0x80, 0x3b, 0x6c, 0x44, 0x3a, 0x5d, 0x4e, 0x69, 0x72, 0x8d, 0x69, 0x16, 0xeb, 0x84, 0x49, 0x38,
	0xea, 0xb6, 0xb1, 0xce, 0xd9, 0xf9, 0x54, 0x18, 0xf2, 0x11, 0x38, 0x9c, 0xbf, 0xfc, 0x8c, 0x97,
	0xf3, 0x2c, 0x5f, 0x32, 0x1d, 0x47, 0x75, 0xcc, 0xf0, 0x65, 0x39, 0x33, 0x6f, 0x4b, 0xa6, 0x4b,
	0x9c, 0x60, 0xc2, 0x88, 0x6c, 0x65, 0x19, 0x39, 0x4a, 0x0c, 0x86, 0xd9, 0x8a, 0x30, 0x63, 0x7a,
	0x06, 0x51, 0x47, 0xb5, 0x79, 0x60, 0xf0, 0x6d, 0x4c, 0xc3, 0xcf, 0xaa, 0x99, 0x06, 0xe0, 0x03,
	0x80, 0xc2, 0x64, 0x82, 0x2d, 0x76, 0x8b, 0x38, 0x23, 0xfc, 0x00, 0x27, 0x5b, 0x08, 0xab, 0x93,
	0x3f, 0xdb, 0x86, 0xf8, 0x70, 0x27, 0xc4, 0x4d, 0xbc, 0xc4, 0x38, 0xf8, 0x29, 0xa0, 0xf5, 0x2a,
	0x45, 0x24, 0x4c, 0xe5, 0x5b, 0xb0, 0x39, 0x64, 0xd2, 0xf2, 0xaf, 0x1f, 0xa1, 0xf7, 0x8f, 0x76,
	0xff, 0x40, 0x8e, 0xc1, 0x31, 0x1b, 0xad, 0x0a, 0xbd, 0xfa, 0x92, 0x5d, 0x3f, 0x83, 0x9e, 0xbf,
	0x37, 0x51, 0x2f, 0x1e, 0x41, 0x7b, 0x7d, 0x9f, 0xe4, 0xe9, 0xee, 0x5b, 0x56, 0xd4, 0xf5, 0xf6,
	0x5f, 0x41, 0xff, 0x60, 0xe8, 0x43, 0x37, 0xd6, 0xc1, 0xd6, 0xbf, 0xc1, 0xb0, 0x33, 0x2e, 0xe4,
	0x85, 0x51, 0x17, 0x62, 0x66, 0xf1, 0xf8, 0xe9, 0xaf, 0x00, 0x00, 0x00, 0xff, 0xff, 0x56, 0xfa,
	0x87, 0xe1, 0x35, 0x04, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// GreeterClient is the client API for Greeter service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type GreeterClient interface {
	//单字体生成
	BuildFont(ctx context.Context, in *FontBuildRequest, opts ...grpc.CallOption) (*FontBuildBufResult, error)
	//多请求混合
	MultBuildFont(ctx context.Context, in *MultFontBuildRequest, opts ...grpc.CallOption) (*MultFontBuildBufResult, error)
	//获得字体列表
	FontList(ctx context.Context, in *FontListRequest, opts ...grpc.CallOption) (*FontListResult, error)
}

type greeterClient struct {
	cc *grpc.ClientConn
}

func NewGreeterClient(cc *grpc.ClientConn) GreeterClient {
	return &greeterClient{cc}
}

func (c *greeterClient) BuildFont(ctx context.Context, in *FontBuildRequest, opts ...grpc.CallOption) (*FontBuildBufResult, error) {
	out := new(FontBuildBufResult)
	err := c.cc.Invoke(ctx, "/webfontsdk.Greeter/BuildFont", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *greeterClient) MultBuildFont(ctx context.Context, in *MultFontBuildRequest, opts ...grpc.CallOption) (*MultFontBuildBufResult, error) {
	out := new(MultFontBuildBufResult)
	err := c.cc.Invoke(ctx, "/webfontsdk.Greeter/MultBuildFont", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *greeterClient) FontList(ctx context.Context, in *FontListRequest, opts ...grpc.CallOption) (*FontListResult, error) {
	out := new(FontListResult)
	err := c.cc.Invoke(ctx, "/webfontsdk.Greeter/FontList", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// GreeterServer is the server API for Greeter service.
type GreeterServer interface {
	//单字体生成
	BuildFont(context.Context, *FontBuildRequest) (*FontBuildBufResult, error)
	//多请求混合
	MultBuildFont(context.Context, *MultFontBuildRequest) (*MultFontBuildBufResult, error)
	//获得字体列表
	FontList(context.Context, *FontListRequest) (*FontListResult, error)
}

func RegisterGreeterServer(s *grpc.Server, srv GreeterServer) {
	s.RegisterService(&_Greeter_serviceDesc, srv)
}

func _Greeter_BuildFont_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FontBuildRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GreeterServer).BuildFont(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/webfontsdk.Greeter/BuildFont",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GreeterServer).BuildFont(ctx, req.(*FontBuildRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Greeter_MultBuildFont_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(MultFontBuildRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GreeterServer).MultBuildFont(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/webfontsdk.Greeter/MultBuildFont",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GreeterServer).MultBuildFont(ctx, req.(*MultFontBuildRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Greeter_FontList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FontListRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GreeterServer).FontList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/webfontsdk.Greeter/FontList",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GreeterServer).FontList(ctx, req.(*FontListRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Greeter_serviceDesc = grpc.ServiceDesc{
	ServiceName: "webfontsdk.Greeter",
	HandlerType: (*GreeterServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "BuildFont",
			Handler:    _Greeter_BuildFont_Handler,
		},
		{
			MethodName: "MultBuildFont",
			Handler:    _Greeter_MultBuildFont_Handler,
		},
		{
			MethodName: "FontList",
			Handler:    _Greeter_FontList_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "webfont.proto",
}
