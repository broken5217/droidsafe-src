package com.android.internal.telephony;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.os.Parcel;
import android.os.Parcelable;

public class SmsRawData implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:19.294 -0400", hash_original_field = "8D777F385D3DFEC8815D20F7496026DC", hash_generated_field = "B330DF564CD90A5498A9E4F0AB344BB9")

    byte[] data;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:19.296 -0400", hash_original_method = "786E0C6936F82B829DA5B3FF66BF9330", hash_generated_method = "9696AEC10121DADFC74AB9E5C21D1B54")
    public  SmsRawData(byte[] data) {
        this.data = data;
        // ---------- Original Method ----------
        //this.data = data;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:19.297 -0400", hash_original_method = "A347A6B90A5D4D940F0721005973D58D", hash_generated_method = "F73451FC4DC7CEF205E99F41FB48C911")
    public byte[] getBytes() {
        byte[] var8D777F385D3DFEC8815D20F7496026DC_2060016790 = (data);
                byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1007262365 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1007262365;
        // ---------- Original Method ----------
        //return data;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:19.297 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "D10D2CC9C14DC3D7FEA67AF99EC4E2C3")
    public int describeContents() {
        int varCFCD208495D565EF66E7DFF9F98764DA_2123883670 = (0);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_567812855 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_567812855;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:19.299 -0400", hash_original_method = "D4C3CA886CA029713C39962D7FB3C06B", hash_generated_method = "9B0573B203D719FA7E739B1D40A76BB6")
    public void writeToParcel(Parcel dest, int flags) {
        addTaint(flags);
        addTaint(dest.getTaint());
        dest.writeInt(data.length);
        dest.writeByteArray(data);
        // ---------- Original Method ----------
        //dest.writeInt(data.length);
        //dest.writeByteArray(data);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:19.300 -0400", hash_original_field = "5F248018C4F105B9FC6BE9470BA097DB", hash_generated_field = "AED96BE50F57834351625E8AF71D8275")

    public static final Parcelable.Creator<SmsRawData> CREATOR
            = new Parcelable.Creator<SmsRawData> (){
        public SmsRawData createFromParcel(Parcel source) {
            int size;
            size = source.readInt();
            byte[] data = new byte[size];
            source.readByteArray(data);
            return new SmsRawData(data);
        }

        public SmsRawData[] newArray(int size) {
            return new SmsRawData[size];
        }
    };
    // orphaned legacy method
    public SmsRawData createFromParcel(Parcel source) {
            int size;
            size = source.readInt();
            byte[] data = new byte[size];
            source.readByteArray(data);
            return new SmsRawData(data);
        }
    
    // orphaned legacy method
    public SmsRawData[] newArray(int size) {
            return new SmsRawData[size];
        }
    
}

