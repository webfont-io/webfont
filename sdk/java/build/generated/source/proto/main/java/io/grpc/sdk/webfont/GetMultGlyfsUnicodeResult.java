// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * Protobuf type {@code webfontsdk.GetMultGlyfsUnicodeResult}
 */
public  final class GetMultGlyfsUnicodeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:webfontsdk.GetMultGlyfsUnicodeResult)
    GetMultGlyfsUnicodeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMultGlyfsUnicodeResult.newBuilder() to construct.
  private GetMultGlyfsUnicodeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMultGlyfsUnicodeResult() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetMultGlyfsUnicodeResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              unicodes_ = com.google.protobuf.MapField.newMapField(
                  UnicodesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, io.grpc.sdk.webfont.indexs>
            unicodes__ = input.readMessage(
                UnicodesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            unicodes_.getMutableMap().put(
                unicodes__.getKey(), unicodes__.getValue());
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              indexs_ = com.google.protobuf.MapField.newMapField(
                  IndexsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, com.google.protobuf.ByteString>
            indexs__ = input.readMessage(
                IndexsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            indexs_.getMutableMap().put(
                indexs__.getKey(), indexs__.getValue());
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetUnicodes();
      case 3:
        return internalGetIndexs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.class, io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.Builder.class);
  }

  public static final int UNICODES_FIELD_NUMBER = 1;
  private static final class UnicodesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, io.grpc.sdk.webfont.indexs> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, io.grpc.sdk.webfont.indexs>newDefaultInstance(
                io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_UnicodesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.grpc.sdk.webfont.indexs.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, io.grpc.sdk.webfont.indexs> unicodes_;
  private com.google.protobuf.MapField<java.lang.Integer, io.grpc.sdk.webfont.indexs>
  internalGetUnicodes() {
    if (unicodes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UnicodesDefaultEntryHolder.defaultEntry);
    }
    return unicodes_;
  }

  public int getUnicodesCount() {
    return internalGetUnicodes().getMap().size();
  }
  /**
   * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
   */

  public boolean containsUnicodes(
      int key) {
    
    return internalGetUnicodes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getUnicodesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> getUnicodes() {
    return getUnicodesMap();
  }
  /**
   * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
   */

  public java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> getUnicodesMap() {
    return internalGetUnicodes().getMap();
  }
  /**
   * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
   */

  public io.grpc.sdk.webfont.indexs getUnicodesOrDefault(
      int key,
      io.grpc.sdk.webfont.indexs defaultValue) {
    
    java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> map =
        internalGetUnicodes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
   */

  public io.grpc.sdk.webfont.indexs getUnicodesOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> map =
        internalGetUnicodes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int INDEXS_FIELD_NUMBER = 3;
  private static final class IndexsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, com.google.protobuf.ByteString>newDefaultInstance(
                io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_IndexsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, com.google.protobuf.ByteString> indexs_;
  private com.google.protobuf.MapField<java.lang.Integer, com.google.protobuf.ByteString>
  internalGetIndexs() {
    if (indexs_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          IndexsDefaultEntryHolder.defaultEntry);
    }
    return indexs_;
  }

  public int getIndexsCount() {
    return internalGetIndexs().getMap().size();
  }
  /**
   * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
   */

  public boolean containsIndexs(
      int key) {
    
    return internalGetIndexs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getIndexsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> getIndexs() {
    return getIndexsMap();
  }
  /**
   * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
   */

  public java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> getIndexsMap() {
    return internalGetIndexs().getMap();
  }
  /**
   * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
   */

  public com.google.protobuf.ByteString getIndexsOrDefault(
      int key,
      com.google.protobuf.ByteString defaultValue) {
    
    java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> map =
        internalGetIndexs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
   */

  public com.google.protobuf.ByteString getIndexsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> map =
        internalGetIndexs().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetUnicodes(),
        UnicodesDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetIndexs(),
        IndexsDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, io.grpc.sdk.webfont.indexs> entry
         : internalGetUnicodes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, io.grpc.sdk.webfont.indexs>
      unicodes__ = UnicodesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, unicodes__);
    }
    for (java.util.Map.Entry<java.lang.Integer, com.google.protobuf.ByteString> entry
         : internalGetIndexs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, com.google.protobuf.ByteString>
      indexs__ = IndexsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, indexs__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult)) {
      return super.equals(obj);
    }
    io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult other = (io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult) obj;

    boolean result = true;
    result = result && internalGetUnicodes().equals(
        other.internalGetUnicodes());
    result = result && internalGetIndexs().equals(
        other.internalGetIndexs());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetUnicodes().getMap().isEmpty()) {
      hash = (37 * hash) + UNICODES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUnicodes().hashCode();
    }
    if (!internalGetIndexs().getMap().isEmpty()) {
      hash = (37 * hash) + INDEXS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetIndexs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code webfontsdk.GetMultGlyfsUnicodeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webfontsdk.GetMultGlyfsUnicodeResult)
      io.grpc.sdk.webfont.GetMultGlyfsUnicodeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetUnicodes();
        case 3:
          return internalGetIndexs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableUnicodes();
        case 3:
          return internalGetMutableIndexs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.class, io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.Builder.class);
    }

    // Construct using io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableUnicodes().clear();
      internalGetMutableIndexs().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetMultGlyfsUnicodeResult_descriptor;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult getDefaultInstanceForType() {
      return io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult build() {
      io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult buildPartial() {
      io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult result = new io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult(this);
      int from_bitField0_ = bitField0_;
      result.unicodes_ = internalGetUnicodes();
      result.unicodes_.makeImmutable();
      result.indexs_ = internalGetIndexs();
      result.indexs_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult) {
        return mergeFrom((io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult other) {
      if (other == io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult.getDefaultInstance()) return this;
      internalGetMutableUnicodes().mergeFrom(
          other.internalGetUnicodes());
      internalGetMutableIndexs().mergeFrom(
          other.internalGetIndexs());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, io.grpc.sdk.webfont.indexs> unicodes_;
    private com.google.protobuf.MapField<java.lang.Integer, io.grpc.sdk.webfont.indexs>
    internalGetUnicodes() {
      if (unicodes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UnicodesDefaultEntryHolder.defaultEntry);
      }
      return unicodes_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, io.grpc.sdk.webfont.indexs>
    internalGetMutableUnicodes() {
      onChanged();;
      if (unicodes_ == null) {
        unicodes_ = com.google.protobuf.MapField.newMapField(
            UnicodesDefaultEntryHolder.defaultEntry);
      }
      if (!unicodes_.isMutable()) {
        unicodes_ = unicodes_.copy();
      }
      return unicodes_;
    }

    public int getUnicodesCount() {
      return internalGetUnicodes().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */

    public boolean containsUnicodes(
        int key) {
      
      return internalGetUnicodes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUnicodesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> getUnicodes() {
      return getUnicodesMap();
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */

    public java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> getUnicodesMap() {
      return internalGetUnicodes().getMap();
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */

    public io.grpc.sdk.webfont.indexs getUnicodesOrDefault(
        int key,
        io.grpc.sdk.webfont.indexs defaultValue) {
      
      java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> map =
          internalGetUnicodes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */

    public io.grpc.sdk.webfont.indexs getUnicodesOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> map =
          internalGetUnicodes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUnicodes() {
      internalGetMutableUnicodes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */

    public Builder removeUnicodes(
        int key) {
      
      internalGetMutableUnicodes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs>
    getMutableUnicodes() {
      return internalGetMutableUnicodes().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */
    public Builder putUnicodes(
        int key,
        io.grpc.sdk.webfont.indexs value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableUnicodes().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;uint32, .webfontsdk.indexs&gt; unicodes = 1;</code>
     */

    public Builder putAllUnicodes(
        java.util.Map<java.lang.Integer, io.grpc.sdk.webfont.indexs> values) {
      internalGetMutableUnicodes().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, com.google.protobuf.ByteString> indexs_;
    private com.google.protobuf.MapField<java.lang.Integer, com.google.protobuf.ByteString>
    internalGetIndexs() {
      if (indexs_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            IndexsDefaultEntryHolder.defaultEntry);
      }
      return indexs_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, com.google.protobuf.ByteString>
    internalGetMutableIndexs() {
      onChanged();;
      if (indexs_ == null) {
        indexs_ = com.google.protobuf.MapField.newMapField(
            IndexsDefaultEntryHolder.defaultEntry);
      }
      if (!indexs_.isMutable()) {
        indexs_ = indexs_.copy();
      }
      return indexs_;
    }

    public int getIndexsCount() {
      return internalGetIndexs().getMap().size();
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */

    public boolean containsIndexs(
        int key) {
      
      return internalGetIndexs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getIndexsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> getIndexs() {
      return getIndexsMap();
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */

    public java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> getIndexsMap() {
      return internalGetIndexs().getMap();
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */

    public com.google.protobuf.ByteString getIndexsOrDefault(
        int key,
        com.google.protobuf.ByteString defaultValue) {
      
      java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> map =
          internalGetIndexs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */

    public com.google.protobuf.ByteString getIndexsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> map =
          internalGetIndexs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearIndexs() {
      internalGetMutableIndexs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */

    public Builder removeIndexs(
        int key) {
      
      internalGetMutableIndexs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.google.protobuf.ByteString>
    getMutableIndexs() {
      return internalGetMutableIndexs().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */
    public Builder putIndexs(
        int key,
        com.google.protobuf.ByteString value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableIndexs().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;uint32, bytes&gt; indexs = 3;</code>
     */

    public Builder putAllIndexs(
        java.util.Map<java.lang.Integer, com.google.protobuf.ByteString> values) {
      internalGetMutableIndexs().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:webfontsdk.GetMultGlyfsUnicodeResult)
  }

  // @@protoc_insertion_point(class_scope:webfontsdk.GetMultGlyfsUnicodeResult)
  private static final io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult();
  }

  public static io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMultGlyfsUnicodeResult>
      PARSER = new com.google.protobuf.AbstractParser<GetMultGlyfsUnicodeResult>() {
    @java.lang.Override
    public GetMultGlyfsUnicodeResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetMultGlyfsUnicodeResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetMultGlyfsUnicodeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMultGlyfsUnicodeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.sdk.webfont.GetMultGlyfsUnicodeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

