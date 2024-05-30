// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/Tracing.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public final class Tracing {
  private Tracing() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SegmentObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SegmentObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SegmentReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SegmentReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SpanObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SpanObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_Log_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_Log_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_ID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_ID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SegmentCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SegmentCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034language-agent/Tracing.proto\022\rskywalki" +
      "ng.v3\032\023common/Common.proto\"\243\001\n\rSegmentOb" +
      "ject\022\017\n\007traceId\030\001 \001(\t\022\026\n\016traceSegmentId\030" +
      "\002 \001(\t\022(\n\005spans\030\003 \003(\0132\031.skywalking.v3.Spa" +
      "nObject\022\017\n\007service\030\004 \001(\t\022\027\n\017serviceInsta" +
      "nce\030\005 \001(\t\022\025\n\risSizeLimited\030\006 \001(\010\"\360\001\n\020Seg" +
      "mentReference\022\'\n\007refType\030\001 \001(\0162\026.skywalk" +
      "ing.v3.RefType\022\017\n\007traceId\030\002 \001(\t\022\034\n\024paren" +
      "tTraceSegmentId\030\003 \001(\t\022\024\n\014parentSpanId\030\004 " +
      "\001(\005\022\025\n\rparentService\030\005 \001(\t\022\035\n\025parentServ" +
      "iceInstance\030\006 \001(\t\022\026\n\016parentEndpoint\030\007 \001(" +
      "\t\022 \n\030networkAddressUsedAtPeer\030\010 \001(\t\"\221\003\n\n" +
      "SpanObject\022\016\n\006spanId\030\001 \001(\005\022\024\n\014parentSpan" +
      "Id\030\002 \001(\005\022\021\n\tstartTime\030\003 \001(\003\022\017\n\007endTime\030\004" +
      " \001(\003\022-\n\004refs\030\005 \003(\0132\037.skywalking.v3.Segme" +
      "ntReference\022\025\n\roperationName\030\006 \001(\t\022\014\n\004pe" +
      "er\030\007 \001(\t\022)\n\010spanType\030\010 \001(\0162\027.skywalking." +
      "v3.SpanType\022+\n\tspanLayer\030\t \001(\0162\030.skywalk" +
      "ing.v3.SpanLayer\022\023\n\013componentId\030\n \001(\005\022\017\n" +
      "\007isError\030\013 \001(\010\022/\n\004tags\030\014 \003(\0132!.skywalkin" +
      "g.v3.KeyStringValuePair\022 \n\004logs\030\r \003(\0132\022." +
      "skywalking.v3.Log\022\024\n\014skipAnalysis\030\016 \001(\010\"" +
      "D\n\003Log\022\014\n\004time\030\001 \001(\003\022/\n\004data\030\002 \003(\0132!.sky" +
      "walking.v3.KeyStringValuePair\"\020\n\002ID\022\n\n\002i" +
      "d\030\001 \003(\t\"C\n\021SegmentCollection\022.\n\010segments" +
      "\030\001 \003(\0132\034.skywalking.v3.SegmentObject**\n\010" +
      "SpanType\022\t\n\005Entry\020\000\022\010\n\004Exit\020\001\022\t\n\005Local\020\002" +
      "*,\n\007RefType\022\020\n\014CrossProcess\020\000\022\017\n\013CrossTh" +
      "read\020\001*_\n\tSpanLayer\022\013\n\007Unknown\020\000\022\014\n\010Data" +
      "base\020\001\022\020\n\014RPCFramework\020\002\022\010\n\004Http\020\003\022\006\n\002MQ" +
      "\020\004\022\t\n\005Cache\020\005\022\010\n\004FAAS\020\0062\257\001\n\031TraceSegment" +
      "ReportService\022D\n\007collect\022\034.skywalking.v3" +
      ".SegmentObject\032\027.skywalking.v3.Commands\"" +
      "\000(\001\022L\n\rcollectInSync\022 .skywalking.v3.Seg" +
      "mentCollection\032\027.skywalking.v3.Commands\"" +
      "\000B\223\001\n3org.apache.skywalking.apm.network." +
      "language.agent.v3P\001Z:skywalking.apache.o" +
      "rg/repo/goapi/collect/language/agent/v3\252" +
      "\002\035SkyWalking.NetworkProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_skywalking_v3_SegmentObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_SegmentObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SegmentObject_descriptor,
        new java.lang.String[] { "TraceId", "TraceSegmentId", "Spans", "Service", "ServiceInstance", "IsSizeLimited", });
    internal_static_skywalking_v3_SegmentReference_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_SegmentReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SegmentReference_descriptor,
        new java.lang.String[] { "RefType", "TraceId", "ParentTraceSegmentId", "ParentSpanId", "ParentService", "ParentServiceInstance", "ParentEndpoint", "NetworkAddressUsedAtPeer", });
    internal_static_skywalking_v3_SpanObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_skywalking_v3_SpanObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SpanObject_descriptor,
        new java.lang.String[] { "SpanId", "ParentSpanId", "StartTime", "EndTime", "Refs", "OperationName", "Peer", "SpanType", "SpanLayer", "ComponentId", "IsError", "Tags", "Logs", "SkipAnalysis", });
    internal_static_skywalking_v3_Log_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_skywalking_v3_Log_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_Log_descriptor,
        new java.lang.String[] { "Time", "Data", });
    internal_static_skywalking_v3_ID_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_skywalking_v3_ID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_ID_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_skywalking_v3_SegmentCollection_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_skywalking_v3_SegmentCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SegmentCollection_descriptor,
        new java.lang.String[] { "Segments", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}