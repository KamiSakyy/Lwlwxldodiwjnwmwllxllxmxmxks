package com.google.android.gms.measurement.internal;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m3 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ f0 s;
    public final /* synthetic */ o3 t;

    public /* synthetic */ m3(o3 o3Var, f0 f0Var, int i) {
        this.r = i;
        this.s = f0Var;
        this.t = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                o3 o3Var = this.t;
                synchronized (o3Var) {
                    try {
                        o3Var.r = false;
                        p3 p3Var = o3Var.t;
                        if (!p3Var.Q()) {
                            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).w;
                            o1.m(s0Var);
                            s0Var.F.a("Connected to service");
                            f0 f0Var = this.s;
                            p3Var.z();
                            p3Var.v = f0Var;
                            p3Var.M();
                            p3Var.O();
                        }
                    } finally {
                    }
                }
                return;
            default:
                o3 o3Var2 = this.t;
                synchronized (o3Var2) {
                    try {
                        o3Var2.r = false;
                        p3 p3Var2 = o3Var2.t;
                        if (!p3Var2.Q()) {
                            s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).w;
                            o1.m(s0Var2);
                            s0Var2.E.a("Connected to remote service");
                            f0 f0Var2 = this.s;
                            p3Var2.z();
                            p3Var2.v = f0Var2;
                            p3Var2.M();
                            p3Var2.O();
                        }
                    } finally {
                    }
                }
                p3 p3Var3 = this.t.t;
                ScheduledExecutorService scheduledExecutorService = p3Var3.y;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    p3Var3.y = null;
                    return;
                }
                return;
        }
    }
}
