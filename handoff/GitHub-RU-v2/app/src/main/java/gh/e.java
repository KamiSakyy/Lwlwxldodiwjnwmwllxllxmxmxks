package gh;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.copilothome.ui.b0;
import d2.a0;
import d2.l0;
import k71.k;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final void a(r rVar, f fVar, j71.c cVar, boolean z, s sVar, int i) {
        int i2;
        k.g(cVar, "onSelect");
        sVar.e0(1082018646);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (sVar.f(fVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= sVar.h(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.g(z) ? 2048 : 1024;
        }
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            b(rVar, 0L, z, cVar, r1.i.d(1722835936, new bd.i(fVar, 1), sVar), sVar, (i3 & 14) | 24576 | ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.k(rVar, fVar, cVar, z, i, 14);
        }
    }

    public static final void b(final r rVar, long j, final boolean z, final j71.c cVar, final r1.d dVar, s sVar, final int i) {
        int i2;
        final long j2;
        long j3;
        int i3;
        k.g(cVar, "onSelect");
        sVar.e0(968045262);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(dVar) ? 16384 : 8192;
        }
        if (sVar.S(i2 & 1, (i2 & 9363) != 9362)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                j3 = ih.d.b(sVar).d;
                i3 = i2 & (-113);
            } else {
                sVar.V();
                i3 = i2 & (-113);
                j3 = j;
            }
            sVar.r();
            o oVar = o.a;
            l0 l0Var = a0.b;
            r f = f0.o.f(oVar, j3, l0Var);
            d3.k kVar = new d3.k(1);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object N = sVar.N();
            if (z2 || N == n.a) {
                N = new b0(cVar, z, 4);
                sVar.n0(N);
            }
            r f2 = q0.c.b(f, z, kVar, (j71.a) N).f(rVar);
            l2 a = j2.a(l.a, w1.c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, f2);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, v2.g.f, a);
            t.I(sVar, v2.g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar, v2.g.h);
            t.I(sVar, v2.g.d, c);
            dVar.f(n2.a, sVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
            com.github.rudroid.uitoolkit.e.a(f0.o.f(androidx.compose.foundation.layout.b.B(oVar, ih.a.n, 0.0f, 0.0f, 0.0f, 14), j3, l0Var), z, false, null, null, sVar, ((i3 >> 3) & 112) | 3072, 20);
            sVar.q(true);
            j2 = j3;
        } else {
            sVar.V();
            j2 = j;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: gh.d
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.b(rVar, j2, z, cVar, dVar, (s) obj, t.L(i | 1));
                    return w61.a0.a;
                }
            };
        }
    }

}
