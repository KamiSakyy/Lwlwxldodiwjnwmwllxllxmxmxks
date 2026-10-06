package com.github.rudroid.uitoolkit.swipetodismiss;

import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;

/* loaded from: /home/user/work/p/classes3.dex */
final class l0 extends w1.q implements v2.x {
    public g0 F;
    public boolean G;
    public boolean H;
    public boolean I;

    public final void H0() {
        this.I = false;
    }

    public final w0 d(final x0 x0Var, u0 u0Var, long j) {
        Object value;
        k71.k.g(u0Var, "measurable");
        final l1 F = u0Var.F(j);
        if (x0Var.T() || !this.I) {
            float f = F.r;
            z zVar = new z();
            zVar.a(h0.t, 0.0f);
            if (this.G) {
                zVar.a(h0.r, f);
            }
            if (this.H) {
                zVar.a(h0.s, -f);
            }
            d0 d0Var = new d0(zVar.a);
            n nVar = this.F.b;
            androidx.compose.runtime.l1 l1Var = nVar.i;
            androidx.compose.runtime.g0 g0Var = nVar.g;
            if (Float.isNaN(l1Var.y())) {
                value = g0Var.getValue();
            } else {
                value = d0Var.c(nVar.i.y());
                if (value == null) {
                    value = g0Var.getValue();
                }
            }
            if (!k71.k.b(nVar.d(), d0Var)) {
                nVar.l.setValue(d0Var);
                a0 a0Var = nVar.d;
                a0Var.getClass();
                e81.c cVar = a0Var.b;
                boolean e = cVar.e();
                if (e) {
                    try {
                        u uVar = nVar.m;
                        float d = nVar.d().d(value);
                        if (!Float.isNaN(d)) {
                            uVar.a(d, 0.0f);
                            nVar.g(null);
                        }
                        nVar.f(value);
                    } finally {
                        cVar.f((Object) null);
                    }
                }
                if (!e) {
                    nVar.g(value);
                }
            }
        }
        this.I = x0Var.T() || this.I;
        final int i = 0;
        return x0Var.h0(F.r, F.s, x61.s.r, new j71.c() { // from class: com.github.rudroid.uitoolkit.swipetodismiss.k0
            public final Object k(Object obj) {
                switch (i) {
                    case 0:
                        x0 x0Var2 = x0Var;
                        l0 l0Var = (l0) this;
                        l1 l1Var2 = (l1) F;
                        k1 k1Var = (k1) obj;
                        k71.k.g(k1Var, "$this$layout");
                        k1Var.i(l1Var2, m71.a.W(x0Var2.T() ? l0Var.F.b.d().d((h0) l0Var.F.b.g.getValue()) : l0Var.F.b.e()), 0, 0.0f);
                        return w61.a0.a;
                    default:
                        j71.c cVar2 = (j71.c) this;
                        j71.c cVar3 = (j71.c) F;
                        h0 h0Var = (h0) obj;
                        k71.k.g(h0Var, "it");
                        return new g0(h0Var, x0Var, cVar2, cVar3);
                }
            }
        });
    }
    public Object t(Object p1) { return null; }
}
