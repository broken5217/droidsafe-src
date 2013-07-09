package java.lang;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

public class SecurityManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.668 -0400", hash_original_field = "F4FDA642396C90310EC38E0D5B8E09CF", hash_generated_field = "9E5AF9E744782F4ACD2178CD4DBD0985")

    @Deprecated protected boolean inCheck;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.669 -0400", hash_original_method = "7FD71E6D3FB4A8DD9BF04FA4D2AAA4D4", hash_generated_method = "10F82CBF8C065A15711155F7BC44F06C")
    public  SecurityManager() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.669 -0400", hash_original_method = "33353E03F38CCE3C205F21DCE963F727", hash_generated_method = "902E6665936150FB1075FCBFBB47585A")
    public void checkAccept(String host, int port) {
        addTaint(host.getTaint());
        addTaint(port);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.669 -0400", hash_original_method = "36F107888B3E77E3CF49B5177EDF7E9A", hash_generated_method = "72F10715B7EBCE4C227C6DB3FC159E42")
    public void checkAccess(Thread thread) {
        addTaint(thread.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.669 -0400", hash_original_method = "5AA7E51DAAAF233E2DDB8D1EE8363A8E", hash_generated_method = "99A309E9A2C5464D9B2CDB9DCCFF4A78")
    public void checkAccess(ThreadGroup group) {
        addTaint(group.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.670 -0400", hash_original_method = "3BD498F27EF913D40B889A93E2AA24F9", hash_generated_method = "0B37F5465274F7FCCB8F26D23091F705")
    public void checkConnect(String host, int port) {
        addTaint(host.getTaint());
        addTaint(port);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.670 -0400", hash_original_method = "2D5E761F7C6DB4BDDDC273A07ED405C0", hash_generated_method = "E5B771F960083FF1223E692A606CEF1E")
    public void checkConnect(String host, int port, Object context) {
        addTaint(host.getTaint());
        addTaint(port);
        addTaint(context.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.670 -0400", hash_original_method = "8490F7E6ADD8012AF63244E1903E9866", hash_generated_method = "4206A8859EFB69212A75A66F61C96B51")
    public void checkCreateClassLoader() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.670 -0400", hash_original_method = "0B17A1C3AA9D11809AA604D4E5BD4994", hash_generated_method = "C0EEE7D1DCEACAFD7B7E8E98D1DF86E9")
    public void checkDelete(String file) {
        addTaint(file.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.671 -0400", hash_original_method = "7C003C59CAB570CD3B63381DBAA3AF4E", hash_generated_method = "CE6D4D345373C4499DFCDEF8C7D24F30")
    public void checkExec(String cmd) {
        addTaint(cmd.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.671 -0400", hash_original_method = "8A9ADA58552041193904C8083A11F7F6", hash_generated_method = "85A8F17F16315507E32ED111E4F8DC54")
    public void checkExit(int status) {
        addTaint(status);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.671 -0400", hash_original_method = "75433C5D6CF4249C0EE246BC57BF57E2", hash_generated_method = "A6308F1604D4F72B910F5E945C6AFD1A")
    public void checkLink(String libName) {
        addTaint(libName.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.672 -0400", hash_original_method = "5412847302AF42E3061C6779693DB418", hash_generated_method = "42823686AFF9259B448D6BCA7F8D9E1F")
    public void checkListen(int port) {
        addTaint(port);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.672 -0400", hash_original_method = "8873C7B5DD5CF23CB18ABA2720E20660", hash_generated_method = "78E5AEB94A4195904BEF9E8D9F0CC758")
    public void checkMemberAccess(Class<?> cls, int type) {
        addTaint(cls.getTaint());
        addTaint(type);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.672 -0400", hash_original_method = "0D776561D024E069F4378E17ED49E5AF", hash_generated_method = "CD04AB806DD8004F3454B62D501B8A3E")
    public void checkMulticast(InetAddress maddr) {
        addTaint(maddr.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.673 -0400", hash_original_method = "B705963A40DC1EBCB270E0041777CD02", hash_generated_method = "ECED96526F7DD2BB0CA90F501E155615")
    @Deprecated
    public void checkMulticast(InetAddress maddr, byte ttl) {
        addTaint(maddr.getTaint());
        addTaint(ttl);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.673 -0400", hash_original_method = "1E8CF02717496E9B31EA8F152A6EAAD3", hash_generated_method = "E78009F77D21AD351B9F00709CE91252")
    public void checkPackageAccess(String packageName) {
        addTaint(packageName.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.673 -0400", hash_original_method = "15FB53D386245A148D9A0D9EA27D53FA", hash_generated_method = "C15CFAC88208691568D6CB0DCC9CE5A4")
    public void checkPackageDefinition(String packageName) {
        addTaint(packageName.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.674 -0400", hash_original_method = "03937928889C65B1E71F0E79371D5926", hash_generated_method = "1777D1D5A96109E8F9520DDCD5330AEF")
    public void checkPropertiesAccess() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.674 -0400", hash_original_method = "2BC6BA97AA7103DE882EC8441211CBCF", hash_generated_method = "3F5D5D91225C3E7249BC053F3FB9687B")
    public void checkPropertyAccess(String key) {
        addTaint(key.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.674 -0400", hash_original_method = "3B0F34A9B39090E476EB90B81040C7D1", hash_generated_method = "4E4FF2488CB2AB16FC934A067F60D492")
    public void checkRead(FileDescriptor fd) {
        addTaint(fd.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.674 -0400", hash_original_method = "51BADDB31E600F7C9A9DCE17CAEE4ABD", hash_generated_method = "136086F9E0B3E6ED1A63EEA383102169")
    public void checkRead(String file) {
        addTaint(file.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.675 -0400", hash_original_method = "69F9067A125A221CFB426CF2266303C7", hash_generated_method = "2BC86088636D58378DAF302F8261BFE6")
    public void checkRead(String file, Object context) {
        addTaint(file.getTaint());
        addTaint(context.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.675 -0400", hash_original_method = "2231CD521BF6360DD9009A387DA65FE2", hash_generated_method = "9343873B55A4E26327F15A92615993B5")
    public void checkSecurityAccess(String target) {
        addTaint(target.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.675 -0400", hash_original_method = "F217CE0DC3EB310EAAAF9D4806D2E409", hash_generated_method = "8A03D75B144D71C0D274D98D79E3AE2A")
    public void checkSetFactory() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.675 -0400", hash_original_method = "E08658A8A8D2FA3A353C142735F36A84", hash_generated_method = "DA049E5405267408399C01F148C310E0")
    public boolean checkTopLevelWindow(Object window) {
        addTaint(window.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1209533920 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1209533920;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.676 -0400", hash_original_method = "8AB55486AE4ED05EAE2D015F13C35436", hash_generated_method = "0F61F5AD77B8F62ABFA4EC158605A22B")
    public void checkSystemClipboardAccess() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.676 -0400", hash_original_method = "CF92AB5D995750BFB7FF9F031A4246A8", hash_generated_method = "2397CF2F184F1284560FAE451934637C")
    public void checkAwtEventQueueAccess() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.676 -0400", hash_original_method = "58C1D3B2A93E82E28FD99A55EC6954F5", hash_generated_method = "C3B834D6C36A5606179169AB3721866E")
    public void checkPrintJobAccess() {
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.676 -0400", hash_original_method = "5C84ACAAF82CCDAC7FC44A08CB5F593D", hash_generated_method = "2C6B4C77968C6B13E9A0BE32764D4398")
    public void checkWrite(FileDescriptor fd) {
        addTaint(fd.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.676 -0400", hash_original_method = "2871DB4234901BDC284DA13B123CE1AB", hash_generated_method = "48731BDFFD8650FE95B39F47B3FCA190")
    public void checkWrite(String file) {
        addTaint(file.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.676 -0400", hash_original_method = "866416E1EAC2C07A5E7D767D9B266DDC", hash_generated_method = "4CEE711C2F7D6E1DD80DE51BA2C3B7AC")
    @Deprecated
    public boolean getInCheck() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2077944074 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2077944074;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.677 -0400", hash_original_method = "A7EABFC12C747C29197C1D84213DA551", hash_generated_method = "C64C1D93D6AF92B846F995D960FD7DF0")
    protected Class[] getClassContext() {
        Class[] varB4EAC82CA7396A68D541C85D26508E83_631611384 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_631611384 = null;
        varB4EAC82CA7396A68D541C85D26508E83_631611384.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_631611384;
        
        
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.677 -0400", hash_original_method = "B5AF7ACC7C1515B2CC77D7C50B13C496", hash_generated_method = "D112C3025710009C6F70E520097AFC85")
    @Deprecated
    protected ClassLoader currentClassLoader() {
        ClassLoader varB4EAC82CA7396A68D541C85D26508E83_1098779670 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1098779670 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1098779670.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1098779670;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.677 -0400", hash_original_method = "2F5894A33E5089040E95C5A71AB1D464", hash_generated_method = "7E41DE68139D15DD0A36577CE4447911")
    @Deprecated
    protected int classLoaderDepth() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_65786454 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_65786454;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.678 -0400", hash_original_method = "971A50644C25A1AA23F94C545B2EFE88", hash_generated_method = "B7F25CE51E8FC9EC2F459769D4453BB3")
    @Deprecated
    protected Class<?> currentLoadedClass() {
        Class<?> varB4EAC82CA7396A68D541C85D26508E83_2091062227 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_2091062227 = null;
        varB4EAC82CA7396A68D541C85D26508E83_2091062227.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2091062227;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.678 -0400", hash_original_method = "3141DB701376F59132D2E47A865226CE", hash_generated_method = "276C560BF2731FA960546256AB9A3F1B")
    @Deprecated
    protected int classDepth(String name) {
        addTaint(name.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_57364370 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_57364370;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.678 -0400", hash_original_method = "F03BE1FF5759480A79EF8F803256FC0D", hash_generated_method = "1937A337FBA4E047A649B9ADE4AB6FBA")
    @Deprecated
    protected boolean inClass(String name) {
        addTaint(name.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_983005813 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_983005813;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.678 -0400", hash_original_method = "AD16BBA5AF716809FD60AB92F9D52E9A", hash_generated_method = "9226FFE3E85B1E924F3DB269C4D11996")
    @Deprecated
    protected boolean inClassLoader() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1027756964 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1027756964;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.679 -0400", hash_original_method = "036AF7AD226EFB7B513484DD9E6E1DD6", hash_generated_method = "2C57ACA67816115FFD0E5107037FE424")
    public ThreadGroup getThreadGroup() {
        ThreadGroup varB4EAC82CA7396A68D541C85D26508E83_1042490249 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1042490249 = Thread.currentThread().getThreadGroup();
        varB4EAC82CA7396A68D541C85D26508E83_1042490249.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1042490249;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.679 -0400", hash_original_method = "9105FFA72B51771391C0727CF897942D", hash_generated_method = "2D129E22E4031BDC36CEFEF1C8478073")
    public Object getSecurityContext() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1864975197 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1864975197 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1864975197.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1864975197;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.680 -0400", hash_original_method = "F83ED49980C30C3CF74F8E7C00892337", hash_generated_method = "EFE73C5746AC3B5ACE7F01EE1BE54C73")
    public void checkPermission(Permission permission) {
        addTaint(permission.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:50.680 -0400", hash_original_method = "9F219EE7931C25AFA3551D0D45001223", hash_generated_method = "18A5D5DC89DAE9439BB98F5C47996330")
    public void checkPermission(Permission permission, Object context) {
        addTaint(permission.getTaint());
        addTaint(context.getTaint());
        
    }

    
}

