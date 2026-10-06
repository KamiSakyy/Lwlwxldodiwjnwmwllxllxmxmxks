package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y extends Binder implements IInterface {
    public y(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public abstract boolean e(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return e(i, parcel, parcel2);
    }
    public Object L(Object p1) { return null; }
    public Object S(Object p1, int p2, Object p3) { return null; }
    public Object U(Object p1, int p2, Object p3, int p4) { return null; }
    public Object V(Object p1, int p2, Object p3) { return null; }
    public Object Y(Object p1, int p2, int p3) { return null; }
    public Object Z(Object p1, int p2) { return null; }
    public Object a0(Object p1, int p2) { return null; }
    public Object o(Object p1, Object p2) { return null; }
}
