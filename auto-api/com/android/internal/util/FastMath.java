package com.android.internal.util;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class FastMath {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:32.650 -0400", hash_original_method = "64D1D90DF7F5177989F305720BFD3703", hash_generated_method = "64D1D90DF7F5177989F305720BFD3703")
    public FastMath ()
    {
        
    }


    @DSModeled(DSC.SAFE)
    public static int round(float x) {
        long lx = (long)(x * (65536 * 256f));
        return (int)((lx + 0x800000) >> 24);
    }

    
}

