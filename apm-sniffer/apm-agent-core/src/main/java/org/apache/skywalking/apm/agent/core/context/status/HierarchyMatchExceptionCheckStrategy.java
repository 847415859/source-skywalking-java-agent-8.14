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

package org.apache.skywalking.apm.agent.core.context.status;

import org.apache.skywalking.apm.agent.core.boot.ServiceManager;

/**
 * HierarchyMatchExceptionCheckStrategy does a hierarchy check for a traced exception. If it or its parent has been
 * listed in org.apache.skywalking.apm.agent.core.conf.Config.StatusCheck#IGNORED_EXCEPTIONS, the error status of the
 * span wouldn't be changed.
 * HierarchyMatchExceptionCheckStrategy为跟踪的异常执行层次结构检查。
 * 如果它或它的父级已在org.apache.skywalking.pm.agent.core.conf配置中列出。
 * 状态检查#IGNORED_EXCEPTIONS，跨度的错误状态不会更改。
 */
public class HierarchyMatchExceptionCheckStrategy implements ExceptionCheckStrategy {

    @Override
    public boolean isError(final Throwable e) {
        Class<? extends Throwable> clazz = e.getClass();
        StatusCheckService statusTriggerService = ServiceManager.INSTANCE.findService(StatusCheckService.class);
        String[] ignoredExceptionNames = statusTriggerService.getIgnoredExceptionNames();
        for (final String ignoredExceptionName : ignoredExceptionNames) {
            try {
                Class<?> parentClazz = Class.forName(ignoredExceptionName, true, clazz.getClassLoader());
                if (parentClazz.isAssignableFrom(clazz)) {
                    return false;
                }
            } catch (ClassNotFoundException ignore) {
            }
        }
        return true;
    }
}
