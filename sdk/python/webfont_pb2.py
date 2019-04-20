# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='webfont.proto',
  package='webfontsdk',
  syntax='proto3',
  serialized_options=_b('\n\023io.grpc.sdk.webfontB\014WebfontProtoP\001'),
  serialized_pb=_b('\n\rwebfont.proto\x12\nwebfontsdk\"!\n\x0f\x46ontListRequest\x12\x0e\n\x06\x61pikey\x18\x01 \x01(\t\"t\n\x0e\x46ontListResult\x12\x34\n\x05\x66onts\x18\x01 \x03(\x0b\x32%.webfontsdk.FontListResult.FontsEntry\x1a,\n\nFontsEntry\x12\x0b\n\x03key\x18\x01 \x01(\r\x12\r\n\x05value\x18\x02 \x01(\x03:\x02\x38\x01\"\x8c\x01\n\x10\x46ontBuildRequest\x12\x0e\n\x06\x61pikey\x18\x01 \x01(\t\x12\x0f\n\x07\x66ont_id\x18\x02 \x01(\r\x12\x0c\n\x04text\x18\x03 \x01(\t\x12\x10\n\x08need_ttf\x18\x04 \x01(\x08\x12\x10\n\x08need_eot\x18\x05 \x01(\x08\x12\x11\n\tneed_woff\x18\x06 \x01(\x08\x12\x12\n\nneed_woff2\x18\x07 \x01(\x08\"C\n\x14MultFontBuildRequest\x12+\n\x05items\x18\x01 \x03(\x0b\x32\x1c.webfontsdk.FontBuildRequest\"\xb9\x01\n\x12\x46ontBuildBufResult\x12\x0f\n\x07\x66ont_id\x18\x01 \x01(\r\x12\x1b\n\x13\x66ont_format_version\x18\x02 \x01(\r\x12\x15\n\rfont_checksum\x18\x03 \x01(\r\x12\x0f\n\x07name_en\x18\x04 \x01(\t\x12\x11\n\tbytes_ttf\x18\x05 \x01(\x0c\x12\x11\n\tbytes_eot\x18\x06 \x01(\x0c\x12\x12\n\nbytes_woff\x18\x07 \x01(\x0c\x12\x13\n\x0b\x62ytes_woff2\x18\x08 \x01(\x0c\"G\n\x16MultFontBuildBufResult\x12-\n\x05items\x18\x01 \x03(\x0b\x32\x1e.webfontsdk.FontBuildBufResult\">\n\x1bGetProfileWithoutMapRequest\x12\x0e\n\x06\x61pikey\x18\x01 \x01(\t\x12\x0f\n\x07\x66ont_id\x18\x02 \x01(\r\";\n\x1aGetProfileWithoutMapResult\x12\x0f\n\x07\x66ont_id\x18\x01 \x01(\r\x12\x0c\n\x04\x64\x61ta\x18\x02 \x01(\x0c\"2\n\x13GetGlyfsIndexResult\x12\r\n\x05index\x18\x01 \x01(\r\x12\x0c\n\x04\x64\x61ta\x18\x02 \x01(\x0c\"X\n\x15GetGlyfsUnicodeResult\x12\x0f\n\x07unicode\x18\x01 \x01(\r\x12.\n\x05\x64\x61tas\x18\x02 \x03(\x0b\x32\x1f.webfontsdk.GetGlyfsIndexResult\"f\n\x1aGetMultGlyfsUnicodeRequest\x12\x0e\n\x06\x61pikey\x18\x01 \x01(\t\x12\x0f\n\x07\x66ont_id\x18\x02 \x01(\r\x12\x15\n\rfont_checksum\x18\x03 \x01(\r\x12\x10\n\x08unicodes\x18\x04 \x03(\r\"M\n\x19GetMultGlyfsUnicodeResult\x12\x30\n\x05items\x18\x01 \x03(\x0b\x32!.webfontsdk.GetGlyfsUnicodeResult2\xc9\x03\n\x07Greeter\x12K\n\tBuildFont\x12\x1c.webfontsdk.FontBuildRequest\x1a\x1e.webfontsdk.FontBuildBufResult\"\x00\x12W\n\rMultBuildFont\x12 .webfontsdk.MultFontBuildRequest\x1a\".webfontsdk.MultFontBuildBufResult\"\x00\x12\x45\n\x08\x46ontList\x12\x1b.webfontsdk.FontListRequest\x1a\x1a.webfontsdk.FontListResult\"\x00\x12i\n\x14GetProfileWithoutMap\x12\'.webfontsdk.GetProfileWithoutMapRequest\x1a&.webfontsdk.GetProfileWithoutMapResult\"\x00\x12\x66\n\x13GetMultGlyfsUnicode\x12&.webfontsdk.GetMultGlyfsUnicodeRequest\x1a%.webfontsdk.GetMultGlyfsUnicodeResult\"\x00\x42%\n\x13io.grpc.sdk.webfontB\x0cWebfontProtoP\x01\x62\x06proto3')
)




_FONTLISTREQUEST = _descriptor.Descriptor(
  name='FontListRequest',
  full_name='webfontsdk.FontListRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='apikey', full_name='webfontsdk.FontListRequest.apikey', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=29,
  serialized_end=62,
)


_FONTLISTRESULT_FONTSENTRY = _descriptor.Descriptor(
  name='FontsEntry',
  full_name='webfontsdk.FontListResult.FontsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='webfontsdk.FontListResult.FontsEntry.key', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='webfontsdk.FontListResult.FontsEntry.value', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('8\001'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=136,
  serialized_end=180,
)

_FONTLISTRESULT = _descriptor.Descriptor(
  name='FontListResult',
  full_name='webfontsdk.FontListResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='fonts', full_name='webfontsdk.FontListResult.fonts', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_FONTLISTRESULT_FONTSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=64,
  serialized_end=180,
)


_FONTBUILDREQUEST = _descriptor.Descriptor(
  name='FontBuildRequest',
  full_name='webfontsdk.FontBuildRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='apikey', full_name='webfontsdk.FontBuildRequest.apikey', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='font_id', full_name='webfontsdk.FontBuildRequest.font_id', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='text', full_name='webfontsdk.FontBuildRequest.text', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='need_ttf', full_name='webfontsdk.FontBuildRequest.need_ttf', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='need_eot', full_name='webfontsdk.FontBuildRequest.need_eot', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='need_woff', full_name='webfontsdk.FontBuildRequest.need_woff', index=5,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='need_woff2', full_name='webfontsdk.FontBuildRequest.need_woff2', index=6,
      number=7, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=183,
  serialized_end=323,
)


_MULTFONTBUILDREQUEST = _descriptor.Descriptor(
  name='MultFontBuildRequest',
  full_name='webfontsdk.MultFontBuildRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='items', full_name='webfontsdk.MultFontBuildRequest.items', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=325,
  serialized_end=392,
)


_FONTBUILDBUFRESULT = _descriptor.Descriptor(
  name='FontBuildBufResult',
  full_name='webfontsdk.FontBuildBufResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='font_id', full_name='webfontsdk.FontBuildBufResult.font_id', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='font_format_version', full_name='webfontsdk.FontBuildBufResult.font_format_version', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='font_checksum', full_name='webfontsdk.FontBuildBufResult.font_checksum', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name_en', full_name='webfontsdk.FontBuildBufResult.name_en', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='bytes_ttf', full_name='webfontsdk.FontBuildBufResult.bytes_ttf', index=4,
      number=5, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='bytes_eot', full_name='webfontsdk.FontBuildBufResult.bytes_eot', index=5,
      number=6, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='bytes_woff', full_name='webfontsdk.FontBuildBufResult.bytes_woff', index=6,
      number=7, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='bytes_woff2', full_name='webfontsdk.FontBuildBufResult.bytes_woff2', index=7,
      number=8, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=395,
  serialized_end=580,
)


_MULTFONTBUILDBUFRESULT = _descriptor.Descriptor(
  name='MultFontBuildBufResult',
  full_name='webfontsdk.MultFontBuildBufResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='items', full_name='webfontsdk.MultFontBuildBufResult.items', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=582,
  serialized_end=653,
)


_GETPROFILEWITHOUTMAPREQUEST = _descriptor.Descriptor(
  name='GetProfileWithoutMapRequest',
  full_name='webfontsdk.GetProfileWithoutMapRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='apikey', full_name='webfontsdk.GetProfileWithoutMapRequest.apikey', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='font_id', full_name='webfontsdk.GetProfileWithoutMapRequest.font_id', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=655,
  serialized_end=717,
)


_GETPROFILEWITHOUTMAPRESULT = _descriptor.Descriptor(
  name='GetProfileWithoutMapResult',
  full_name='webfontsdk.GetProfileWithoutMapResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='font_id', full_name='webfontsdk.GetProfileWithoutMapResult.font_id', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='data', full_name='webfontsdk.GetProfileWithoutMapResult.data', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=719,
  serialized_end=778,
)


_GETGLYFSINDEXRESULT = _descriptor.Descriptor(
  name='GetGlyfsIndexResult',
  full_name='webfontsdk.GetGlyfsIndexResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='index', full_name='webfontsdk.GetGlyfsIndexResult.index', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='data', full_name='webfontsdk.GetGlyfsIndexResult.data', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=780,
  serialized_end=830,
)


_GETGLYFSUNICODERESULT = _descriptor.Descriptor(
  name='GetGlyfsUnicodeResult',
  full_name='webfontsdk.GetGlyfsUnicodeResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='unicode', full_name='webfontsdk.GetGlyfsUnicodeResult.unicode', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='datas', full_name='webfontsdk.GetGlyfsUnicodeResult.datas', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=832,
  serialized_end=920,
)


_GETMULTGLYFSUNICODEREQUEST = _descriptor.Descriptor(
  name='GetMultGlyfsUnicodeRequest',
  full_name='webfontsdk.GetMultGlyfsUnicodeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='apikey', full_name='webfontsdk.GetMultGlyfsUnicodeRequest.apikey', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='font_id', full_name='webfontsdk.GetMultGlyfsUnicodeRequest.font_id', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='font_checksum', full_name='webfontsdk.GetMultGlyfsUnicodeRequest.font_checksum', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='unicodes', full_name='webfontsdk.GetMultGlyfsUnicodeRequest.unicodes', index=3,
      number=4, type=13, cpp_type=3, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=922,
  serialized_end=1024,
)


_GETMULTGLYFSUNICODERESULT = _descriptor.Descriptor(
  name='GetMultGlyfsUnicodeResult',
  full_name='webfontsdk.GetMultGlyfsUnicodeResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='items', full_name='webfontsdk.GetMultGlyfsUnicodeResult.items', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1026,
  serialized_end=1103,
)

_FONTLISTRESULT_FONTSENTRY.containing_type = _FONTLISTRESULT
_FONTLISTRESULT.fields_by_name['fonts'].message_type = _FONTLISTRESULT_FONTSENTRY
_MULTFONTBUILDREQUEST.fields_by_name['items'].message_type = _FONTBUILDREQUEST
_MULTFONTBUILDBUFRESULT.fields_by_name['items'].message_type = _FONTBUILDBUFRESULT
_GETGLYFSUNICODERESULT.fields_by_name['datas'].message_type = _GETGLYFSINDEXRESULT
_GETMULTGLYFSUNICODERESULT.fields_by_name['items'].message_type = _GETGLYFSUNICODERESULT
DESCRIPTOR.message_types_by_name['FontListRequest'] = _FONTLISTREQUEST
DESCRIPTOR.message_types_by_name['FontListResult'] = _FONTLISTRESULT
DESCRIPTOR.message_types_by_name['FontBuildRequest'] = _FONTBUILDREQUEST
DESCRIPTOR.message_types_by_name['MultFontBuildRequest'] = _MULTFONTBUILDREQUEST
DESCRIPTOR.message_types_by_name['FontBuildBufResult'] = _FONTBUILDBUFRESULT
DESCRIPTOR.message_types_by_name['MultFontBuildBufResult'] = _MULTFONTBUILDBUFRESULT
DESCRIPTOR.message_types_by_name['GetProfileWithoutMapRequest'] = _GETPROFILEWITHOUTMAPREQUEST
DESCRIPTOR.message_types_by_name['GetProfileWithoutMapResult'] = _GETPROFILEWITHOUTMAPRESULT
DESCRIPTOR.message_types_by_name['GetGlyfsIndexResult'] = _GETGLYFSINDEXRESULT
DESCRIPTOR.message_types_by_name['GetGlyfsUnicodeResult'] = _GETGLYFSUNICODERESULT
DESCRIPTOR.message_types_by_name['GetMultGlyfsUnicodeRequest'] = _GETMULTGLYFSUNICODEREQUEST
DESCRIPTOR.message_types_by_name['GetMultGlyfsUnicodeResult'] = _GETMULTGLYFSUNICODERESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FontListRequest = _reflection.GeneratedProtocolMessageType('FontListRequest', (_message.Message,), dict(
  DESCRIPTOR = _FONTLISTREQUEST,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.FontListRequest)
  ))
_sym_db.RegisterMessage(FontListRequest)

FontListResult = _reflection.GeneratedProtocolMessageType('FontListResult', (_message.Message,), dict(

  FontsEntry = _reflection.GeneratedProtocolMessageType('FontsEntry', (_message.Message,), dict(
    DESCRIPTOR = _FONTLISTRESULT_FONTSENTRY,
    __module__ = 'webfont_pb2'
    # @@protoc_insertion_point(class_scope:webfontsdk.FontListResult.FontsEntry)
    ))
  ,
  DESCRIPTOR = _FONTLISTRESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.FontListResult)
  ))
_sym_db.RegisterMessage(FontListResult)
_sym_db.RegisterMessage(FontListResult.FontsEntry)

FontBuildRequest = _reflection.GeneratedProtocolMessageType('FontBuildRequest', (_message.Message,), dict(
  DESCRIPTOR = _FONTBUILDREQUEST,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.FontBuildRequest)
  ))
_sym_db.RegisterMessage(FontBuildRequest)

MultFontBuildRequest = _reflection.GeneratedProtocolMessageType('MultFontBuildRequest', (_message.Message,), dict(
  DESCRIPTOR = _MULTFONTBUILDREQUEST,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.MultFontBuildRequest)
  ))
_sym_db.RegisterMessage(MultFontBuildRequest)

FontBuildBufResult = _reflection.GeneratedProtocolMessageType('FontBuildBufResult', (_message.Message,), dict(
  DESCRIPTOR = _FONTBUILDBUFRESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.FontBuildBufResult)
  ))
_sym_db.RegisterMessage(FontBuildBufResult)

MultFontBuildBufResult = _reflection.GeneratedProtocolMessageType('MultFontBuildBufResult', (_message.Message,), dict(
  DESCRIPTOR = _MULTFONTBUILDBUFRESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.MultFontBuildBufResult)
  ))
_sym_db.RegisterMessage(MultFontBuildBufResult)

GetProfileWithoutMapRequest = _reflection.GeneratedProtocolMessageType('GetProfileWithoutMapRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETPROFILEWITHOUTMAPREQUEST,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.GetProfileWithoutMapRequest)
  ))
_sym_db.RegisterMessage(GetProfileWithoutMapRequest)

GetProfileWithoutMapResult = _reflection.GeneratedProtocolMessageType('GetProfileWithoutMapResult', (_message.Message,), dict(
  DESCRIPTOR = _GETPROFILEWITHOUTMAPRESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.GetProfileWithoutMapResult)
  ))
_sym_db.RegisterMessage(GetProfileWithoutMapResult)

GetGlyfsIndexResult = _reflection.GeneratedProtocolMessageType('GetGlyfsIndexResult', (_message.Message,), dict(
  DESCRIPTOR = _GETGLYFSINDEXRESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.GetGlyfsIndexResult)
  ))
_sym_db.RegisterMessage(GetGlyfsIndexResult)

GetGlyfsUnicodeResult = _reflection.GeneratedProtocolMessageType('GetGlyfsUnicodeResult', (_message.Message,), dict(
  DESCRIPTOR = _GETGLYFSUNICODERESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.GetGlyfsUnicodeResult)
  ))
_sym_db.RegisterMessage(GetGlyfsUnicodeResult)

GetMultGlyfsUnicodeRequest = _reflection.GeneratedProtocolMessageType('GetMultGlyfsUnicodeRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETMULTGLYFSUNICODEREQUEST,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.GetMultGlyfsUnicodeRequest)
  ))
_sym_db.RegisterMessage(GetMultGlyfsUnicodeRequest)

GetMultGlyfsUnicodeResult = _reflection.GeneratedProtocolMessageType('GetMultGlyfsUnicodeResult', (_message.Message,), dict(
  DESCRIPTOR = _GETMULTGLYFSUNICODERESULT,
  __module__ = 'webfont_pb2'
  # @@protoc_insertion_point(class_scope:webfontsdk.GetMultGlyfsUnicodeResult)
  ))
_sym_db.RegisterMessage(GetMultGlyfsUnicodeResult)


DESCRIPTOR._options = None
_FONTLISTRESULT_FONTSENTRY._options = None

_GREETER = _descriptor.ServiceDescriptor(
  name='Greeter',
  full_name='webfontsdk.Greeter',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1106,
  serialized_end=1563,
  methods=[
  _descriptor.MethodDescriptor(
    name='BuildFont',
    full_name='webfontsdk.Greeter.BuildFont',
    index=0,
    containing_service=None,
    input_type=_FONTBUILDREQUEST,
    output_type=_FONTBUILDBUFRESULT,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='MultBuildFont',
    full_name='webfontsdk.Greeter.MultBuildFont',
    index=1,
    containing_service=None,
    input_type=_MULTFONTBUILDREQUEST,
    output_type=_MULTFONTBUILDBUFRESULT,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='FontList',
    full_name='webfontsdk.Greeter.FontList',
    index=2,
    containing_service=None,
    input_type=_FONTLISTREQUEST,
    output_type=_FONTLISTRESULT,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetProfileWithoutMap',
    full_name='webfontsdk.Greeter.GetProfileWithoutMap',
    index=3,
    containing_service=None,
    input_type=_GETPROFILEWITHOUTMAPREQUEST,
    output_type=_GETPROFILEWITHOUTMAPRESULT,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetMultGlyfsUnicode',
    full_name='webfontsdk.Greeter.GetMultGlyfsUnicode',
    index=4,
    containing_service=None,
    input_type=_GETMULTGLYFSUNICODEREQUEST,
    output_type=_GETMULTGLYFSUNICODERESULT,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_GREETER)

DESCRIPTOR.services_by_name['Greeter'] = _GREETER

# @@protoc_insertion_point(module_scope)
