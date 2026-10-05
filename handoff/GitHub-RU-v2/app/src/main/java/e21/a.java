package e21;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements IInterface {
    public final IBinder f;
    public final String g;

    public a(IBinder iBinder, String str) {
        this.f = iBinder;
        this.g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }
}
