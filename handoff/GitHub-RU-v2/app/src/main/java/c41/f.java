package c41;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h, IInterface {
    public final IBinder f;

    public f(IBinder iBinder) {
        this.f = iBinder;
    }

    @Override // c41.h
    public final void C(String str, Bundle bundle, b41.i iVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = e.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(iVar);
        try {
            this.f.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // c41.h
    public final void K(String str, Bundle bundle, b41.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = e.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }
}
