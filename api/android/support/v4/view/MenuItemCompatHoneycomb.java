/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.v4.view;

import droidsafe.annotations.*;
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import android.view.MenuItem;
import android.view.View;

/**
 * Implementation of menu compatibility that can call Honeycomb APIs.
 */
class MenuItemCompatHoneycomb {
    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-17 15:29:01.537 -0400", hash_original_method = "89CD2C30CF5A705FF97EBB7DAEFF0B6A", hash_generated_method = "DDAF007DCCB4122BF03524C617CCE49F")
    
public static void setShowAsAction(MenuItem item, int actionEnum) {
        item.setShowAsAction(actionEnum);
    }

    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-17 15:29:01.541 -0400", hash_original_method = "472E51716AFA194E818BC256203A7F04", hash_generated_method = "810E367DCDDAB1D06C8E8F576F4B806B")
    
public static MenuItem setActionView(MenuItem item, View view) {
        return item.setActionView(view);
    }

    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-17 15:29:01.545 -0400", hash_original_method = "17DA693F5FC00427A8B15A9B5F504C56", hash_generated_method = "9D2566F23278B5302CEAFD6053982073")
    
public static MenuItem setActionView(MenuItem item, int resId) {
        return item.setActionView(resId);
    }

    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2014-09-17 15:29:01.548 -0400", hash_original_method = "056DAB48F3669393DC0CCB1A67EFC17F", hash_generated_method = "E03248B7CC96178F84D9AFE992461438")
    
public static View getActionView(MenuItem item) {
        return item.getActionView();
    }
}
