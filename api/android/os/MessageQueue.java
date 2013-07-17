package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.util.AndroidRuntimeException;
import android.util.Log;
import java.util.ArrayList;

public class MessageQueue {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.641 -0400", hash_original_field = "F0A93F453266A0E24808893EDA6F3279", hash_generated_field = "4CD2256F13C791768C1C46ADDB2DD4CF")

    Message mMessages;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.641 -0400", hash_original_field = "EECCB023985CC9B16019C860E5A15B6E", hash_generated_field = "9FB9E39B5A909D64069FF435A199CC07")

    private final ArrayList<IdleHandler> mIdleHandlers = new ArrayList<IdleHandler>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.641 -0400", hash_original_field = "A1A0DE92EC477644372CE069AE7B8A27", hash_generated_field = "9ECE673ABB53E3B4A3FD3EACB7D57DE3")

    private IdleHandler[] mPendingIdleHandlers;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.641 -0400", hash_original_field = "0A7C611CE1BAB08B280C8FB0CED45EC0", hash_generated_field = "8D159A051416488D8C3D9A0DE1446123")

    private boolean mQuiting;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.641 -0400", hash_original_field = "0459E5A08C15937A6515081D4871BBC5", hash_generated_field = "76FCB0C059FE9E4D676BDC9706D4EFC3")

    boolean mQuitAllowed = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.642 -0400", hash_original_field = "FAF0A23D92ADF0F321BB109C77D5A9BC", hash_generated_field = "E847C74EBFAB1303FF64CBEBF73D5F3A")

    private boolean mBlocked;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.642 -0400", hash_original_field = "34F930F150EAEEFF27D6C0C8E4629911", hash_generated_field = "F6CBBCA427D08C52E84BEBFADDF6C4B3")

    @SuppressWarnings("unused") private int mPtr;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.642 -0400", hash_original_method = "024946A17D31C4FE5B39BFCF4854F539", hash_generated_method = "706665B871FA624C873ACD826DBDE13E")
      MessageQueue() {
        nativeInit();
        // ---------- Original Method ----------
        //nativeInit();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.642 -0400", hash_original_method = "22793401C0EAEE553460FBFE217265A2", hash_generated_method = "8042F95F79F7CE85F17E653A09698261")
    private void nativeInit() {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.642 -0400", hash_original_method = "E34EA3919C76BD220428BD59B66C56DD", hash_generated_method = "1439525E8540D7F69358452344174A0D")
    private void nativeDestroy() {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.643 -0400", hash_original_method = "6B1221F32AD6E733E25E3C4E5A3B3304", hash_generated_method = "E68E2F879822840F7A9D106BA1192115")
    private void nativePollOnce(int ptr, int timeoutMillis) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.643 -0400", hash_original_method = "29C673C89C7A5B5047FFC8F646EEAF46", hash_generated_method = "30625EDBBCA95C5F841D5787B682A772")
    private void nativeWake(int ptr) {
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.643 -0400", hash_original_method = "58A601CE5384C8EEE6AAD65D97957616", hash_generated_method = "6F49F977F5374DC6C53637CDFFA33A3B")
    public final void addIdleHandler(IdleHandler handler) {
        addTaint(handler.getTaint());
        if(handler == null)        
        {
            NullPointerException var5D5210E7D516DFF89C3B34535A806DE1_1976499532 = new NullPointerException("Can't add a null IdleHandler");
            var5D5210E7D516DFF89C3B34535A806DE1_1976499532.addTaint(taint);
            throw var5D5210E7D516DFF89C3B34535A806DE1_1976499532;
        } //End block
        synchronized
(this)        {
            mIdleHandlers.add(handler);
        } //End block
        // ---------- Original Method ----------
        //if (handler == null) {
            //throw new NullPointerException("Can't add a null IdleHandler");
        //}
        //synchronized (this) {
            //mIdleHandlers.add(handler);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.644 -0400", hash_original_method = "42E54E0638259D139421664F7CE4D7BC", hash_generated_method = "260EEDF16C480554EED635381949B011")
    public final void removeIdleHandler(IdleHandler handler) {
        addTaint(handler.getTaint());
        synchronized
(this)        {
            mIdleHandlers.remove(handler);
        } //End block
        // ---------- Original Method ----------
        //synchronized (this) {
            //mIdleHandlers.remove(handler);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.644 -0400", hash_original_method = "BA2F30DE255200D64377C35EBFA66603", hash_generated_method = "B6181847352A89BC6D1ACDC91A76C576")
    @Override
    protected void finalize() throws Throwable {
        try 
        {
            nativeDestroy();
        } //End block
        finally 
        {
            super.finalize();
        } //End block
        // ---------- Original Method ----------
        //try {
            //nativeDestroy();
        //} finally {
            //super.finalize();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.647 -0400", hash_original_method = "FE8F633895A73ADF340290B052DEE51B", hash_generated_method = "D514CF40B8637E8CBA7288491ECB9305")
    final Message next() {
        int pendingIdleHandlerCount = -1;
        int nextPollTimeoutMillis = 0;
for(;;)
        {
            if(nextPollTimeoutMillis != 0)            
            {
                Binder.flushPendingCommands();
            } //End block
            nativePollOnce(mPtr, nextPollTimeoutMillis);
            synchronized
(this)            {
                final long now = SystemClock.uptimeMillis();
                final Message msg = mMessages;
                if(msg != null)                
                {
                    final long when = msg.when;
                    if(now >= when)                    
                    {
                        mBlocked = false;
                        mMessages = msg.next;
                        msg.next = null;
                        if(false){ }                        msg.markInUse();
Message varEDC5B72465A7F0BEE288689BCB1DD141_921513398 =                         msg;
                        varEDC5B72465A7F0BEE288689BCB1DD141_921513398.addTaint(taint);
                        return varEDC5B72465A7F0BEE288689BCB1DD141_921513398;
                    } //End block
                    else
                    {
                        nextPollTimeoutMillis = (int) Math.min(when - now, Integer.MAX_VALUE);
                    } //End block
                } //End block
                else
                {
                    nextPollTimeoutMillis = -1;
                } //End block
                if(pendingIdleHandlerCount < 0)                
                {
                    pendingIdleHandlerCount = mIdleHandlers.size();
                } //End block
                if(pendingIdleHandlerCount == 0)                
                {
                    mBlocked = true;
                    continue;
                } //End block
                if(mPendingIdleHandlers == null)                
                {
                    mPendingIdleHandlers = new IdleHandler[Math.max(pendingIdleHandlerCount, 4)];
                } //End block
                mPendingIdleHandlers = mIdleHandlers.toArray(mPendingIdleHandlers);
            } //End block
for(int i = 0;i < pendingIdleHandlerCount;i++)
            {
                final IdleHandler idler = mPendingIdleHandlers[i];
                mPendingIdleHandlers[i] = null;
                boolean keep = false;
                try 
                {
                    keep = idler.queueIdle();
                } //End block
                catch (Throwable t)
                {
                    Log.wtf("MessageQueue", "IdleHandler threw exception", t);
                } //End block
                if(!keep)                
                {
                    synchronized
(this)                    {
                        mIdleHandlers.remove(idler);
                    } //End block
                } //End block
            } //End block
            pendingIdleHandlerCount = 0;
            nextPollTimeoutMillis = 0;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.651 -0400", hash_original_method = "396D043333DC708706987577D4517B14", hash_generated_method = "E877E3B7B261E4615DBDCE306BF4CAFB")
    final boolean enqueueMessage(Message msg, long when) {
        addTaint(when);
        if(msg.isInUse())        
        {
            AndroidRuntimeException var7611DAF5A8C0D17F0C6E6AF3F8C7C3C3_128861368 = new AndroidRuntimeException(msg
                    + " This message is already in use.");
            var7611DAF5A8C0D17F0C6E6AF3F8C7C3C3_128861368.addTaint(taint);
            throw var7611DAF5A8C0D17F0C6E6AF3F8C7C3C3_128861368;
        } //End block
        if(msg.target == null && !mQuitAllowed)        
        {
            RuntimeException var0E5D5E1A88532ABF3F01DF6D3F574CE2_1972986614 = new RuntimeException("Main thread not allowed to quit");
            var0E5D5E1A88532ABF3F01DF6D3F574CE2_1972986614.addTaint(taint);
            throw var0E5D5E1A88532ABF3F01DF6D3F574CE2_1972986614;
        } //End block
        boolean needWake;
        synchronized
(this)        {
            if(mQuiting)            
            {
                RuntimeException e = new RuntimeException(
                    msg.target + " sending message to a Handler on a dead thread");
                boolean var68934A3E9455FA72420237EB05902327_82391782 = (false);
                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_729899479 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_729899479;
            } //End block
            else
            if(msg.target == null)            
            {
                mQuiting = true;
            } //End block
            msg.when = when;
            Message p = mMessages;
            if(p == null || when == 0 || when < p.when)            
            {
                msg.next = p;
                mMessages = msg;
                needWake = mBlocked;
            } //End block
            else
            {
                Message prev = null;
                while
(p != null && p.when <= when)                
                {
                    prev = p;
                    p = p.next;
                } //End block
                msg.next = prev.next;
                prev.next = msg;
                needWake = false;
            } //End block
        } //End block
        if(needWake)        
        {
            nativeWake(mPtr);
        } //End block
        boolean varB326B5062B2F0E69046810717534CB09_1552311087 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_454742283 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_454742283;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.652 -0400", hash_original_method = "2C495FAE3014577A1BBEA9C534AF3749", hash_generated_method = "D7BAA2C8C2BDB35866A535FBBF562F3A")
    final boolean removeMessages(Handler h, int what, Object object,
            boolean doRemove) {
        addTaint(doRemove);
        addTaint(object.getTaint());
        addTaint(what);
        addTaint(h.getTaint());
        synchronized
(this)        {
            Message p = mMessages;
            boolean found = false;
            while
(p != null && p.target == h && p.what == what
                   && (object == null || p.obj == object))            
            {
                if(!doRemove)                
                {
                boolean varB326B5062B2F0E69046810717534CB09_2080816227 = (true);
                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1666103021 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_1666103021;
                }
                found = true;
                Message n = p.next;
                mMessages = n;
                p.recycle();
                p = n;
            } //End block
            while
(p != null)            
            {
                Message n = p.next;
                if(n != null)                
                {
                    if(n.target == h && n.what == what
                        && (object == null || n.obj == object))                    
                    {
                        if(!doRemove)                        
                        {
                        boolean varB326B5062B2F0E69046810717534CB09_532461391 = (true);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1876886505 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1876886505;
                        }
                        found = true;
                        Message nn = n.next;
                        n.recycle();
                        p.next = nn;
                        continue;
                    } //End block
                } //End block
                p = n;
            } //End block
            boolean var6CFE61694EE1BB13AE719D47C2F80B7A_232585678 = (found);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1589503305 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1589503305;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.653 -0400", hash_original_method = "4D91148BDAD186BF2429C10F6DC32C8E", hash_generated_method = "0311871288E2D833098BF50AACDCF05E")
    final void removeMessages(Handler h, Runnable r, Object object) {
        addTaint(object.getTaint());
        addTaint(r.getTaint());
        addTaint(h.getTaint());
        if(r == null)        
        {
            return;
        } //End block
        synchronized
(this)        {
            Message p = mMessages;
            while
(p != null && p.target == h && p.callback == r
                   && (object == null || p.obj == object))            
            {
                Message n = p.next;
                mMessages = n;
                p.recycle();
                p = n;
            } //End block
            while
(p != null)            
            {
                Message n = p.next;
                if(n != null)                
                {
                    if(n.target == h && n.callback == r
                        && (object == null || n.obj == object))                    
                    {
                        Message nn = n.next;
                        n.recycle();
                        p.next = nn;
                        continue;
                    } //End block
                } //End block
                p = n;
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.655 -0400", hash_original_method = "0BDD557AE388AA8E5DFEDF2C38C17A0C", hash_generated_method = "69B2537790E3D149C0B2906B2D250058")
    final void removeCallbacksAndMessages(Handler h, Object object) {
        addTaint(object.getTaint());
        addTaint(h.getTaint());
        synchronized
(this)        {
            Message p = mMessages;
            while
(p != null && p.target == h
                    && (object == null || p.obj == object))            
            {
                Message n = p.next;
                mMessages = n;
                p.recycle();
                p = n;
            } //End block
            while
(p != null)            
            {
                Message n = p.next;
                if(n != null)                
                {
                    if(n.target == h && (object == null || n.obj == object))                    
                    {
                        Message nn = n.next;
                        n.recycle();
                        p.next = nn;
                        continue;
                    } //End block
                } //End block
                p = n;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized (this) {
            //Message p = mMessages;
            //while (p != null && p.target == h
                    //&& (object == null || p.obj == object)) {
                //Message n = p.next;
                //mMessages = n;
                //p.recycle();
                //p = n;
            //}
            //while (p != null) {
                //Message n = p.next;
                //if (n != null) {
                    //if (n.target == h && (object == null || n.obj == object)) {
                        //Message nn = n.next;
                        //n.recycle();
                        //p.next = nn;
                        //continue;
                    //}
                //}
                //p = n;
            //}
        //}
    }

    
    public static interface IdleHandler {
        
        boolean queueIdle();
    }
    
}

