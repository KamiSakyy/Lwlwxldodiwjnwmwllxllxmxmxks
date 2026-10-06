package vg;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.f3;
import com.github.rudroid.widget.p;
import f1.ub;
import k71.k;
import v2.d;
import v2.eShadow;
import v2.f;
import v2.g;
import v2.h;
import w1.c;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final void a(r rVar, String str, String str2, String str3, boolean z, int i, j71.a aVar, s sVar, int i2) {
        int i3;
        j71.a aVar2;
        int i4;
        j71.a aVar3;
        int i5;
        k.g(str, "avatarUrl");
        k.g(str2, "userOrOrgLogin");
        sVar.e0(503195393);
        int i6 = i2 | (sVar.f(rVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.f(str3) ? 2048 : 1024) | 381902848;
        if (sVar.S(i6 & 1, (306783379 & i6) != 306783378)) {
            sVar.X();
            if ((i2 & 1) == 0 || sVar.A()) {
                i4 = i6 & (-1879048193);
                Object N = sVar.N();
                if (N == n.a) {
                    N = new p(15);
                    sVar.n0(N);
                }
                aVar3 = (j71.a) N;
                i5 = 2131951921;
            } else {
                sVar.V();
                i4 = i6 & (-1879048193);
                i5 = i;
                aVar3 = aVar;
            }
            int i7 = i4;
            sVar.r();
            l2 a = j2.a(l.a, c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, rVar);
            h.o.getClass();
            f fVar = g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            eShadow eVar = g.f;
            t.I(sVar, eVar, a);
            eShadow eVar2 = g.e;
            t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            eShadow eVar3 = g.g;
            t.w(sVar, valueOf, eVar3);
            d dVar = g.h;
            t.E(sVar, dVar);
            eShadow eVar4 = g.d;
            t.I(sVar, eVar4, c);
            int i8 = i5;
            f3.a(null, str, false, null, z, null, null, aVar3, sVar, (i7 & 112) | 12607872, 105);
            float f = ih.a.k;
            o oVar = o.a;
            r B = b.B(oVar, f, 0.0f, 0.0f, 0.0f, 14);
            e0 a2 = c0.a(l.e, c.D, sVar, 6);
            int hashCode2 = Long.hashCode(sVar.T);
            v1 l2 = sVar.l();
            r c2 = w1.a.c(sVar, B);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, eVar, a2);
            t.I(sVar, eVar2, l2);
            f1.eShadow.t(hashCode2, sVar, eVar3, sVar, dVar);
            t.I(sVar, eVar4, c2);
            c(((i7 >> 3) & 8176) | 24576, sVar, aVar3, str2, str3, null);
            b(i8, 3510, sVar, b.B(oVar, 0.0f, f, 0.0f, 0.0f, 13));
            sVar.q(true);
            sVar.q(true);
            i3 = i8;
            aVar2 = aVar3;
        } else {
            sVar.V();
            i3 = i;
            aVar2 = aVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bh.b(rVar, str, str2, str3, z, i3, aVar2, i2);
        }
    }

    public static final void b(int i, int i2, s sVar, r rVar) {
        int i3;
        sVar.e0(-1377214130);
        if ((i2 & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.g(false) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.g(false) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= sVar.d(i) ? 16384 : 8192;
        }
        if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
            l2 a = j2.a(l.a, c.A, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, rVar);
            h.o.getClass();
            f fVar = g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, g.f, a);
            t.I(sVar, g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), g.g);
            t.E(sVar, g.h);
            t.I(sVar, g.d, c);
            sVar.c0(381079896);
            sVar.q(false);
            sVar.c0(381079896);
            sVar.q(false);
            sVar.c0(381079896);
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.agenttasks.c(rVar, i, i2, 7);
        }
    }

    public static final void c(int i, s sVar, j71.a aVar, String str, String str2, r rVar) {
        String str3;
        s sVar2;
        r rVar2;
        k.g(str, "userOrOrgLogin");
        sVar.e0(-1981124127);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= sVar.f(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if (sVar.S(i2 & 1, (i2 & 9363) != 9362)) {
            l2 a = j2.a(l.a, c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r rVar3 = o.a;
            r c = w1.a.c(sVar, rVar3);
            h.o.getClass();
            f fVar = g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, g.f, a);
            t.I(sVar, g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), g.g);
            t.E(sVar, g.h);
            t.I(sVar, g.d, c);
            rVar2 = rVar3;
            ub.b(str, f0.o.m(rVar3, false, (String) null, (d3.k) null, aVar, 15), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).o, sVar, (i2 >> 3) & 14, 0, 131068);
            ub.b(str3, b.B(rVar2, ih.a.k, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).x, sVar, ((i2 >> 6) & 14) | 48, 0, 131068);
            sVar2 = sVar;
            sVar2.c0(1502793829);
            sVar2.q(false);
            sVar2.q(true);
        } else {
            sVar2 = sVar;
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.repository.file.d(rVar2, str, str2, aVar, i);
        }
    }
}
