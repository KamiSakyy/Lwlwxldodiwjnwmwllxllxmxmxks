package c21;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements IInterface {
    public IBinder f;

    public q(IBinder iBinder) {
        this.f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }

    public final void e(x xVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(xVar);
            obtain.writeInt(1);
            c0.a(gVar, obtain, 0);
            this.f.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
