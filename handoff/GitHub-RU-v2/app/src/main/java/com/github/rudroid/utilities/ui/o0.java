package com.github.rudroid.utilities.ui;

import android.content.Context;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.fragments.ui.l2;
import com.google.android.gms.internal.measurement.z3;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b0, code lost:
    
        if (r1 == r12) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, Integer num, String str, String str2, String str3, String str4, String str5, boolean z, androidx.compose.runtime.s sVar, int i, int i2) {
        Integer num2;
        int i3;
        boolean z2;
        int i4;
        w1.r rVar2;
        Integer num3;
        boolean z3;
        int i5;
        boolean z4;
        Context context;
        androidx.compose.runtime.i iVar;
        Object obj;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "title");
        k71.k.g(str2, "subtitle");
        k71.k.g(str3, "link");
        k71.k.g(str4, "linkText");
        k71.k.g(str5, "semanticsLinkText");
        sVar2.e0(452204025);
        int i6 = i | 6;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 54;
            num2 = num;
        } else {
            num2 = num;
            i3 = i6 | (sVar2.f(num2) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.f(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar2.f(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar2.f(str5) ? 1048576 : 524288;
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i4 = i3 | 12582912;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (sVar2.g(z2) ? 8388608 : 4194304);
        }
        if (sVar2.S(i4 & 1, (i4 & 4793491) != 4793490)) {
            Integer num4 = i7 != 0 ? null : num2;
            boolean z5 = i8 != 0 ? false : z2;
            Context context2 = (Context) sVar2.j(w2.j0.b);
            boolean h = sVar2.h(context2) | ((57344 & i4) == 16384);
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar2 = androidx.compose.runtime.n.a;
            if (h || N == iVar2) {
                N = new b6.j1(1, context2, str3);
                sVar2.n0(N);
            }
            d3.f fVar = new d3.f(str5, (j71.a) N);
            boolean h2 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | sVar2.h(fVar) | ((29360128 & i4) == 8388608);
            Object N2 = sVar2.N();
            if (h2 || N2 == iVar2) {
                i5 = i4;
                com.github.rudroid.agents.copilothome.ui.z zVar = new com.github.rudroid.agents.copilothome.ui.z(str, str2, fVar, z5, 3);
                z4 = z5;
                sVar2.n0(zVar);
                N2 = zVar;
            } else {
                i5 = i4;
                z4 = z5;
            }
            w1.r rVar3 = w1.o.a;
            w1.r f = f0.o.f(f0.o.w(p2.d(d3.q.a(rVar3, (j71.c) N2), 1.0f), f0.o.v(sVar2), true), ih.d.b(sVar2).a, d2.a0.b);
            float f2 = ih.a.q;
            w1.r B = androidx.compose.foundation.layout.b.B(f, f2, 0.0f, f2, 0.0f, 10);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, B);
            v2.h.o.getClass();
            v2.f fVar2 = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            if (num4 == null) {
                sVar2.c0(692052348);
                sVar2.q(false);
                context = context2;
                iVar = iVar2;
            } else {
                sVar2.c0(692052349);
                context = context2;
                iVar = iVar2;
                f0.o.c(z3.C(num4.intValue(), (i5 >> 3) & 14, sVar2), (String) null, (w1.r) null, (w1.e) null, (androidx.compose.ui.layout.i) null, 0.0f, (d2.l) null, sVar2, 56, 124);
                sVar2 = sVar2;
                com.github.rudroid.m0.C(rVar3, ih.a.p, sVar2, false);
            }
            int i9 = i5 >> 6;
            Context context3 = context;
            androidx.compose.runtime.i iVar3 = iVar;
            ub.b(str, (w1.r) null, ih.d.b(sVar2).s, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).a, 0L, y41.t1.C(20), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, i9 & 14, 0, 130042);
            androidx.compose.foundation.layout.b.g(sVar, p2.f(rVar3, ih.a.l));
            g3.q0 a2 = g3.q0.a(ih.d.f(sVar).l, ih.d.b(sVar).v, y41.t1.C(15), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 3, 0L, (g3.z) null, (r3.i) null, 16744444);
            boolean h3 = sVar.h(context3);
            Object N3 = sVar.N();
            if (!h3) {
                obj = N3;
            }
            com.github.rudroid.copilot.ui.j jVar = new com.github.rudroid.copilot.ui.j(context3, 3);
            sVar.n0(jVar);
            obj = jVar;
            com.github.rudroid.uitoolkit.text.s.a(null, str2, str4, str3, 0L, a2, (j71.c) obj, sVar, (i9 & 112) | ((i5 >> 9) & 896) | ((i5 >> 3) & 7168), 17);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
            num3 = num4;
            z3 = z4;
        } else {
            sVar2.V();
            rVar2 = rVar;
            num3 = num2;
            z3 = z2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new l2(rVar2, num3, str, str2, str3, str4, str5, z3, i, i2);
        }
    }
}
