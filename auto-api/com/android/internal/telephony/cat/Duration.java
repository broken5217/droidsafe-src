package com.android.internal.telephony.cat;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;

public class Duration implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.533 -0400", hash_original_field = "83EDDDD23EF2D6AE09F491892B0578B3", hash_generated_field = "35448C58A22DDC559F47B71F64B98655")

    public int timeInterval;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.533 -0400", hash_original_field = "27925A6F36FEC889D656734B42198E41", hash_generated_field = "E104F5569DCF2B31AE0BB025718138E9")

    public TimeUnit timeUnit;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.534 -0400", hash_original_method = "49A364E6511EE6731DA0B9EFBCF0B191", hash_generated_method = "8F8EFD460557BC387A4BF66295DC5E94")
    public  Duration(int timeInterval, TimeUnit timeUnit) {
        this.timeInterval = timeInterval;
        this.timeUnit = timeUnit;
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.535 -0400", hash_original_method = "69931BD60CFF69C2725A634D6D46CC0C", hash_generated_method = "11E9DFB1B0D109A8D4B961250E06B76D")
    private  Duration(Parcel in) {
        timeInterval = in.readInt();
        timeUnit = TimeUnit.values()[in.readInt()];
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.536 -0400", hash_original_method = "7A3E2E3AAE56FB706A1FF7E711848E72", hash_generated_method = "433D838BDDD8FD085D085F15C38080AD")
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(timeInterval);
        dest.writeInt(timeUnit.ordinal());
        addTaint(dest.getTaint());
        addTaint(flags);
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.536 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "C5ED44294E59A5AFB875D3AA6F66CC75")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_747921587 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_747921587;
        
        
    }

    
    public enum TimeUnit {
        MINUTE(0x00),
        SECOND(0x01),
        TENTH_SECOND(0x02);
        private int mValue;
        TimeUnit(int value) {
            mValue = value;
        }
        public int value() {
            return mValue;
        }
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.536 -0400", hash_original_field = "A45E48454A5718B4D58B745F8A75DBD7", hash_generated_field = "3313211CC65C61401C6638CF5336E71F")

    public static final Parcelable.Creator<Duration> CREATOR = new Parcelable.Creator<Duration>() {
        public Duration createFromParcel(Parcel in) {
            return new Duration(in);
        }

        public Duration[] newArray(int size) {
            return new Duration[size];
        }
    };
}

