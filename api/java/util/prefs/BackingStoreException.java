/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package java.util.prefs;

/**
 * An exception to indicate that an error was encountered while accessing the
 * backing store.
 *
 * @since 1.4
 */
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import droidsafe.helpers.*;
public class BackingStoreException extends Exception {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-03 15:01:10.624 -0400", hash_original_field = "410CAA42C95BA6B4F6F383E919A9BF52", hash_generated_field = "6D27240B674FA49330AE802A0E14AC84")


    private static final long serialVersionUID = 859796500401108469L;

    /**
     * Constructs a new {@code BackingStoreException} instance with a detailed
     * exception message.
     *
     * @param s
     *            the detailed exception message.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-03 15:01:10.624 -0400", hash_original_method = "D84AB61FAE5FE29C046A1A93CCCB3520", hash_generated_method = "799C9CE7577435636122DB266F867633")
    
public BackingStoreException (String s) {
        super(s);
    }

    /**
     * Constructs a new {@code BackingStoreException} instance with a nested
     * {@code Throwable}.
     *
     * @param t
     *            the nested {@code Throwable}.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-03 15:01:10.625 -0400", hash_original_method = "BF345931412FABBDAF2028279B91A47E", hash_generated_method = "1BDA48701024A41C8653014A15CFC4E2")
    
public BackingStoreException (Throwable t) {
        super(t);
    }
}
