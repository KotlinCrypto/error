/*
 * Copyright (c) 2025 KotlinCrypto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package org.kotlincrypto.error

/**
 * This exception is thrown whenever an invalid DER-encoded certificate is parsed, or unsupported
 * DER features are found in the Certificate.
 * */
public actual open class CertificateParsingException: CertificateException {
    public actual constructor(): super()
    public actual constructor(message: String?): super(message)
    public actual constructor(message: String?, cause: Throwable?): super(message, cause)
    public actual constructor(cause: Throwable?): super(cause)
}
