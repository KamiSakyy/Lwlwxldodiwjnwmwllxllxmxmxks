package com.google.android.gms.measurement.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 implements Executor {
    public final /* synthetic */ int r;
    public final Object s;

    public /* synthetic */ h2(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.r) {
            case 0:
                m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) this.s)).s).x;
                o1.m(m1Var);
                m1Var.I(runnable);
                break;
            case 1:
                ((f9.a) this.s).c.post(runnable);
                break;
            case 2:
                ((Executor) this.s).execute(new h21.b(runnable, 1));
                break;
            default:
                ((com.google.android.gms.internal.measurement.h0) this.s).post(runnable);
                break;
        }
    }

    public h2() {
        this.r = 3;
        com.google.android.gms.internal.measurement.h0 h0Var = new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper());
        Looper.getMainLooper();
        this.s = h0Var;
    }

    public Object s;
}
