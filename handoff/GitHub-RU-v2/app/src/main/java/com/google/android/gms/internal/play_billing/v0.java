package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements Runnable {
    public w0 r;

    @Override // java.lang.Runnable
    public final void run() {
        u0 u0Var;
        f0 f0Var;
        w0 w0Var = this.r;
        if (w0Var == null || (u0Var = w0Var.y) == null) {
            return;
        }
        this.r = null;
        if (u0Var.isDone()) {
            Object obj = w0Var.r;
            if (obj == null) {
                if (u0Var.isDone()) {
                    if (m0.x.i0(w0Var, (Object) null, w0.h(u0Var))) {
                        w0.j(w0Var);
                        return;
                    }
                    return;
                }
                d0 d0Var = new d0(w0Var, u0Var);
                if (m0.x.i0(w0Var, (Object) null, d0Var)) {
                    try {
                        u0Var.b(d0Var, q0.r);
                        return;
                    } catch (Throwable th) {
                        try {
                            f0Var = new f0(th);
                        } catch (Error | Exception unused) {
                            f0Var = f0.b;
                        }
                        m0.x.i0(w0Var, d0Var, f0Var);
                        return;
                    }
                }
                obj = w0Var.r;
            }
            if (obj instanceof c0) {
                u0Var.cancel(((c0) obj).a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = w0Var.z;
            w0Var.z = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    if (m0.x.i0(w0Var, (Object) null, new f0(new zzdf(str)))) {
                        w0.j(w0Var);
                    }
                    throw th2;
                }
            }
            if (m0.x.i0(w0Var, (Object) null, new f0(new zzdf(str + ": " + u0Var.toString())))) {
                w0.j(w0Var);
            }
        } finally {
            u0Var.cancel(true);
        }
    }
}
