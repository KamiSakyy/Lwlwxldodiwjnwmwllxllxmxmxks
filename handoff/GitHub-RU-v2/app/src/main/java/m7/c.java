package m7;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements d {

    /* renamed from: f, reason: collision with root package name */
    public IBinder f28960f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28960f;
    }

    @Override // m7.d
    public final void k(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f28964d);
            obtain.writeStringArray(strArr);
            this.f28960f.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
    public Object v(Object p1) { return null; }
    public Object v(Object) { return null; }
}
