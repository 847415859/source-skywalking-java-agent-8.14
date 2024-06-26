// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Process.proto

package org.apache.skywalking.apm.network.ebpf.profiling.process.v3;

public final class Process {
  private Process() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFProcessReportList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFProcessReportList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFProcessProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFProcessProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFHostProcessMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFHostProcessMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFProcessEntityMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFProcessEntityMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFKubernetesProcessMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFKubernetesProcessMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFReportProcessDownstream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFReportProcessDownstream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFProcessDownstream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFProcessDownstream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFHostProcessDownstream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFHostProcessDownstream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFKubernetesProcessDownstream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFKubernetesProcessDownstream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFProcessPingPkgList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFProcessPingPkgList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_EBPFProcessPingPkg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_EBPFProcessPingPkg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ebpf/profiling/Process.proto\022\rskywalki" +
      "ng.v3\032\023common/Common.proto\"e\n\025EBPFProces" +
      "sReportList\0227\n\tprocesses\030\001 \003(\0132$.skywalk" +
      "ing.v3.EBPFProcessProperties\022\023\n\013ebpfAgen" +
      "tID\030\002 \001(\t\"\246\001\n\025EBPFProcessProperties\022=\n\013h" +
      "ostProcess\030\001 \001(\0132&.skywalking.v3.EBPFHos" +
      "tProcessMetadataH\000\022B\n\nk8sProcess\030\002 \001(\0132," +
      ".skywalking.v3.EBPFKubernetesProcessMeta" +
      "dataH\000B\n\n\010metadata\"}\n\027EBPFHostProcessMet" +
      "adata\0228\n\006entity\030\001 \001(\0132(.skywalking.v3.EB" +
      "PFProcessEntityMetadata\022\013\n\003cmd\030\002 \001(\t\022\016\n\006" +
      "hostIP\030\003 \001(\t\022\013\n\003pid\030\004 \001(\005\"z\n\031EBPFProcess" +
      "EntityMetadata\022\r\n\005layer\030\001 \001(\t\022\023\n\013service" +
      "Name\030\002 \001(\t\022\024\n\014instanceName\030\003 \001(\t\022\023\n\013proc" +
      "essName\030\004 \001(\t\022\016\n\006labels\030\005 \003(\t\"\037\n\035EBPFKub" +
      "ernetesProcessMetadata\"V\n\033EBPFReportProc" +
      "essDownstream\0227\n\tprocesses\030\001 \003(\0132$.skywa" +
      "lking.v3.EBPFProcessDownstream\"\274\001\n\025EBPFP" +
      "rocessDownstream\022\021\n\tprocessId\030\001 \001(\t\022?\n\013h" +
      "ostProcess\030\002 \001(\0132(.skywalking.v3.EBPFHos" +
      "tProcessDownstreamH\000\022D\n\nk8sProcess\030\003 \001(\013" +
      "2..skywalking.v3.EBPFKubernetesProcessDo" +
      "wnstreamH\000B\t\n\007process\"(\n\031EBPFHostProcess" +
      "Downstream\022\013\n\003pid\030\001 \001(\005\"!\n\037EBPFKubernete" +
      "sProcessDownstream\"N\n\026EBPFProcessPingPkg" +
      "List\0224\n\tprocesses\030\001 \003(\0132!.skywalking.v3." +
      "EBPFProcessPingPkg\"V\n\022EBPFProcessPingPkg" +
      "\022@\n\016entityMetadata\030\001 \001(\0132(.skywalking.v3" +
      ".EBPFProcessEntityMetadata2\312\001\n\022EBPFProce" +
      "ssService\022e\n\017reportProcesses\022$.skywalkin" +
      "g.v3.EBPFProcessReportList\032*.skywalking." +
      "v3.EBPFReportProcessDownstream\"\000\022M\n\tkeep" +
      "Alive\022%.skywalking.v3.EBPFProcessPingPkg" +
      "List\032\027.skywalking.v3.Commands\"\000B\203\001\n;org." +
      "apache.skywalking.apm.network.ebpf.profi" +
      "ling.process.v3P\001ZBskywalking.apache.org" +
      "/repo/goapi/collect/ebpf/profiling/proce" +
      "ss/v3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_skywalking_v3_EBPFProcessReportList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_EBPFProcessReportList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFProcessReportList_descriptor,
        new java.lang.String[] { "Processes", "EbpfAgentID", });
    internal_static_skywalking_v3_EBPFProcessProperties_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_EBPFProcessProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFProcessProperties_descriptor,
        new java.lang.String[] { "HostProcess", "K8SProcess", "Metadata", });
    internal_static_skywalking_v3_EBPFHostProcessMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_skywalking_v3_EBPFHostProcessMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFHostProcessMetadata_descriptor,
        new java.lang.String[] { "Entity", "Cmd", "HostIP", "Pid", });
    internal_static_skywalking_v3_EBPFProcessEntityMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_skywalking_v3_EBPFProcessEntityMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFProcessEntityMetadata_descriptor,
        new java.lang.String[] { "Layer", "ServiceName", "InstanceName", "ProcessName", "Labels", });
    internal_static_skywalking_v3_EBPFKubernetesProcessMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_skywalking_v3_EBPFKubernetesProcessMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFKubernetesProcessMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_skywalking_v3_EBPFReportProcessDownstream_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_skywalking_v3_EBPFReportProcessDownstream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFReportProcessDownstream_descriptor,
        new java.lang.String[] { "Processes", });
    internal_static_skywalking_v3_EBPFProcessDownstream_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_skywalking_v3_EBPFProcessDownstream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFProcessDownstream_descriptor,
        new java.lang.String[] { "ProcessId", "HostProcess", "K8SProcess", "Process", });
    internal_static_skywalking_v3_EBPFHostProcessDownstream_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_skywalking_v3_EBPFHostProcessDownstream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFHostProcessDownstream_descriptor,
        new java.lang.String[] { "Pid", });
    internal_static_skywalking_v3_EBPFKubernetesProcessDownstream_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_skywalking_v3_EBPFKubernetesProcessDownstream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFKubernetesProcessDownstream_descriptor,
        new java.lang.String[] { });
    internal_static_skywalking_v3_EBPFProcessPingPkgList_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_skywalking_v3_EBPFProcessPingPkgList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFProcessPingPkgList_descriptor,
        new java.lang.String[] { "Processes", });
    internal_static_skywalking_v3_EBPFProcessPingPkg_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_skywalking_v3_EBPFProcessPingPkg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_EBPFProcessPingPkg_descriptor,
        new java.lang.String[] { "EntityMetadata", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
