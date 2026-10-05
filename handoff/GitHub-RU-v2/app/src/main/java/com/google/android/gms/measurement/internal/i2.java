package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements Runnable {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ t2 s;

    public i2(t2 t2Var, boolean z) {
        this.r = z;
        Objects.requireNonNull(t2Var);
        this.s = t2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r3 != r4) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t2 t2Var = this.s;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
        boolean e = o1Var.e();
        boolean z = false;
        boolean z2 = o1Var.P != null && o1Var.P.booleanValue();
        boolean z3 = this.r;
        o1Var.P = Boolean.valueOf(z3);
        if (z2 == z3) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.b(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (o1Var.e() != e) {
            boolean e2 = o1Var.e();
            if (o1Var.P != null && o1Var.P.booleanValue()) {
                z = true;
            }
        }
        s0 s0Var2 = o1Var.w;
        o1.m(s0Var2);
        s0Var2.C.c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(e));
        t2Var.R();
    }
}
