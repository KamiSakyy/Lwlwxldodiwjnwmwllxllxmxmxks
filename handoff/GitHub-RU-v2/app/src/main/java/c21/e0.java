package c21;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements ServiceConnection {
    public final HashMap r = new HashMap();
    public int s = 2;
    public boolean t;
    public IBinder u;
    public final d0 v;
    public ComponentName w;
    public final /* synthetic */ g0 x;

    public e0(g0 g0Var, d0 d0Var) {
        this.x = g0Var;
        this.v = d0Var;
    }

    public final z11.b a(String str, Executor executor) {
        try {
            Intent a = v.a(this.x.b, this.v);
            this.s = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(g21.f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                g0 g0Var = this.x;
                f21.a aVar = g0Var.d;
                Context context = g0Var.b;
                d0 d0Var = this.v;
                try {
                    boolean d = aVar.d(context, str, a, this, 4225, executor);
                    this.t = d;
                    if (d) {
                        g0Var.c.sendMessageDelayed(g0Var.c.obtainMessage(1, d0Var), g0Var.f);
                        z11.b bVar = z11.b.w;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.s = 2;
                    try {
                        g0Var.d.c(g0Var.b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    z11.b bVar2 = new z11.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (zzaf e) {
            return e.r;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g0 g0Var = this.x;
        synchronized (g0Var.a) {
            try {
                g0Var.c.removeMessages(1, this.v);
                this.u = iBinder;
                this.w = componentName;
                Iterator it = this.r.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.s = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g0 g0Var = this.x;
        synchronized (g0Var.a) {
            try {
                g0Var.c.removeMessages(1, this.v);
                this.u = null;
                this.w = componentName;
                Iterator it = this.r.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.s = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
