package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p {
    public static volatile com.google.android.gms.internal.measurement.h0 d;
    public x1 a;
    public com.google.common.util.concurrent.b b;
    public volatile long c;

    public p(x1 x1Var) {
        c21.uShadow.g(x1Var);
        this.a = x1Var;
        this.b = new com.google.common.util.concurrent.b(this, x1Var, false, 4);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            x1 x1Var = this.a;
            x1Var.f().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            x1Var.a().x.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.h0 h0Var;
        if (d != null) {
            return d;
        }
        synchronized (p.class) {
            try {
                if (d == null) {
                    d = new com.google.android.gms.internal.measurement.h0(this.a.d().getMainLooper(), 0);
                }
                h0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h0Var;
    }
}
