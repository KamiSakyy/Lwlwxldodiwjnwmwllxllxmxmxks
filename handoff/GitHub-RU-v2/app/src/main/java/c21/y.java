package c21;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements ServiceConnection {
    public int r;
    public final /* synthetic */ e s;

    public y(e eVar, int i) {
        this.s = eVar;
        this.r = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        e eVar = this.s;
        if (iBinder == null) {
            synchronized (eVar.g) {
                i = eVar.n;
            }
            if (i == 3) {
                eVar.u = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            w wVar = eVar.f;
            wVar.sendMessage(wVar.obtainMessage(i2, eVar.w.get(), 16));
            return;
        }
        synchronized (eVar.h) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.i = (queryLocalInterface == null || !(queryLocalInterface instanceof q)) ? new q(iBinder) : (q) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = this.s;
        int i3 = this.r;
        eVar2.getClass();
        a0 a0Var = new a0(eVar2, 0, null);
        w wVar2 = eVar2.f;
        wVar2.sendMessage(wVar2.obtainMessage(7, i3, -1, a0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.s;
        synchronized (eVar.h) {
            eVar.i = null;
        }
        e eVar2 = this.s;
        int i = this.r;
        w wVar = eVar2.f;
        wVar.sendMessage(wVar.obtainMessage(6, i, 1));
    }
    public static Object S(Object p1, Object p2, Object p3) { return null; }
    public static Object T(Object p1, Object p2, Object p3) { return null; }
    public static Object U(Object p1, Object p2, Object p3, Object p4) { return null; }
    public static Object V(Object p1, Object p2, Object p3) { return null; }
    public static Object W(Object p1, Object p2, Object p3, Object p4) { return null; }
    public static Object X(Object p1, Object p2, Object p3) { return null; }
    public static Object Y(Object p1, Object p2, Object p3) { return null; }
    public static int Z(Object p1, Object p2) { return null; }
    public static Object a0(Object p1, Object p2) { return null; }
}
