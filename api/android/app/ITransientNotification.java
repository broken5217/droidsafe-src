package android.app;

// Droidsafe Imports
import droidsafe.annotations.*;

public interface ITransientNotification extends android.os.IInterface
{

public static abstract class Stub extends android.os.Binder implements android.app.ITransientNotification
{
private static final java.lang.String DESCRIPTOR = "android.app.ITransientNotification";

@DSModeled(DSC.BAN)
        public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}

public static android.app.ITransientNotification asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.ITransientNotification))) {
return ((android.app.ITransientNotification)iin);
}
return new android.app.ITransientNotification.Stub.Proxy(obj);
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
case TRANSACTION_show:
{
data.enforceInterface(DESCRIPTOR);
this.show();
return true;
}
case TRANSACTION_hide:
{
data.enforceInterface(DESCRIPTOR);
this.hide();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.ITransientNotification
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
@DSModeled(DSC.BAN)
            public void show() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_show, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@DSModeled(DSC.BAN)
            public void hide() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hide, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_show = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_hide = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void show() throws android.os.RemoteException;
public void hide() throws android.os.RemoteException;
}
