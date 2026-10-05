package zg;

import a0.s0;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.v1;
import f1.ub;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public static final void a(w1.r rVar, final String str, final List list, final String str2, final String str3, final String str4, final int i, final String str5, r1.d dVar, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final j71.a aVar4, boolean z, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        int i4;
        int i5;
        final r1.d dVar2;
        final w1.r rVar2;
        final boolean z2;
        m1 m1Var;
        Object obj;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "avatarUrl");
        k71.k.g(str2, "avatarContentDescription");
        k71.k.g(str3, "repositoryLogin");
        k71.k.g(str4, "repositoryName");
        k71.k.g(str5, "issueOrPullRequestTitle");
        k71.k.g(aVar, "onAvatarClick");
        k71.k.g(aVar2, "onRepositoryLoginClick");
        k71.k.g(aVar3, "onRepositoryNameClick");
        sVar2.e0(1582299449);
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            i6 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= sVar2.h(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= sVar2.f(str3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= sVar2.f(str4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i6 |= sVar2.d(i4) ? 1048576 : 524288;
        } else {
            i4 = i;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= sVar2.f(str5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= sVar2.h(dVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= sVar2.h(aVar) ? 536870912 : 268435456;
        }
        int i7 = i6;
        if ((i3 & 6) == 0) {
            i5 = (sVar2.h(aVar2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar2.h(aVar3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar2.h(aVar4) ? 256 : 128;
        }
        int i8 = i5 | 3072;
        if (sVar2.S(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = new m1(3);
                sVar2.n0(N);
            }
            m1 m1Var2 = (m1) N;
            w1.r rVar3 = w1.o.a;
            w1.r a = z.a0.a(rVar3, (j71.e) null, 3);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, a);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            int i9 = i8 << 21;
            k0.a(null, str, list, str2, str3, str4, aVar, aVar2, aVar3, aVar4, i4, sVar2, (i7 & 524272) | ((i7 >> 9) & 3670016) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192), (i7 >> 18) & 14, 1);
            w1.r a3 = z.a0.a(p2.b(androidx.compose.foundation.layout.b.z(rVar3, ih.a.n, 0.0f, 2), 0.0f, ih.a.K, 1), (j71.e) null, 3);
            sVar2.c0(1371811699);
            Object N2 = sVar2.N();
            if (N2 == iVar) {
                m1Var = m1Var2;
                w8.p pVar = new w8.p(11, m1Var);
                sVar2.n0(pVar);
                obj = pVar;
            } else {
                m1Var = m1Var2;
                obj = N2;
            }
            f0.o.m(a3, false, (String) null, (d3.k) null, (j71.a) obj, 15);
            sVar2.q(false);
            ub.b(str5, a3, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, m1Var.y(), 0, (j71.c) null, ih.d.f(sVar2).a, sVar, (i7 >> 21) & 14, 384, 110588);
            sVar2 = sVar;
            dVar2 = dVar;
            s0.x((i7 >> 24) & 14, dVar2, sVar2, true);
            z2 = true;
            rVar2 = rVar3;
        } else {
            dVar2 = dVar;
            sVar2.V();
            rVar2 = rVar;
            z2 = z;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j71.e() { // from class: zg.v
                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int L = androidx.compose.runtime.t.L(i2 | 1);
                    int L2 = androidx.compose.runtime.t.L(i3);
                    w.a(rVar2, str, list, str2, str3, str4, i, str5, dVar2, aVar, aVar2, aVar3, aVar4, z2, (androidx.compose.runtime.s) obj2, L, L2);
                    return w61.a0.a;
                }
            };
        }
    }
}
