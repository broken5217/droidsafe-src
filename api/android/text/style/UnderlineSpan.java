package android.text.style;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.TextUtils;

public class UnderlineSpan extends CharacterStyle implements UpdateAppearance, ParcelableSpan {
    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:40.358 -0400", hash_original_method = "0961EBA9EB7C20D52B677528162BDFE2", hash_generated_method = "7390F9D5E0BC1E526CED5304868F9B88")
    public  UnderlineSpan() {
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:40.358 -0400", hash_original_method = "2F10E98AFC8F657229593A567035B72B", hash_generated_method = "7760FAFCB018CA151139F1A8E40D2AAC")
    public  UnderlineSpan(Parcel src) {
        addTaint(src.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:40.358 -0400", hash_original_method = "98FDD0C5C920ADC9B5642E26AAA3CBE6", hash_generated_method = "9B483E1A259C220AA1455BE24C6267BD")
    public int getSpanTypeId() {
        int varCEA744BC7D9CD01F4C8E37CCA26E0013_51764445 = (TextUtils.UNDERLINE_SPAN);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1881566616 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1881566616;
        // ---------- Original Method ----------
        //return TextUtils.UNDERLINE_SPAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:40.359 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "DFEC8E135484F92F05E88FD353145E33")
    public int describeContents() {
        int varCFCD208495D565EF66E7DFF9F98764DA_2095173569 = (0);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1197660695 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1197660695;
        // ---------- Original Method ----------
        //return 0;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:40.359 -0400", hash_original_method = "36081754C4A09732AEC95BB21FA0BDE7", hash_generated_method = "D6F5FAEE7A649F263C37D62D8A41EDFC")
    public void writeToParcel(Parcel dest, int flags) {
        addTaint(flags);
        addTaint(dest.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:40.359 -0400", hash_original_method = "0AB5A88A5517CF0706AB68CD6097189A", hash_generated_method = "4538C018576B894281E2DF5947D3D5B0")
    @Override
    public void updateDrawState(TextPaint ds) {
        addTaint(ds.getTaint());
        ds.setUnderlineText(true);
        // ---------- Original Method ----------
        //ds.setUnderlineText(true);
    }

    
}

