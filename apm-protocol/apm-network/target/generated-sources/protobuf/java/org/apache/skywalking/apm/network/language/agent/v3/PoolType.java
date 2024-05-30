// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * Protobuf enum {@code skywalking.v3.PoolType}
 */
public enum PoolType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CODE_CACHE_USAGE = 0;</code>
   */
  CODE_CACHE_USAGE(0),
  /**
   * <code>NEWGEN_USAGE = 1;</code>
   */
  NEWGEN_USAGE(1),
  /**
   * <code>OLDGEN_USAGE = 2;</code>
   */
  OLDGEN_USAGE(2),
  /**
   * <code>SURVIVOR_USAGE = 3;</code>
   */
  SURVIVOR_USAGE(3),
  /**
   * <code>PERMGEN_USAGE = 4;</code>
   */
  PERMGEN_USAGE(4),
  /**
   * <code>METASPACE_USAGE = 5;</code>
   */
  METASPACE_USAGE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CODE_CACHE_USAGE = 0;</code>
   */
  public static final int CODE_CACHE_USAGE_VALUE = 0;
  /**
   * <code>NEWGEN_USAGE = 1;</code>
   */
  public static final int NEWGEN_USAGE_VALUE = 1;
  /**
   * <code>OLDGEN_USAGE = 2;</code>
   */
  public static final int OLDGEN_USAGE_VALUE = 2;
  /**
   * <code>SURVIVOR_USAGE = 3;</code>
   */
  public static final int SURVIVOR_USAGE_VALUE = 3;
  /**
   * <code>PERMGEN_USAGE = 4;</code>
   */
  public static final int PERMGEN_USAGE_VALUE = 4;
  /**
   * <code>METASPACE_USAGE = 5;</code>
   */
  public static final int METASPACE_USAGE_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PoolType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoolType forNumber(int value) {
    switch (value) {
      case 0: return CODE_CACHE_USAGE;
      case 1: return NEWGEN_USAGE;
      case 2: return OLDGEN_USAGE;
      case 3: return SURVIVOR_USAGE;
      case 4: return PERMGEN_USAGE;
      case 5: return METASPACE_USAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoolType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoolType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoolType>() {
          public PoolType findValueByNumber(int number) {
            return PoolType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PoolType[] VALUES = values();

  public static PoolType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PoolType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:skywalking.v3.PoolType)
}

