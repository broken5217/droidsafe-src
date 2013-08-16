package com.android.internal.textservice;

// Droidsafe Imports
import droidsafe.annotations.*;

public interface ITextServicesSessionListener extends android.os.IInterface
{

public static abstract class Stub extends android.os.Binder implements com.android.internal.textservice.ITextServicesSessionListener
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.textservice.ITextServicesSessionListener";

@DSModeled(DSC.BAN)
        public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}

@DSModeled(DSC.SAFE)
        public static com.android.internal.textservice.ITextServicesSessionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.textservice.ITextServicesSessionListener))) {
return ((com.android.internal.textservice.ITextServicesSessionListener)iin);
}
return new com.android.internal.textservice.ITextServicesSessionListener.Stub.Proxy(obj);
}
@DSModeled(DSC.BAN)
        public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onServiceConnected:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.textservice.ISpellCheckerSession _arg0;
_arg0 = com.android.internal.textservice.ISpellCheckerSession.Stub.asInterface(data.readStrongBinder());
this.onServiceConnected(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.textservice.ITextServicesSessionListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@DSModeled(DSC.BAN)
            public android.os.IBinder asBinder()
{
return mRemote;
}
@DSModeled(DSC.BAN)
            public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession spellCheckerSession) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((spellCheckerSession!=null))?(spellCheckerSession.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onServiceConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onServiceConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession spellCheckerSession) throws android.os.RemoteException;
}
