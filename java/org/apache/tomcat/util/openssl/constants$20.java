/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;

final class constants$20 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$20() {
    }

    static final MethodHandle const$0 = RuntimeHelper.downcallHandle("SSL_get_peer_cert_chain", constants$2.const$4);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle("SSL_CTX_set_verify", constants$18.const$5);
    static final MethodHandle const$2 =
            RuntimeHelper.upcallHandle(SSL_CTX_set_cert_verify_callback$cb.class, "apply", constants$12.const$2);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(constants$12.const$2);
    static final MethodHandle const$4 =
            RuntimeHelper.downcallHandle("SSL_CTX_set_cert_verify_callback", constants$15.const$4);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle("SSL_CTX_use_PrivateKey", constants$12.const$2);
}

