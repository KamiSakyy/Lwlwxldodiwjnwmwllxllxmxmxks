package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements Runnable {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ long s;
    public final /* synthetic */ a0 t;

    public y(z zVar, long j) {
        this.s = j;
        Objects.requireNonNull(zVar);
        this.t = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                ((z) this.t).F(this.s);
                break;
            default:
                f3 f3Var = (f3) this.t;
                z zVar = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).E;
                o1.j(zVar);
                zVar.C(this.s);
                f3Var.w = null;
                break;
        }
    }

    public y(f3 f3Var, long j) {
        this.s = j;
        Objects.requireNonNull(f3Var);
        this.t = f3Var;
    }
}
