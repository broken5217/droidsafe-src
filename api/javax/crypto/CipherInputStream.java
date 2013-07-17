package javax.crypto;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import libcore.io.Streams;

public class CipherInputStream extends FilterInputStream {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.015 -0400", hash_original_field = "08406A6E18BDF83010DDD1187251454D", hash_generated_field = "2FF9F58B969F4213F59ABA296D3A8FC3")

    private Cipher cipher;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.015 -0400", hash_original_field = "1C6A093D4E3019AF780588E22F29DB24", hash_generated_field = "DBE86B18DCC7D2F72C0A6792DDA95D4C")

    private final byte[] inputBuffer = new byte[I_BUFFER_SIZE];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.016 -0400", hash_original_field = "6A992D5529F459A44FEE58C733255E86", hash_generated_field = "56A277C77B76B31C1E1045C8C11CA802")

    private int index;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.016 -0400", hash_original_field = "3CB9A7E0FBC6B327ED62DC6D9B31EDBE", hash_generated_field = "C130DF454E55F573D8007DE087170612")

    private byte[] outputBuffer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.016 -0400", hash_original_field = "A5D7CEB2C59B8CEE46C2953FEC9ABC19", hash_generated_field = "3E2B0E3E2E572DECE0B20D77E19B79CF")

    private boolean finished;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.016 -0400", hash_original_method = "EC8926C4C5D7C4B05365DF92BFAEAD8D", hash_generated_method = "A61B5C4D00E8183E333A03FBE9C75319")
    public  CipherInputStream(InputStream is, Cipher c) {
        super(is);
        addTaint(is.getTaint());
        this.cipher = c;
        // ---------- Original Method ----------
        //this.cipher = c;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.016 -0400", hash_original_method = "3F50D5CECF426A3B563FBE87D10C056C", hash_generated_method = "2FF9A740F35195A4ED096B5DB6CBA1D4")
    protected  CipherInputStream(InputStream is) {
        this(is, new NullCipher());
        addTaint(is.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.018 -0400", hash_original_method = "352555B7350AF9FC6F75FE9A04D77107", hash_generated_method = "4C7E522DB5A7FD20D24E03E4FE1AD49E")
    @Override
    public int read() throws IOException {
        if(finished)        
        {
            int var5E4B070C21C404399963F0EFF86D538C_396985922 = (((outputBuffer == null) || (index == outputBuffer.length))
                            ? -1
                            : outputBuffer[index++] & 0xFF);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1215658247 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1215658247;
        } //End block
        if((outputBuffer != null) && (index < outputBuffer.length))        
        {
            int var848357DABED5A612DE4CE8610A8C5E73_1171342166 = (outputBuffer[index++] & 0xFF);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1371556148 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1371556148;
        } //End block
        index = 0;
        outputBuffer = null;
        int byteCount;
        while
(outputBuffer == null)        
        {
            if((byteCount = in.read(inputBuffer)) == -1)            
            {
                try 
                {
                    outputBuffer = cipher.doFinal();
                } //End block
                catch (Exception e)
                {
                    IOException varDFC4605B531BC1C5380FD94E58912494_631446787 = new IOException(e.getMessage());
                    varDFC4605B531BC1C5380FD94E58912494_631446787.addTaint(taint);
                    throw varDFC4605B531BC1C5380FD94E58912494_631446787;
                } //End block
                finished = true;
                break;
            } //End block
            outputBuffer = cipher.update(inputBuffer, 0, byteCount);
        } //End block
        int varE7E34719EF211F19813DDD55A235C6DD_1235538965 = (read());
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1935090024 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1935090024;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.019 -0400", hash_original_method = "B8FB2A7CB3FB3DB7D0751D6D604C7303", hash_generated_method = "6FB8C976FE51452812BC41E182E656C1")
    @Override
    public int read(byte[] buf, int off, int len) throws IOException {
        addTaint(len);
        addTaint(off);
        addTaint(buf[0]);
        if(in == null)        
        {
            NullPointerException varFBA351A1EA49D8F5DF9241EE589B5CD1_1693838466 = new NullPointerException("Underlying input stream is null");
            varFBA351A1EA49D8F5DF9241EE589B5CD1_1693838466.addTaint(taint);
            throw varFBA351A1EA49D8F5DF9241EE589B5CD1_1693838466;
        } //End block
        int i;
for(i = 0;i < len;++i)
        {
            int b = read();
            if(b == -1)            
            {
                int var9094914C036467CD32E9F7E210E518F4_1565541616 = ((i == 0) ? -1 : i);
                                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1190093147 = getTaintInt();
                return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1190093147;
            } //End block
            if(buf != null)            
            {
                buf[off+i] = (byte) b;
            } //End block
        } //End block
        int var865C0C0B4AB0E063E5CAA3387C1A8741_1885332535 = (i);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1637133395 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1637133395;
        // ---------- Original Method ----------
        //if (in == null) {
            //throw new NullPointerException("Underlying input stream is null");
        //}
        //int i;
        //for (i = 0; i < len; ++i) {
            //int b = read();
            //if (b == -1) {
                //return (i == 0) ? -1 : i;
            //}
            //if (buf != null) {
                //buf[off+i] = (byte) b;
            //}
        //}
        //return i;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.020 -0400", hash_original_method = "B0B2C5ABB0F3ADBF684B825EB14D5721", hash_generated_method = "3B56F193734F401210EE8437BA56325A")
    @Override
    public long skip(long byteCount) throws IOException {
        addTaint(byteCount);
        long var905193B4CE519E6DD3D91E1E370ADA87_2127114094 = (Streams.skipByReading(this, byteCount));
                long var0F5264038205EDFB1AC05FBB0E8C5E94_2087271529 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_2087271529;
        // ---------- Original Method ----------
        //return Streams.skipByReading(this, byteCount);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.021 -0400", hash_original_method = "1AA324AC6812BCD54DB71C20D6BA0F20", hash_generated_method = "07C7345509631265BDD9D74E277035FC")
    @Override
    public int available() throws IOException {
        int varCFCD208495D565EF66E7DFF9F98764DA_261678484 = (0);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1321527408 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1321527408;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.021 -0400", hash_original_method = "6325F2669A2E29C02EEAA5CF85C35B84", hash_generated_method = "115CDDC28840CEF197601EFC797FBC94")
    @Override
    public void close() throws IOException {
        in.close();
        try 
        {
            cipher.doFinal();
        } //End block
        catch (GeneralSecurityException ignore)
        {
        } //End block
        // ---------- Original Method ----------
        //in.close();
        //try {
            //cipher.doFinal();
        //} catch (GeneralSecurityException ignore) {
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.022 -0400", hash_original_method = "12DAC0CE56878A53F37AFF65E12010EB", hash_generated_method = "AD9206057188719D03D9E961862E6350")
    @Override
    public boolean markSupported() {
        boolean var68934A3E9455FA72420237EB05902327_119160323 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_205228715 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_205228715;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.022 -0400", hash_original_field = "A29FB0C364C3EA5226F70883A8BDBB44", hash_generated_field = "15654AA7FE9DD715F5D7B5D292F8279E")

    private static final int I_BUFFER_SIZE = 20;
}

