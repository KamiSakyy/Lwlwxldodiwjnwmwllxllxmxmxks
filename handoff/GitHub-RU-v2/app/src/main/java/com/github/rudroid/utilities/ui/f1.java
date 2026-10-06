package com.github.rudroid.utilities.ui;

import androidx.compose.runtime.b2;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.a aVar, String str, w1.r rVar, boolean z) {
        String str2;
        int i3;
        w1.r rVar2;
        String str3;
        j71.a aVar2;
        w1.r rVar3;
        boolean z2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1088184249);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= sVar2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= sVar.h(aVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str2 = str;
        } else {
            str2 = str;
            i3 = i4 | (sVar2.f(str2) ? 2048 : 1024);
        }
        if (sVar2.S(i3 & 1, (i3 & 1171) != 1170)) {
            String str4 = i5 != 0 ? null : str2;
            androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r rVar4 = w1.o.a;
            w1.r c = w1.a.c(sVar2, rVar4);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, d);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            if (z) {
                sVar2.c0(208457995);
                rVar3 = rVar4;
                float f = 16;
                com.github.rudroid.uitoolkit.f1.a(androidx.compose.foundation.layout.b.B(rVar3, 0.0f, 0.0f, ih.a.n, 0.0f, 11), new s3.h(m7.y.a(f, f)), 2, 0L, sVar2, 432, 8);
                sVar2.q(false);
                z2 = true;
            } else {
                sVar2.c0(208697315);
                int i6 = i3 & 896;
                boolean z3 = (i6 == 256) | ((i3 & 7168) == 2048);
                Object N = sVar2.N();
                if (z3 || N == androidx.compose.runtime.n.a) {
                    aVar2 = aVar;
                    N = new com.github.rudroid.agents.sessionevents.ui.m0(str4, aVar2, 4);
                    sVar2.n0(N);
                } else {
                    aVar2 = aVar;
                }
                rVar3 = rVar4;
                z2 = true;
                sg.k0Shadow.b(d3.q.b(rVar4, false, (j71.c) N), false, aVar2, null, i4.p0(2131953209, sVar2), null, sVar, i6, 42);
                sVar2 = sVar;
                sVar2.q(false);
            }
            sVar2.q(z2);
            str3 = str4;
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
            str3 = str2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.copilothome.ui.k0(rVar2, z, aVar, str3, i, i2);
        }
    }
}
