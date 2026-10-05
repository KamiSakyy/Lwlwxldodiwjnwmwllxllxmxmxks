package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u3 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ y3 t;

    public u3(y3 y3Var, long j, int i) {
        this.r = i;
        switch (i) {
            case 1:
                this.s = j;
                Objects.requireNonNull(y3Var);
                this.t = y3Var;
                break;
            default:
                this.s = j;
                Objects.requireNonNull(y3Var);
                this.t = y3Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r2.K.b() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.r) {
            case 0:
                y3 y3Var = this.t;
                a0.o2 o2Var = y3Var.x;
                y3Var.z();
                y3Var.D();
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                q0 q0Var = s0Var.F;
                long j = this.s;
                q0Var.b(Long.valueOf(j), "Activity resumed, time");
                h hVar = o1Var.u;
                if (!hVar.J(null, c0.U0)) {
                    if (!hVar.N()) {
                        c1 c1Var = o1Var.v;
                        o1.k(c1Var);
                        break;
                    }
                    ((y3) o2Var.d).z();
                    ((w3) o2Var.c).c();
                    o2Var.a = j;
                    o2Var.b = j;
                } else if (hVar.N() || y3Var.v) {
                    ((y3) o2Var.d).z();
                    ((w3) o2Var.c).c();
                    o2Var.a = j;
                    o2Var.b = j;
                }
                b1.m mVar = y3Var.y;
                y3 y3Var2 = (y3) mVar.t;
                y3Var2.z();
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var2).s;
                v3 v3Var = (v3) mVar.s;
                if (v3Var != null) {
                    y3Var2.u.removeCallbacks(v3Var);
                }
                c1 c1Var2 = o1Var2.v;
                t2 t2Var = o1Var2.D;
                o1.k(c1Var2);
                c1Var2.K.c(false);
                y3Var2.z();
                y3Var2.v = false;
                if (o1Var2.u.J(null, c0.T0)) {
                    o1.l(t2Var);
                    if (t2Var.F) {
                        s0 s0Var2 = o1Var2.w;
                        o1.m(s0Var2);
                        s0Var2.F.a("Retrying trigger URI registration in foreground");
                        o1.l(t2Var);
                        t2Var.Y();
                    }
                }
                x3 x3Var = y3Var.w;
                y3 y3Var3 = (y3) x3Var.s;
                y3Var3.z();
                o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var3).s;
                if (o1Var3.e()) {
                    o1Var3.B.getClass();
                    x3Var.x(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                y3 y3Var4 = this.t;
                y3Var4.z();
                y3Var4.D();
                o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var4).s;
                s0 s0Var3 = o1Var4.w;
                o1.m(s0Var3);
                q0 q0Var2 = s0Var3.F;
                long j2 = this.s;
                q0Var2.b(Long.valueOf(j2), "Activity paused, time");
                b1.m mVar2 = y3Var4.y;
                y3 y3Var5 = (y3) mVar2.t;
                ((o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var5).s).B.getClass();
                v3 v3Var2 = new v3(mVar2, System.currentTimeMillis(), j2);
                mVar2.s = v3Var2;
                y3Var5.u.postDelayed(v3Var2, 2000L);
                if (o1Var4.u.N()) {
                    ((w3) y3Var4.x.c).c();
                    break;
                }
                break;
        }
    }
}
