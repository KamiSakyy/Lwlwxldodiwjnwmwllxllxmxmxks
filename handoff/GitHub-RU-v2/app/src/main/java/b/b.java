package b;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements d {

    /* renamed from: f, reason: collision with root package name */
    public IBinder f3241f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3241f;
    }

    public final boolean e(u.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f3243b);
            obtain.writeStrongInterface(aVar);
            this.f3241f.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean f() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f3243b);
            obtain.writeLong(0L);
            this.f3241f.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
