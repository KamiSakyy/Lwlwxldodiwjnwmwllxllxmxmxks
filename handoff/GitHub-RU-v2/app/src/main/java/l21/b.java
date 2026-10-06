package l21;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements d, IInterface {
    public IBinder f;

    public b(IBinder iBinder) {
        this.f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }

    public final Parcel e(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f.transact(i, parcel, obtain, 0);
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
}
