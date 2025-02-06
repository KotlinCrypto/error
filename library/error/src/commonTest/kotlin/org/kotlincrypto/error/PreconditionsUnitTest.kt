/*
 * Copyright (c) 2025 Matthew Nelson
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
package org.kotlincrypto.error

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PreconditionsUnitTest {

    @Test
    fun givenRequireParam_whenConditionTrue_thenDoesNotThrow() {
        requireParam(true)
        requireParam(true) { "fail" }
    }

    @Test
    fun givenRequireParam_whenConditionFalse_thenThrows() {
        assertFailsWith<InvalidParameterException> { requireParam(false) }
        assertFailsWith<InvalidParameterException> { requireParam(false) { "fail" } }
    }
}
