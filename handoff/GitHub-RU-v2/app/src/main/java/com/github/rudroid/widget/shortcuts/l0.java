package com.github.rudroid.widget.shortcuts;

import android.content.Context;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.r1;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.b5;
import com.github.rudroid.shortcuts.r;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    public static final void a(w1.r rVar, wm.b bVar, boolean z, androidx.compose.runtime.s sVar, int i) {
        int i2;
        int r2;
        long j;
        long j2;
        boolean z2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(1879603239);
        if ((i & 6) == 0) {
            i2 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (sVar2.h(bVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= sVar2.g(z) ? 256 : 128;
        }
        if (sVar2.S(i3 & 1, (i3 & 147) != 146)) {
            w1.r f = f0.o.f(androidx.compose.foundation.layout.b.q(p2.e(rVar, 1.0f), r1.r), ih.d.b(sVar2).d, d2.a0.b);
            float f2 = ih.a.n;
            w1.r y = androidx.compose.foundation.layout.b.y(f, f2, ih.a.m);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, y);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.e eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar, a);
            v2.e eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            v2.e eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            w1.o oVar = w1.o.a;
            w1.r o = p2.o(androidx.compose.foundation.layout.b.x(oVar, 8), ih.a.O);
            r0.d dVar2 = ih.d.e(sVar2).c;
            ShortcutColor f3 = bVar.f();
            k71.k.g(f3, "<this>");
            int[] iArr = r.a.a;
            switch (iArr[f3.ordinal()]) {
                case 1:
                    r2 = 0;
                    sVar2.c0(820810301);
                    j = ih.d.b(sVar2).k1;
                    sVar2.q(false);
                    break;
                case 2:
                    r2 = 0;
                    sVar2.c0(820812509);
                    j = ih.d.b(sVar2).l1;
                    sVar2.q(false);
                    break;
                case 3:
                    r2 = 0;
                    sVar2.c0(820814750);
                    j = ih.d.b(sVar2).m1;
                    sVar2.q(false);
                    break;
                case 4:
                    r2 = 0;
                    sVar2.c0(820817055);
                    j = ih.d.b(sVar2).n1;
                    sVar2.q(false);
                    break;
                case 5:
                    r2 = 0;
                    sVar2.c0(820819292);
                    j = ih.d.b(sVar2).o1;
                    sVar2.q(false);
                    break;
                case 6:
                    r2 = 0;
                    sVar2.c0(820821469);
                    j = ih.d.b(sVar2).p1;
                    sVar2.q(false);
                    break;
                case 7:
                    sVar2.c0(820823743);
                    j = ih.d.b(sVar2).q1;
                    r2 = 0;
                    sVar2.q(false);
                    break;
                default:
                    throw f1.e.r(820809020, sVar2, false);
            }
            w1.r x = androidx.compose.foundation.layout.b.x(f0.o.f(o, j, dVar2), 6);
            i2.b C = z3.C(com.github.rudroid.shortcuts.r.e(bVar.getIcon()), (int) r2, sVar2);
            ShortcutColor f4 = bVar.f();
            k71.k.g(f4, "<this>");
            switch (iArr[f4.ordinal()]) {
                case 1:
                    sVar2.c0(-214095854);
                    j2 = ih.d.b(sVar2).d1;
                    sVar2.q((boolean) r2);
                    break;
                case 2:
                    sVar2.c0(-214093646);
                    j2 = ih.d.b(sVar2).e1;
                    sVar2.q((boolean) r2);
                    break;
                case 3:
                    sVar2.c0(-214091405);
                    j2 = ih.d.b(sVar2).f1;
                    sVar2.q((boolean) r2);
                    break;
                case 4:
                    sVar2.c0(-214089100);
                    j2 = ih.d.b(sVar2).g1;
                    sVar2.q((boolean) r2);
                    break;
                case 5:
                    sVar2.c0(-214086863);
                    j2 = ih.d.b(sVar2).h1;
                    sVar2.q((boolean) r2);
                    break;
                case 6:
                    sVar2.c0(-214084686);
                    j2 = ih.d.b(sVar2).i1;
                    sVar2.q((boolean) r2);
                    break;
                case 7:
                    sVar2.c0(-214082412);
                    j2 = ih.d.b(sVar2).j1;
                    sVar2.q((boolean) r2);
                    break;
                default:
                    throw f1.e.r(-214097135, sVar2, (boolean) r2);
            }
            p5.a(C, (String) null, x, j2, sVar2, 56, 0);
            androidx.compose.foundation.layout.b.g(sVar2, p2.s(oVar, f2));
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            w1.r d = p2.d(new w1(1.0f, true), 1.0f);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.D, sVar2, 6);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, d);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar, a2);
            androidx.compose.runtime.t.I(sVar2, eVar2, l2);
            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
            androidx.compose.runtime.t.I(sVar2, eVar4, c2);
            ub.b(com.github.rudroid.shortcuts.r.i(bVar.i(), (Context) sVar2.j(w2.j0.b), bVar.K()), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar2).u, sVar, 0, 24960, 110590);
            ub.b(bVar.getName(), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar).l, sVar, 0, 24960, 110590);
            sVar2 = sVar;
            sVar2.q(true);
            androidx.compose.foundation.layout.b.g(sVar2, p2.s(oVar, f2));
            if (z) {
                sVar2.c0(1135638830);
                z2 = false;
                p5.a(z3.C(2131231164, 0, sVar2), (String) null, (w1.r) null, ih.d.b(sVar2).F, sVar2, 56, 4);
            } else {
                z2 = false;
                sVar2.c0(1114744055);
            }
            sVar2.q(z2);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new b5(rVar, bVar, z, i, 4);
        }
    }
    public Object F(Object p1, Object p2) { return null; }
    public Object S(Object p1, Object p2, Object p3) { return null; }
}
