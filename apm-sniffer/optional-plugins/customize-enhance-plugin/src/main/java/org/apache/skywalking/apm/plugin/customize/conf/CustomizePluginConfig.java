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

package org.apache.skywalking.apm.plugin.customize.conf;

import org.apache.skywalking.apm.agent.core.boot.PluginConfig;

public class CustomizePluginConfig {
    public static class Plugin {
        @PluginConfig(root = CustomizePluginConfig.class)
        public static class Customize {
            /**
             * Custom enhancement class configuration file path, recommended to use an absolute path.
             * 自定义增强类配置文件路径，建议使用绝对路径。
             */
            public static String ENHANCE_FILE = "";
        }
    }
}
