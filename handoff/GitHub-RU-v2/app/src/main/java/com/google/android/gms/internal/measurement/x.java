package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x implements IInterface {
    public final /* synthetic */ int f;
    public IBinder g;
    public String h;

    public /* synthetic */ x(IBinder iBinder, String str, int i) {
        this.f = i;
        this.g = iBinder;
        this.h = str;
    }

    public void L(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.g.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void M(Parcel parcel) {
        try {
            this.g.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel N() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.h);
        return obtain;
    }

    public Parcel O(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f) {
        }
        return this.g;
    }

    public Parcel e(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel f(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel g() {
        switch (this.f) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.h);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.h);
                return obtain2;
        }
    }















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0 {
        public q0() {
        }
    }

    public x(Object... a) {
    }
}
