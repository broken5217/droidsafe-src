package android.telephony;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class ServiceState implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "CD8D7D0ED7F8789944E5A8281BA9DF7A", hash_generated_field = "F60690C16A904EA5E0E01BA5DAB95D57")

    private int mState = STATE_OUT_OF_SERVICE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "53676CF9ACC69A311F8B40D8878A560F", hash_generated_field = "02055DCC177C93D9A52A736D58C166FD")

    private boolean mRoaming;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "AF7910533067C512BFC35FA24A24CD7F", hash_generated_field = "728600C6907FD62C9C9028803BDD260B")

    private String mOperatorAlphaLong;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "4FCE3B5E8F9E09F64FCB27DEC9432FF4", hash_generated_field = "F4F9F83BCAA92805A0BB009F68ED6C5A")

    private String mOperatorAlphaShort;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "C7E5BB10D18E0112A0F6F13B0C83BBC1", hash_generated_field = "7893BD126D717D1D8D6ABD0FF8E0AD30")

    private String mOperatorNumeric;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "CA7384AC1F5D15D68A2E3D6CEA11EC92", hash_generated_field = "BFC5A115AB0CEA3AEFC065878943AA07")

    private boolean mIsManualNetworkSelection;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "760B1F73F911038F6C307E933712FBA8", hash_generated_field = "17239629CA9846328F98C386EA8B54F9")

    private boolean mIsEmergencyOnly;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "C110FE1C5135F459E7A00CD43DB22C95", hash_generated_field = "379C3FB6918D9CCD707AC84835B3C555")

    private int mRadioTechnology;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "D327A788FB47D9FB30C9C1808E8CFFC8", hash_generated_field = "88C8AAE6E96FE73CBCA20071BE474E4F")

    private boolean mCssIndicator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "BE656451182C514680105DD47C42A32D", hash_generated_field = "7A5A39D03C1616F994D4D06922BB67CA")

    private int mNetworkId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "3E268DDAC9DDE6FEE79ECAD45C6F6866", hash_generated_field = "C8F6488FFC51AAE029241A3B484EA04F")

    private int mSystemId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "D6933A1D05A6AEC50A9E09EBC2394646", hash_generated_field = "C6E763F1BBE4C6A164F28127EDC3B603")

    private int mCdmaRoamingIndicator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "FFFB031FBFE7879DE7E3DCD9B972F07C", hash_generated_field = "34026AB57B68A48734A85797E3F4BF65")

    private int mCdmaDefaultRoamingIndicator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "16179213704E1DCCFFF46A9D20E8BCF7", hash_generated_field = "72D211FC0E1391121ACC384DA733167F")

    private int mCdmaEriIconIndex;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.869 -0400", hash_original_field = "E491CA82D599E4F3D190B294F681F6CE", hash_generated_field = "3596AD8B1E2941E9C5CC4FA8BF8A2655")

    private int mCdmaEriIconMode;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.870 -0400", hash_original_method = "36476E21C74B3827A7B01BE12F666937", hash_generated_method = "A7807DEFF5E02F2472BD589AB7484EC5")
    public  ServiceState() {
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.870 -0400", hash_original_method = "77F46968981D692048E5F6D63AA7A464", hash_generated_method = "8AA213D8BF62BFAEB23CEF70F59E2728")
    public  ServiceState(ServiceState s) {
        copyFrom(s);
        addTaint(s.getTaint());
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.871 -0400", hash_original_method = "E237E117068718AE5F81C4213860014E", hash_generated_method = "5A072D19CA92E807DD57BCDDD5320B97")
    public  ServiceState(Parcel in) {
        mState = in.readInt();
        mRoaming = in.readInt() != 0;
        mOperatorAlphaLong = in.readString();
        mOperatorAlphaShort = in.readString();
        mOperatorNumeric = in.readString();
        mIsManualNetworkSelection = in.readInt() != 0;
        mRadioTechnology = in.readInt();
        mCssIndicator = (in.readInt() != 0);
        mNetworkId = in.readInt();
        mSystemId = in.readInt();
        mCdmaRoamingIndicator = in.readInt();
        mCdmaDefaultRoamingIndicator = in.readInt();
        mCdmaEriIconIndex = in.readInt();
        mCdmaEriIconMode = in.readInt();
        mIsEmergencyOnly = in.readInt() != 0;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static ServiceState newFromBundle(Bundle m) {
        ServiceState ret;
        ret = new ServiceState();
        ret.setFromNotifierBundle(m);
        return ret;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.872 -0400", hash_original_method = "E04D2A000CEC20636ABEC5ED3DEE444A", hash_generated_method = "99DBB3029C52434B0C0947604E5DEF4A")
    protected void copyFrom(ServiceState s) {
        mState = s.mState;
        mRoaming = s.mRoaming;
        mOperatorAlphaLong = s.mOperatorAlphaLong;
        mOperatorAlphaShort = s.mOperatorAlphaShort;
        mOperatorNumeric = s.mOperatorNumeric;
        mIsManualNetworkSelection = s.mIsManualNetworkSelection;
        mRadioTechnology = s.mRadioTechnology;
        mCssIndicator = s.mCssIndicator;
        mNetworkId = s.mNetworkId;
        mSystemId = s.mSystemId;
        mCdmaRoamingIndicator = s.mCdmaRoamingIndicator;
        mCdmaDefaultRoamingIndicator = s.mCdmaDefaultRoamingIndicator;
        mCdmaEriIconIndex = s.mCdmaEriIconIndex;
        mCdmaEriIconMode = s.mCdmaEriIconMode;
        mIsEmergencyOnly = s.mIsEmergencyOnly;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.873 -0400", hash_original_method = "0314D3363C47B5602718344C30C07D2D", hash_generated_method = "75AEE3BF995E14F6D2662E1545CCADEF")
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mState);
        out.writeInt(mRoaming ? 1 : 0);
        out.writeString(mOperatorAlphaLong);
        out.writeString(mOperatorAlphaShort);
        out.writeString(mOperatorNumeric);
        out.writeInt(mIsManualNetworkSelection ? 1 : 0);
        out.writeInt(mRadioTechnology);
        out.writeInt(mCssIndicator ? 1 : 0);
        out.writeInt(mNetworkId);
        out.writeInt(mSystemId);
        out.writeInt(mCdmaRoamingIndicator);
        out.writeInt(mCdmaDefaultRoamingIndicator);
        out.writeInt(mCdmaEriIconIndex);
        out.writeInt(mCdmaEriIconMode);
        out.writeInt(mIsEmergencyOnly ? 1 : 0);
        addTaint(out.getTaint());
        addTaint(flags);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.873 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "8F638212707DF5F617E4CBD8A32BE3F2")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_703476978 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_703476978;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.874 -0400", hash_original_method = "10E9373648D5DF4EE43B4904732E3886", hash_generated_method = "60BF68306EA5019B87D1D650AE458CF8")
    public int getState() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1730089644 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1730089644;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.874 -0400", hash_original_method = "27B48B56BD1E05F31D9E74CC53E25407", hash_generated_method = "BF3EC7A8641A7F2A8DE89B6ACED64160")
    public boolean getRoaming() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1096050759 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1096050759;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.874 -0400", hash_original_method = "3DFEB66E744CCF30AC3F0251BA213E84", hash_generated_method = "F22CAD22081329AD357F4CA302EF3DFF")
    public boolean isEmergencyOnly() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1152298155 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1152298155;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.875 -0400", hash_original_method = "83FC91D4D13183AA7E425917DAA84866", hash_generated_method = "C3BE231D808F8B564A41D78FD82C6BFB")
    public int getCdmaRoamingIndicator() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1062669830 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1062669830;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.875 -0400", hash_original_method = "66A4F6EB11ADB385A490C7939EB92055", hash_generated_method = "4F3AAD37D5044B612DF9CDCBCD36133E")
    public int getCdmaDefaultRoamingIndicator() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_462441983 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_462441983;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.875 -0400", hash_original_method = "A86147562C8C2CE9187BA7AFC3028DA0", hash_generated_method = "E4A335F002DB70B660C00AF8ABA9ECE8")
    public int getCdmaEriIconIndex() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1054355844 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1054355844;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.875 -0400", hash_original_method = "637A5E08A8AA09E09B00A7308F96EA32", hash_generated_method = "4FCE039EE6D36DC8EFE060666379C3C8")
    public int getCdmaEriIconMode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1358170952 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1358170952;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.876 -0400", hash_original_method = "550CF77EB1CEA79355B2985E6B5A4349", hash_generated_method = "891C3B562E45621C1C33FF01C1F57358")
    public String getOperatorAlphaLong() {
        String varB4EAC82CA7396A68D541C85D26508E83_2132909399 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_2132909399 = mOperatorAlphaLong;
        varB4EAC82CA7396A68D541C85D26508E83_2132909399.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2132909399;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.876 -0400", hash_original_method = "86619391C7B398160E7B9E543643DBB4", hash_generated_method = "D769B0D3E2D247AD49FAA00F21283113")
    public String getOperatorAlphaShort() {
        String varB4EAC82CA7396A68D541C85D26508E83_1618499084 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1618499084 = mOperatorAlphaShort;
        varB4EAC82CA7396A68D541C85D26508E83_1618499084.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1618499084;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.877 -0400", hash_original_method = "608E7A84F718D26C8A9F8E19A83C0931", hash_generated_method = "A1E5E6A03B6C80226A568B5A80AC4BAF")
    public String getOperatorNumeric() {
        String varB4EAC82CA7396A68D541C85D26508E83_858484385 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_858484385 = mOperatorNumeric;
        varB4EAC82CA7396A68D541C85D26508E83_858484385.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_858484385;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.877 -0400", hash_original_method = "233C7A13AF785DA7BC75C18AF3C8DB71", hash_generated_method = "4B4C772C6401B13BF15F29BAEB8F49EA")
    public boolean getIsManualSelection() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_819978359 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_819978359;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.878 -0400", hash_original_method = "4FC9291B326FDF96318315E16F56658C", hash_generated_method = "0750EACB3D3411E6BC6FDD5E43576459")
    @Override
    public int hashCode() {
        int var17E1E702D83D8892539663C4B4794A68_2120048410 = (((mState * 0x1234)
                + (mRoaming ? 1 : 0)
                + (mIsManualNetworkSelection ? 1 : 0)
                + ((null == mOperatorAlphaLong) ? 0 : mOperatorAlphaLong.hashCode())
                + ((null == mOperatorAlphaShort) ? 0 : mOperatorAlphaShort.hashCode())
                + ((null == mOperatorNumeric) ? 0 : mOperatorNumeric.hashCode())
                + mCdmaRoamingIndicator
                + mCdmaDefaultRoamingIndicator
                + (mIsEmergencyOnly ? 1 : 0))); 
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_242188235 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_242188235;
        
        
                
                
                
                
                
                
                
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:38.122 -0400", hash_original_method = "5AB9F404C745D33B000995514C8414B5", hash_generated_method = "82DA6C98BE9D67BBE2A6345BC4011482")
    @Override
    public boolean equals(Object o) {
        ServiceState s = null;
        try 
        {
            s = (ServiceState) o;
        } 
        catch (ClassCastException ex)
        { }
        boolean varEE276B99C43E5154F1BACA397993F41B_1796668691 = ((mState == s.mState
                && mRoaming == s.mRoaming
                && mIsManualNetworkSelection == s.mIsManualNetworkSelection
                && equalsHandlesNulls(mOperatorAlphaLong, s.mOperatorAlphaLong)
                && equalsHandlesNulls(mOperatorAlphaShort, s.mOperatorAlphaShort)
                && equalsHandlesNulls(mOperatorNumeric, s.mOperatorNumeric)
                && equalsHandlesNulls(mRadioTechnology, s.mRadioTechnology)
                && equalsHandlesNulls(mCssIndicator, s.mCssIndicator)
                && equalsHandlesNulls(mNetworkId, s.mNetworkId)
                && equalsHandlesNulls(mSystemId, s.mSystemId)
                && equalsHandlesNulls(mCdmaRoamingIndicator, s.mCdmaRoamingIndicator)
                && equalsHandlesNulls(mCdmaDefaultRoamingIndicator,
                        s.mCdmaDefaultRoamingIndicator)
                && mIsEmergencyOnly == s.mIsEmergencyOnly));
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1505970036 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1505970036;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static String radioTechnologyToString(int rt) {
        String rtString;
        switch(rt) {
            case 0:
                rtString = "Unknown";
                break;
            case 1:
                rtString = "GPRS";
                break;
            case 2:
                rtString = "EDGE";
                break;
            case 3:
                rtString = "UMTS";
                break;
            case 4:
                rtString = "CDMA-IS95A";
                break;
            case 5:
                rtString = "CDMA-IS95B";
                break;
            case 6:
                rtString = "1xRTT";
                break;
            case 7:
                rtString = "EvDo-rev.0";
                break;
            case 8:
                rtString = "EvDo-rev.A";
                break;
            case 9:
                rtString = "HSDPA";
                break;
            case 10:
                rtString = "HSUPA";
                break;
            case 11:
                rtString = "HSPA";
                break;
            case 12:
                rtString = "EvDo-rev.B";
                break;
            case 13:
                rtString = "eHRPD";
                break;
            case 14:
                rtString = "LTE";
                break;
            case 15:
                rtString = "HSPAP";
                break;
            default:
                rtString = "Unexpected";
                Log.w(LOG_TAG, "Unexpected radioTechnology=" + rt);
                break;
        }
        return rtString + ":" + rt;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.879 -0400", hash_original_method = "8261C946B0851B9612BB2224B1BDDEEE", hash_generated_method = "3EC1169DB286121325F64C225AFF9844")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_941690060 = null; 
        String radioTechnology = radioTechnologyToString(mRadioTechnology);
        varB4EAC82CA7396A68D541C85D26508E83_941690060 = (mState + " " + (mRoaming ? "roaming" : "home")
                + " " + mOperatorAlphaLong
                + " " + mOperatorAlphaShort
                + " " + mOperatorNumeric
                + " " + (mIsManualNetworkSelection ? "(manual)" : "")
                + " " + radioTechnology
                + " " + (mCssIndicator ? "CSS supported" : "CSS not supported")
                + " " + mNetworkId
                + " " + mSystemId
                + " RoamInd=" + mCdmaRoamingIndicator
                + " DefRoamInd=" + mCdmaDefaultRoamingIndicator
                + " EmergOnly=" + mIsEmergencyOnly);
        varB4EAC82CA7396A68D541C85D26508E83_941690060.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_941690060;
        
        
        
                
                
                
                
                
                
                
                
                
                
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.880 -0400", hash_original_method = "8ACC80A7889D35C4C641DEE09D896F76", hash_generated_method = "FD85B86F0ECF83F99FE09898A135D41E")
    private void setNullState(int state) {
        mState = state;
        mRoaming = false;
        mOperatorAlphaLong = null;
        mOperatorAlphaShort = null;
        mOperatorNumeric = null;
        mIsManualNetworkSelection = false;
        mRadioTechnology = 0;
        mCssIndicator = false;
        mNetworkId = -1;
        mSystemId = -1;
        mCdmaRoamingIndicator = -1;
        mCdmaDefaultRoamingIndicator = -1;
        mCdmaEriIconIndex = -1;
        mCdmaEriIconMode = -1;
        mIsEmergencyOnly = false;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.880 -0400", hash_original_method = "638BC09D981AD6B06693C47D3D967201", hash_generated_method = "23CD066BEE1328B3FAF766CB48BCAE3C")
    public void setStateOutOfService() {
        setNullState(STATE_OUT_OF_SERVICE);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.880 -0400", hash_original_method = "D9FAF4EA3D294E58217DAB74F17C0351", hash_generated_method = "6564B9436096F301E0C8CC97A1ABB541")
    public void setStateOff() {
        setNullState(STATE_POWER_OFF);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.881 -0400", hash_original_method = "B2257FFBD3B79161D70D00C92F5BABD5", hash_generated_method = "0A89A4D469AFE50CFD17E18CFACCA324")
    public void setState(int state) {
        mState = state;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.881 -0400", hash_original_method = "78DC27B1781D6001A1042BE9E193D14B", hash_generated_method = "7F27798B57A4E4A81DBFB88618240DFD")
    public void setRoaming(boolean roaming) {
        mRoaming = roaming;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.881 -0400", hash_original_method = "B2BA3AF9B92E65EA8B062AC201A0C0F0", hash_generated_method = "F2B108E944B0EDB88B7C5DF0C8DEE5B7")
    public void setEmergencyOnly(boolean emergencyOnly) {
        mIsEmergencyOnly = emergencyOnly;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.881 -0400", hash_original_method = "C5CC061ACF011623DDFD13C5F3F99CC3", hash_generated_method = "95FFD314FD0A0685BE1321CF3791396E")
    public void setCdmaRoamingIndicator(int roaming) {
        this.mCdmaRoamingIndicator = roaming;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.882 -0400", hash_original_method = "723EC448C9CB51F7110A335E414C4680", hash_generated_method = "A2BB49F52906E681CF96691F2251B042")
    public void setCdmaDefaultRoamingIndicator(int roaming) {
        this.mCdmaDefaultRoamingIndicator = roaming;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.882 -0400", hash_original_method = "270DF85E703DBBACE36CF343B8162562", hash_generated_method = "B0AACDB8E38F97633346B3B4835E8917")
    public void setCdmaEriIconIndex(int index) {
        this.mCdmaEriIconIndex = index;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.883 -0400", hash_original_method = "B583E3E822650F1B5214B53503BF1241", hash_generated_method = "0316BEBDF43E5B19472BA6E6AE128413")
    public void setCdmaEriIconMode(int mode) {
        this.mCdmaEriIconMode = mode;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.883 -0400", hash_original_method = "AB95572079513DCF8B19D191A4DD2824", hash_generated_method = "757C6454087C55B214646701A80C6257")
    public void setOperatorName(String longName, String shortName, String numeric) {
        mOperatorAlphaLong = longName;
        mOperatorAlphaShort = shortName;
        mOperatorNumeric = numeric;
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.883 -0400", hash_original_method = "2932DCDD0502DE94804E9827964069D2", hash_generated_method = "E493DDC360F50CDDBDCC3FE4BB704447")
    public void setOperatorAlphaLong(String longName) {
        mOperatorAlphaLong = longName;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.884 -0400", hash_original_method = "C2D18251B53286CEC68F55BEC648A3A6", hash_generated_method = "68A7FEA8A4D1FF9B681DEA0096AE5AFA")
    public void setIsManualSelection(boolean isManual) {
        mIsManualNetworkSelection = isManual;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean equalsHandlesNulls(Object a, Object b) {
        return (a == null) ? (b == null) : a.equals (b);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.885 -0400", hash_original_method = "45F7665F0B17EC4A3962C47A86921C1E", hash_generated_method = "F2DDA3BAB5864A01A9612F2D4D632F3B")
    private void setFromNotifierBundle(Bundle m) {
        mState = m.getInt("state");
        mRoaming = m.getBoolean("roaming");
        mOperatorAlphaLong = m.getString("operator-alpha-long");
        mOperatorAlphaShort = m.getString("operator-alpha-short");
        mOperatorNumeric = m.getString("operator-numeric");
        mIsManualNetworkSelection = m.getBoolean("manual");
        mRadioTechnology = m.getInt("radioTechnology");
        mCssIndicator = m.getBoolean("cssIndicator");
        mNetworkId = m.getInt("networkId");
        mSystemId = m.getInt("systemId");
        mCdmaRoamingIndicator = m.getInt("cdmaRoamingIndicator");
        mCdmaDefaultRoamingIndicator = m.getInt("cdmaDefaultRoamingIndicator");
        mIsEmergencyOnly = m.getBoolean("emergencyOnly");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.886 -0400", hash_original_method = "9BCA23D068820B6DD53DFB45DB9457FF", hash_generated_method = "59F36DB27833911CB7C21ED22BCE829F")
    public void fillInNotifierBundle(Bundle m) {
        m.putInt("state", mState);
        m.putBoolean("roaming", Boolean.valueOf(mRoaming));
        m.putString("operator-alpha-long", mOperatorAlphaLong);
        m.putString("operator-alpha-short", mOperatorAlphaShort);
        m.putString("operator-numeric", mOperatorNumeric);
        m.putBoolean("manual", Boolean.valueOf(mIsManualNetworkSelection));
        m.putInt("radioTechnology", mRadioTechnology);
        m.putBoolean("cssIndicator", mCssIndicator);
        m.putInt("networkId", mNetworkId);
        m.putInt("systemId", mSystemId);
        m.putInt("cdmaRoamingIndicator", mCdmaRoamingIndicator);
        m.putInt("cdmaDefaultRoamingIndicator", mCdmaDefaultRoamingIndicator);
        m.putBoolean("emergencyOnly", Boolean.valueOf(mIsEmergencyOnly));
        addTaint(m.getTaint());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.886 -0400", hash_original_method = "C012C4DB079EEB33708722C3BF4101EF", hash_generated_method = "1F99DEEAD6AC0C2BC8FBC98190DF50ED")
    public void setRadioTechnology(int state) {
        this.mRadioTechnology = state;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.886 -0400", hash_original_method = "C1350CF85A5CAF49D330DF5D8BE50D5D", hash_generated_method = "62E7E29AB3EB805EBAD797E9DF58B733")
    public void setCssIndicator(int css) {
        this.mCssIndicator = (css != 0);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.887 -0400", hash_original_method = "A7D542E3F6857DF89C73ABBE482A1544", hash_generated_method = "9F8AA35149F291326BF5B14CCD791B63")
    public void setSystemAndNetworkId(int systemId, int networkId) {
        this.mSystemId = systemId;
        this.mNetworkId = networkId;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.887 -0400", hash_original_method = "D4EB1377E20B241083847F14436F60D5", hash_generated_method = "44D44DBC6BC60B051C344BBA3C06123F")
    public int getRadioTechnology() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_614532155 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_614532155;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.887 -0400", hash_original_method = "5F3502ED7337480E1E948E539B84EEE6", hash_generated_method = "7DF8A3B6DA9ABE3AD25DEA97668070E7")
    public int getCssIndicator() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1844742896 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1844742896;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_method = "909C93F66AD557988A123F548D8C31FC", hash_generated_method = "C49F53E0969FE23BA6B3B468535CC7E7")
    public int getNetworkId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_261343632 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_261343632;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_method = "E5E4F22C1EB64E5BA2863333F6C891A3", hash_generated_method = "53180F9686FA7FD2B651319794391964")
    public int getSystemId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1976193806 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1976193806;
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "8C61C83FB4E7AA2A98C50A63D7FB9679", hash_generated_field = "90DFE6F4299DB554E753A7D7707C6EC5")

    static final String LOG_TAG = "PHONE";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "DFE276EB0C823842EF855AF4B25A8E41", hash_generated_field = "D4DA810B4309B0137A4C6CA6DD383CFC")

    public static final int STATE_IN_SERVICE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "A23E5B93FCF62550E466DD3B21E5198C", hash_generated_field = "6165D29D905D19750F0A9DE22A8A53C2")

    public static final int STATE_OUT_OF_SERVICE = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "C3C58662B81A99F94F7C9BD99E2E2D7E", hash_generated_field = "433D04CF22E8C23923507689C0477A99")

    public static final int STATE_EMERGENCY_ONLY = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "2B4038E73E1DCCDEB356B7CD832BB771", hash_generated_field = "18C40DF24AF984CE9874FCC6875A6343")

    public static final int STATE_POWER_OFF = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "5E503CF4156174712E67B46DBE2D2BA2", hash_generated_field = "9712258E802DA3ED989389F045EDBA1A")

    public static final int RADIO_TECHNOLOGY_UNKNOWN = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "D7A11B00D11750D77A0850A28940B545", hash_generated_field = "53DCC682B5BBB9CB75BA97796B6561BB")

    public static final int RADIO_TECHNOLOGY_GPRS = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "4F6F78B0721A941F737E09CE7E7E10AE", hash_generated_field = "5121DC59CF8D156F977EF7336A301147")

    public static final int RADIO_TECHNOLOGY_EDGE = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "CCEDA4460EF3B8AA09E1F09BAB93B2CB", hash_generated_field = "0BA1F4B56C3B9BE3C2DA28D833330E22")

    public static final int RADIO_TECHNOLOGY_UMTS = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "AF2D7265EC535DDC2AC35EAED2C85F78", hash_generated_field = "0516074D7A82B12EB0195842FAE4AA93")

    public static final int RADIO_TECHNOLOGY_IS95A = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "4806486F823941163FA96DD5B70376CD", hash_generated_field = "FA32FC0EB67EB73FF6D37F90F71F2BE9")

    public static final int RADIO_TECHNOLOGY_IS95B = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "3B20C7AFC665D2367751707302DFF6B7", hash_generated_field = "66F083504B1C50230E428A2D44E6EAE8")

    public static final int RADIO_TECHNOLOGY_1xRTT = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "737E6F93A23C356A696AAE6FFE221B31", hash_generated_field = "138AB1199C355BEEBF16B22133EDD699")

    public static final int RADIO_TECHNOLOGY_EVDO_0 = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "FB2971BB540835D29408C3D87E4CA087", hash_generated_field = "AE4AC5BF82EAD16952B8A2F30BA99473")

    public static final int RADIO_TECHNOLOGY_EVDO_A = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "C8C04A15D5A1F69CAC03F14D89FE2B3D", hash_generated_field = "45E9F5C5A9A8C6710E88D5C13A6AA5CF")

    public static final int RADIO_TECHNOLOGY_HSDPA = 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "E67A046DC863078FBA812E814D92413C", hash_generated_field = "8C916E1E972FAC33F453251906BB8618")

    public static final int RADIO_TECHNOLOGY_HSUPA = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "24A9E61F74F94BE8460E19B4488824BF", hash_generated_field = "0F990CDC0C2D85778ED991166928E3F8")

    public static final int RADIO_TECHNOLOGY_HSPA = 11;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "3D44136A117D9BA7D9EA88A58A039E09", hash_generated_field = "57BEAE7316A82F5B4FDA5AC5B1D0BA04")

    public static final int RADIO_TECHNOLOGY_EVDO_B = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "E76AA457D567BE7FF27AE4C5A8C57D75", hash_generated_field = "5468C0680D39ACC0465B47E045D6B87A")

    public static final int RADIO_TECHNOLOGY_EHRPD = 13;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "793CE00A9268A7F2C77115C139928D47", hash_generated_field = "B333A72E9303D6192C5A5F65A354E0A7")

    public static final int RADIO_TECHNOLOGY_LTE = 14;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "1F07D7BB3CAE4D01C69F6638DD4806F1", hash_generated_field = "0DF2145AB4059C4274A4A33D95DEEEC3")

    public static final int RADIO_TECHNOLOGY_HSPAP = 15;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.888 -0400", hash_original_field = "E62FCE33AA087A2EE1670CB51FC82B12", hash_generated_field = "08F9943596D6A0EB0E3E020EC7E3A6DC")

    public static final int REGISTRATION_STATE_NOT_REGISTERED_AND_NOT_SEARCHING = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.889 -0400", hash_original_field = "06F58165C43F819F0449A292929F5E29", hash_generated_field = "C717A5D9CF6EE32D24A631EC9B6FE25B")

    public static final int REGISTRATION_STATE_HOME_NETWORK = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.889 -0400", hash_original_field = "070F34F0BCF9E452543590B6153EBD55", hash_generated_field = "7BE02B1F7C64616DF35D4FF714C54BEB")

    public static final int REGISTRATION_STATE_NOT_REGISTERED_AND_SEARCHING = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.889 -0400", hash_original_field = "9B5DC53A551B1F3ACA5F609DF3D706A7", hash_generated_field = "9D96B09C8D1C9077BD74743C9DD9D3B1")

    public static final int REGISTRATION_STATE_REGISTRATION_DENIED = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.889 -0400", hash_original_field = "D1FD381D69D39D059E445CE2A03E5E4C", hash_generated_field = "4D4527A5261773B620CB1F75A5825BDF")

    public static final int REGISTRATION_STATE_UNKNOWN = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.889 -0400", hash_original_field = "420C5E39129544F1C296B2592F8EFB86", hash_generated_field = "5DEAE742B946B04BF20D07D152314109")

    public static final int REGISTRATION_STATE_ROAMING = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.889 -0400", hash_original_field = "2BABBC683D40DD9B077BB89204C6FFF8", hash_generated_field = "26E35B0BD5EE8B6AA0A817986D304020")

    public static final Parcelable.Creator<ServiceState> CREATOR =
            new Parcelable.Creator<ServiceState>() {
        public ServiceState createFromParcel(Parcel in) {
            return new ServiceState(in);
        }

        public ServiceState[] newArray(int size) {
            return new ServiceState[size];
        }
    };
    
    public ServiceState createFromParcel(Parcel in) {
            return new ServiceState(in);
        }
    
    
    public ServiceState[] newArray(int size) {
            return new ServiceState[size];
        }
    
}

