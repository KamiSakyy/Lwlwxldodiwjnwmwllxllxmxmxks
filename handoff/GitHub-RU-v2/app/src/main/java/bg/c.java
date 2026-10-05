package bg;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.i;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d3.q;
import f0.o;
import f1.p0;
import f1.ub;
import g3.q0;
import g3.z;
import k71.k;
import sg.y;
import v2.g;
import w1.r;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(int i, s sVar, j71.a aVar, r rVar, boolean z) {
        int i2;
        s sVar2 = sVar;
        k.g(aVar, "onUnlockClick");
        sVar2.e0(-1161435803);
        if ((i & 6) == 0) {
            i2 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.g(z) ? 256 : 128;
        }
        if (sVar2.S(i2 & 1, (i2 & 147) != 146)) {
            h hVar = l.e;
            w1.h hVar2 = w1.c.E;
            e0 a = c0.a(hVar, hVar2, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, rVar);
            v2.h.o.getClass();
            v2.f fVar = g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.e eVar = g.f;
            t.I(sVar2, eVar, a);
            v2.e eVar2 = g.e;
            t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = g.g;
            t.w(sVar2, valueOf, eVar3);
            v2.d dVar = g.h;
            t.E(sVar2, dVar);
            v2.e eVar4 = g.d;
            t.I(sVar2, eVar4, c);
            int i3 = i2;
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            w1 w1Var = new w1(1.0f, true);
            Object N = sVar2.N();
            if (N == n.a) {
                N = new bf.c(3);
                sVar2.n0(N);
            }
            r b = q.b(w1Var, true, (j71.c) N);
            e0 a2 = c0.a(hVar, hVar2, sVar2, 54);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            r c2 = w1.a.c(sVar2, b);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, eVar, a2);
            t.I(sVar2, eVar2, l2);
            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
            t.I(sVar2, eVar4, c2);
            o.c(z3.C(2131231298, 0, sVar2), (String) null, (r) null, (w1.e) null, (i) null, 0.0f, (d2.l) null, sVar2, 56, 124);
            float f = ih.a.m;
            w1.o oVar = w1.o.a;
            ub.b(i4.p0(2131951795, sVar2), androidx.compose.foundation.layout.b.B(oVar, 0.0f, f, 0.0f, 0.0f, 13), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar2).p, 0L, t1.C(28), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213), sVar, 0, 0, 131068);
            sVar.q(true);
            r y = androidx.compose.foundation.layout.b.y(p2.e(oVar, 1.0f), ih.a.n, ih.a.q);
            long j = ih.d.b(sVar).j;
            long j2 = ih.d.b(sVar).y;
            y.a(100663296 | ((i3 << 3) & 896), 234, null, sVar, null, null, p0.a(j, j2, j, d2.t.b(0.38f, j2), sVar, 0), null, aVar, r1.i.d(114345622, new a(z, 0), sVar), y, false);
            sVar2 = sVar;
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new b(rVar, aVar, i, z, 0);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
