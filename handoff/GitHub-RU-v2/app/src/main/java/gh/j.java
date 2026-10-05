package gh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.l;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.copilothome.ui.u;
import com.github.rudroid.uitoolkit.k0;
import d1.i1;
import d2.a0;
import g3.q0;
import g3.z;
import java.util.List;
import k71.k;
import w1.o;
import w1.r;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [d1.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public static final void a(r rVar, List list, j71.c cVar, String str, q0 q0Var, q0 q0Var2, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        List<f> list2;
        q0 q0Var3;
        q0 q0Var4;
        q0 q0Var5;
        q0 a;
        int i4;
        int i5;
        s sVar2 = sVar;
        k.g(cVar, "onOptionSelect");
        k.g(str, "selectedOptionId");
        sVar2.e0(-1511225518);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            list2 = list;
            i3 |= sVar2.h(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.h(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                q0Var3 = q0Var;
                if (sVar2.f(q0Var3)) {
                    i5 = 16384;
                    i3 |= i5;
                }
            } else {
                q0Var3 = q0Var;
            }
            i5 = 8192;
            i3 |= i5;
        } else {
            q0Var3 = q0Var;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if (sVar2.S(i3 & 1, (74899 & i3) != 74898)) {
            sVar2.X();
            int i7 = i & 1;
            r rVar3 = o.a;
            if (i7 == 0 || sVar2.A()) {
                if (i6 != 0) {
                    rVar2 = rVar3;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    q0Var3 = ih.d.f(sVar2).p;
                }
                a = q0.a(ih.d.f(sVar2).l, 0L, t1.C(14), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213);
                i4 = i3 & (-458753);
            } else {
                sVar2.V();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                a = q0Var2;
            }
            sVar2.r();
            r c = q0.c.c(rVar2);
            e0 a2 = c0.a(l.c, w1.c.D, sVar2, 0);
            q0 q0Var6 = a;
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c2 = w1.a.c(sVar2, c);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, v2.g.f, a2);
            t.I(sVar2, v2.g.e, l);
            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar2, v2.g.h);
            t.I(sVar2, v2.g.d, c2);
            sVar2.c0(1385542922);
            for (f fVar2 : list2) {
                r x = androidx.compose.foundation.layout.b.x(f0.o.f(rVar3, ih.d.b(sVar2).d, a0.b), ih.a.n);
                boolean equals = str.equals(fVar2.a);
                boolean f = ((i4 & 896) == 256) | sVar2.f(fVar2);
                j71.a N = sVar2.N();
                if (f || N == n.a) {
                    N = new i1(13, cVar, fVar2);
                    sVar2.n0((Object) N);
                }
                q0 q0Var7 = q0Var3;
                q0 q0Var8 = q0Var6;
                i.b(x, fVar2, equals, q0Var7, q0Var8, false, N, 0L, sVar, (i4 >> 3) & 64512, 160);
                sVar2 = sVar;
                k0.a(null, 0L, 0L, 0.0f, false, sVar2, 0, 31);
                q0Var3 = q0Var7;
                q0Var6 = q0Var8;
                rVar3 = rVar3;
            }
            sVar2.q(false);
            sVar2.q(true);
            q0Var5 = q0Var3;
            q0Var4 = q0Var6;
        } else {
            sVar2.V();
            q0Var4 = q0Var2;
            q0Var5 = q0Var3;
        }
        r rVar4 = rVar2;
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new ab.g(rVar4, list, cVar, str, q0Var5, q0Var4, i, i2);
        }
    }

    public static final void b(r rVar, r1.d dVar, s sVar, int i, int i2) {
        int i3;
        sVar.e0(1479651484);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        }
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                rVar = o.a;
            }
            r c = q0.c.c(rVar);
            e0 a = c0.a(l.c, w1.c.D, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c2 = w1.a.c(sVar, c);
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
            t.I(sVar, v2.g.d, c2);
            dVar.f(f0.a, sVar, 54);
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new u(rVar, dVar, i, i2);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
