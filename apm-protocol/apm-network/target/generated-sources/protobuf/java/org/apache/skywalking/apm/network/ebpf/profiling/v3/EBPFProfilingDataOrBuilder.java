// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Profile.proto

package org.apache.skywalking.apm.network.ebpf.profiling.v3;

public interface EBPFProfilingDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.EBPFProfilingData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * task metadata
   * </pre>
   *
   * <code>.skywalking.v3.EBPFProfilingTaskMetadata task = 1;</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * task metadata
   * </pre>
   *
   * <code>.skywalking.v3.EBPFProfilingTaskMetadata task = 1;</code>
   * @return The task.
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskMetadata getTask();
  /**
   * <pre>
   * task metadata
   * </pre>
   *
   * <code>.skywalking.v3.EBPFProfilingTaskMetadata task = 1;</code>
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskMetadataOrBuilder getTaskOrBuilder();

  /**
   * <code>.skywalking.v3.EBPFOnCPUProfiling onCPU = 2;</code>
   * @return Whether the onCPU field is set.
   */
  boolean hasOnCPU();
  /**
   * <code>.skywalking.v3.EBPFOnCPUProfiling onCPU = 2;</code>
   * @return The onCPU.
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOnCPUProfiling getOnCPU();
  /**
   * <code>.skywalking.v3.EBPFOnCPUProfiling onCPU = 2;</code>
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFOnCPUProfilingOrBuilder getOnCPUOrBuilder();

  public org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData.ProfilingCase getProfilingCase();
}
