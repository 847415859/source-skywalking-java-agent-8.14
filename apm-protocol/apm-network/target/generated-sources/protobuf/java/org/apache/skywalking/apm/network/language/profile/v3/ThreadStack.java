// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile/Profile.proto

package org.apache.skywalking.apm.network.language.profile.v3;

/**
 * Protobuf type {@code skywalking.v3.ThreadStack}
 */
public final class ThreadStack extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.ThreadStack)
    ThreadStackOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreadStack.newBuilder() to construct.
  private ThreadStack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreadStack() {
    codeSignatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreadStack();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadStack_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadStack_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.class, org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder.class);
  }

  public static final int CODESIGNATURES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList codeSignatures_;
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @return A list containing the codeSignatures.
   */
  public com.google.protobuf.ProtocolStringList
      getCodeSignaturesList() {
    return codeSignatures_;
  }
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @return The count of codeSignatures.
   */
  public int getCodeSignaturesCount() {
    return codeSignatures_.size();
  }
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @param index The index of the element to return.
   * @return The codeSignatures at the given index.
   */
  public java.lang.String getCodeSignatures(int index) {
    return codeSignatures_.get(index);
  }
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the codeSignatures at the given index.
   */
  public com.google.protobuf.ByteString
      getCodeSignaturesBytes(int index) {
    return codeSignatures_.getByteString(index);
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
    for (int i = 0; i < codeSignatures_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codeSignatures_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < codeSignatures_.size(); i++) {
        dataSize += computeStringSizeNoTag(codeSignatures_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCodeSignaturesList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.skywalking.apm.network.language.profile.v3.ThreadStack)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.profile.v3.ThreadStack other = (org.apache.skywalking.apm.network.language.profile.v3.ThreadStack) obj;

    if (!getCodeSignaturesList()
        .equals(other.getCodeSignaturesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCodeSignaturesCount() > 0) {
      hash = (37 * hash) + CODESIGNATURES_FIELD_NUMBER;
      hash = (53 * hash) + getCodeSignaturesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.profile.v3.ThreadStack prototype) {
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
   * Protobuf type {@code skywalking.v3.ThreadStack}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.ThreadStack)
      org.apache.skywalking.apm.network.language.profile.v3.ThreadStackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadStack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadStack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.class, org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      codeSignatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadStack_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack build() {
      org.apache.skywalking.apm.network.language.profile.v3.ThreadStack result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack buildPartial() {
      org.apache.skywalking.apm.network.language.profile.v3.ThreadStack result = new org.apache.skywalking.apm.network.language.profile.v3.ThreadStack(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        codeSignatures_ = codeSignatures_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.codeSignatures_ = codeSignatures_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.skywalking.apm.network.language.profile.v3.ThreadStack) {
        return mergeFrom((org.apache.skywalking.apm.network.language.profile.v3.ThreadStack)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.profile.v3.ThreadStack other) {
      if (other == org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.getDefaultInstance()) return this;
      if (!other.codeSignatures_.isEmpty()) {
        if (codeSignatures_.isEmpty()) {
          codeSignatures_ = other.codeSignatures_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCodeSignaturesIsMutable();
          codeSignatures_.addAll(other.codeSignatures_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureCodeSignaturesIsMutable();
              codeSignatures_.add(s);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList codeSignatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCodeSignaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        codeSignatures_ = new com.google.protobuf.LazyStringArrayList(codeSignatures_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @return A list containing the codeSignatures.
     */
    public com.google.protobuf.ProtocolStringList
        getCodeSignaturesList() {
      return codeSignatures_.getUnmodifiableView();
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @return The count of codeSignatures.
     */
    public int getCodeSignaturesCount() {
      return codeSignatures_.size();
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @param index The index of the element to return.
     * @return The codeSignatures at the given index.
     */
    public java.lang.String getCodeSignatures(int index) {
      return codeSignatures_.get(index);
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the codeSignatures at the given index.
     */
    public com.google.protobuf.ByteString
        getCodeSignaturesBytes(int index) {
      return codeSignatures_.getByteString(index);
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @param index The index to set the value at.
     * @param value The codeSignatures to set.
     * @return This builder for chaining.
     */
    public Builder setCodeSignatures(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCodeSignaturesIsMutable();
      codeSignatures_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @param value The codeSignatures to add.
     * @return This builder for chaining.
     */
    public Builder addCodeSignatures(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCodeSignaturesIsMutable();
      codeSignatures_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @param values The codeSignatures to add.
     * @return This builder for chaining.
     */
    public Builder addAllCodeSignatures(
        java.lang.Iterable<java.lang.String> values) {
      ensureCodeSignaturesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, codeSignatures_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodeSignatures() {
      codeSignatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * stack code signature list
     * </pre>
     *
     * <code>repeated string codeSignatures = 1;</code>
     * @param value The bytes of the codeSignatures to add.
     * @return This builder for chaining.
     */
    public Builder addCodeSignaturesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCodeSignaturesIsMutable();
      codeSignatures_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:skywalking.v3.ThreadStack)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.ThreadStack)
  private static final org.apache.skywalking.apm.network.language.profile.v3.ThreadStack DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.profile.v3.ThreadStack();
  }

  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadStack getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreadStack>
      PARSER = new com.google.protobuf.AbstractParser<ThreadStack>() {
    @java.lang.Override
    public ThreadStack parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ThreadStack> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreadStack> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

