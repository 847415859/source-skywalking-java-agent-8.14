/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.agent.core.context;

import org.apache.skywalking.apm.agent.core.context.trace.AbstractSpan;

/**
 * Span could use these APIs to active and extend its lift cycle across thread.
 * <p>
 * This is typical used in async plugin, especially RPC plugins.
 * Span可以使用这些API来激活并延长其跨线程的提升周期。
 * 这通常用于异步插件，尤其是RPC插件。
 */
public interface AsyncSpan {
    /**
     * The span finish at current tracing context, but the current span is still alive, until {@link #asyncFinish}
     * called.
     * <p>
     * This method must be called
     * <p>
     * 1. In original thread(tracing context). 2. Current span is active span.
     * <p>
     * During alive, tags, logs and attributes of the span could be changed, in any thread.
     * <p>
     * The execution times of {@link #prepareForAsync} and {@link #asyncFinish()} must match.
     *
     * 跨度在当前跟踪上下文中完成，但当前跨度仍处于活动状态，直到调用asyncFinish。必须调用此方法
     * 1.在原始线程中（跟踪上下文）。
     * 2.当前跨度为活动跨度。
     * 在活动期间，可以在任何线程中更改跨度的标记、日志和属性。 prepareForAsync和asyncFinish（）的执行时间必须匹配。
     * @return the current span
     */
    AbstractSpan prepareForAsync();

    /**
     * Notify the span, it could be finished.
     * <p>
     * The execution times of {@link #prepareForAsync} and {@link #asyncFinish()} must match.
     * 通知跨度，它可以完成。
     * prepareForAsync和asyncFinish（）的执行时间必须匹配。
     * @return the current span
     */
    AbstractSpan asyncFinish();
}
