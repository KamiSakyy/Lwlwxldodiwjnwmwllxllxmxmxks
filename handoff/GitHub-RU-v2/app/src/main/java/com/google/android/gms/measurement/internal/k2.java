package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k2 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ t2 t;

    public k2(t2 t2Var, long j, int i) {
        this.r = i;
        switch (i) {
            case 1:
                this.s = j;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
            default:
                this.s = j;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
                c1 c1Var = o1Var.v;
                o1.k(c1Var);
                a1 a1Var = c1Var.C;
                long j = this.s;
                a1Var.b(j);
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.E.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                t2 t2Var = this.t;
                t2Var.z();
                t2Var.A();
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                s0 s0Var2 = o1Var2.w;
                o1.m(s0Var2);
                s0Var2.E.a("Resetting analytics data (FE)");
                y3 y3Var = o1Var2.y;
                o1.l(y3Var);
                y3Var.z();
                a0.o2 o2Var = y3Var.x;
                ((w3) o2Var.c).c();
                ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((y3) o2Var.d)).s).B.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                o2Var.a = elapsedRealtime;
                o2Var.b = elapsedRealtime;
                o1Var2.r().E();
                boolean z = !o1Var2.e();
                c1 c1Var2 = o1Var2.v;
                o1.k(c1Var2);
                c1Var2.x.b(this.s);
                o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) c1Var2).s;
                c1 c1Var3 = o1Var3.v;
                o1.k(c1Var3);
                if (!TextUtils.isEmpty(c1Var3.N.o())) {
                    c1Var2.N.p((String) null);
                }
                c1Var2.H.b(0L);
                c1Var2.I.b(0L);
                if (!o1Var3.u.M()) {
                    c1Var2.I(z);
                }
                c1Var2.O.p((String) null);
                c1Var2.P.b(0L);
                c1Var2.Q.Y(null);
                p3 p = o1Var2.p();
                p.z();
                p.A();
                v4 P = p.P(false);
                p.L();
                ((o1) ((androidx.compose.foundation.lazy.layout.s0) p).s).o().D();
                p.N(new k3(p, P, 0));
                o1.l(y3Var);
                y3Var.w.w();
                t2Var.K = z;
                o1Var2.p().D(new AtomicReference());
                break;
        }
    }
}
