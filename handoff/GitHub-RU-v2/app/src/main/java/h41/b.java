package h41;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements d, IInterface {
    public IBinder f;

    public b(IBinder iBinder) {
        this.f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }
}
