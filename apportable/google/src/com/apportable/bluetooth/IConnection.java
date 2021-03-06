/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: apportable/google/src/com/apportable/bluetooth/IConnection.aidl
 */
package com.apportable.bluetooth;
// Declare the interface.

public interface IConnection extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.apportable.bluetooth.IConnection
{
private static final java.lang.String DESCRIPTOR = "com.apportable.bluetooth.IConnection";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.apportable.bluetooth.IConnection interface,
 * generating a proxy if needed.
 */
public static com.apportable.bluetooth.IConnection asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.apportable.bluetooth.IConnection))) {
return ((com.apportable.bluetooth.IConnection)iin);
}
return new com.apportable.bluetooth.IConnection.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
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
case TRANSACTION_getAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAddress();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_startServer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.startServer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopServer:
{
data.enforceInterface(DESCRIPTOR);
this.stopServer();
reply.writeNoException();
return true;
}
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.connect(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_sendMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.sendMessage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_broadcastMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.broadcastMessage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getConnections:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getConnections(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getVersion:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getVersion();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.apportable.bluetooth.IConnectionCallback _arg1;
_arg1 = com.apportable.bluetooth.IConnectionCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.registerCallback(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.unregisterCallback(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.shutdown(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.apportable.bluetooth.IConnection
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String getAddress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAddress, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startServer(java.lang.String srcApp, int maxConnections) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
_data.writeInt(maxConnections);
mRemote.transact(Stub.TRANSACTION_startServer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void stopServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int connect(java.lang.String srcApp, java.lang.String device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
_data.writeString(device);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int sendMessage(java.lang.String srcApp, java.lang.String device, java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
_data.writeString(device);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int broadcastMessage(java.lang.String srcApp, java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_broadcastMessage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getConnections(java.lang.String srcApp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
mRemote.transact(Stub.TRANSACTION_getConnections, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int registerCallback(java.lang.String srcApp, com.apportable.bluetooth.IConnectionCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int unregisterCallback(java.lang.String srcApp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void shutdown(java.lang.String srcApp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcApp);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_broadcastMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getConnections = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
public java.lang.String getAddress() throws android.os.RemoteException;
public java.lang.String getName() throws android.os.RemoteException;
public int startServer(java.lang.String srcApp, int maxConnections) throws android.os.RemoteException;
public void stopServer() throws android.os.RemoteException;
public int connect(java.lang.String srcApp, java.lang.String device) throws android.os.RemoteException;
public int sendMessage(java.lang.String srcApp, java.lang.String device, java.lang.String message) throws android.os.RemoteException;
public int broadcastMessage(java.lang.String srcApp, java.lang.String message) throws android.os.RemoteException;
public java.lang.String getConnections(java.lang.String srcApp) throws android.os.RemoteException;
public int getVersion() throws android.os.RemoteException;
public int registerCallback(java.lang.String srcApp, com.apportable.bluetooth.IConnectionCallback cb) throws android.os.RemoteException;
public int unregisterCallback(java.lang.String srcApp) throws android.os.RemoteException;
public void shutdown(java.lang.String srcApp) throws android.os.RemoteException;
}
