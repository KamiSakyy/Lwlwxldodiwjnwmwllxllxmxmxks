package c21;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public static final Object g = new Object();
    public static g0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public Context b;
    public volatile com.google.android.gms.internal.measurement.h0 c;
    public f21.a d;
    public long e;
    public long f;

    public g0(Context context, Looper looper) {
        f0 f0Var = new f0(0, this);
        this.b = context.getApplicationContext();
        com.google.android.gms.internal.measurement.h0 h0Var = new com.google.android.gms.internal.measurement.h0(looper, f0Var);
        Looper.getMainLooper();
        this.c = h0Var;
        this.d = f21.a.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static g0 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new g0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final z11.b b(d0 d0Var, y yVar, String str, Executor executor) {
        z11.b bVar;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                e0 e0Var = (e0) hashMap.get(d0Var);
                if (executor == null) {
                    executor = null;
                }
                if (e0Var == null) {
                    e0Var = new e0(this, d0Var);
                    e0Var.r.put(yVar, yVar);
                    bVar = e0Var.a(str, executor);
                    hashMap.put(d0Var, e0Var);
                } else {
                    this.c.removeMessages(0, d0Var);
                    if (e0Var.r.containsKey(yVar)) {
                        String d0Var2 = d0Var.toString();
                        StringBuilder sb = new StringBuilder(d0Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(d0Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                    e0Var.r.put(yVar, yVar);
                    int i2 = e0Var.s;
                    if (i2 == 1) {
                        yVar.onServiceConnected(e0Var.w, e0Var.u);
                    } else if (i2 == 2) {
                        bVar = e0Var.a(str, executor);
                    }
                    bVar = null;
                }
                if (e0Var.t) {
                    return z11.b.w;
                }
                if (bVar == null) {
                    bVar = new z11.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        d0 d0Var = new d0(str, z);
        u.h(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                e0 e0Var = (e0) hashMap.get(d0Var);
                if (e0Var == null) {
                    String d0Var2 = d0Var.toString();
                    StringBuilder sb = new StringBuilder(d0Var2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(d0Var2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!e0Var.r.containsKey(serviceConnection)) {
                    String d0Var3 = d0Var.toString();
                    StringBuilder sb2 = new StringBuilder(d0Var3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(d0Var3);
                    throw new IllegalStateException(sb2.toString());
                }
                e0Var.r.remove(serviceConnection);
                if (e0Var.r.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, d0Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
