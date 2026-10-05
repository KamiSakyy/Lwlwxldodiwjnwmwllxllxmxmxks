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

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
