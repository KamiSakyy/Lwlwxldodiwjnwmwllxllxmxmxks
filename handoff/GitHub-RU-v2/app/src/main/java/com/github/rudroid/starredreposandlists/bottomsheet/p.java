package com.github.rudroid.starredreposandlists.bottomsheet;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public static final void a(int i, androidx.compose.runtime.s sVar, j71.a aVar, w1.r rVar) {
        int i2;
        w1.r rVar2;
        k71.k.g(aVar, "onClick");
        sVar.e0(820524540);
        if ((i & 6) == 0) {
            i2 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new c(2, aVar);
                sVar.n0(N);
            }
            w1.r rVar3 = w1.o.a;
            w1.r f = p2.f(f0.o.m(rVar3, false, (String) null, (d3.k) null, (j71.a) N, 15), ih.a.F);
            float f2 = ih.a.n;
            w1.r e = p2.e(androidx.compose.foundation.layout.b.z(f, f2, 0.0f, 2), 1.0f);
            long j = ih.d.b(sVar).F;
            com.github.rudroid.uitoolkit.text.k.c(e, com.github.rudroid.uitoolkit.text.m.b(2131231405, null, null, 14), androidx.compose.foundation.layout.b.f(f2, 0.0f, 0.0f, 0.0f, 14), new d2.t(j), null, null, i4.p0(2131953006, sVar), i4.p0(2131953728, sVar), ih.d.b(sVar).F, 0, 0, null, false, sVar, 0, 0, 15920);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.ui.a(aVar, rVar2, i, 10);
        }
    }

    public static final void b(List list, j71.c cVar, j71.a aVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(2060834442);
        int i2 = i | (sVar.h(list) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1316481852, new j(list, aVar, cVar), sVar), sVar, 805306368, 511);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j(list, cVar, aVar, i);
        }
    }
}
