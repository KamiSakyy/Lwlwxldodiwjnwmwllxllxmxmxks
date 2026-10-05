package com.github.rudroid.searchandfilter.filterbar;

import a0.g2;
import androidx.compose.runtime.s;
import com.github.rudroid.searchandfilter.filterbar.f;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements j71.g {
    public final /* synthetic */ List r;

    public o(List list) {
        this.r = list;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        s sVar = (s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(bVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            f fVar = (f) this.r.get(intValue);
            sVar.c0(-1494222365);
            r1.d d = r1.i.d(364245146, new l(fVar, m0.b.a(bVar, w1.o.a, (g2) null, 7)), sVar);
            f.b bVar2 = fVar instanceof f.b ? (f.b) fVar : null;
            com.github.rudroid.uitoolkit.tooltip.h hVar = bVar2 != null ? bVar2.f : null;
            if (hVar != null) {
                sVar.c0(-1493392217);
                boolean h = sVar.h(hVar);
                Object N = sVar.N();
                if (h || N == androidx.compose.runtime.n.a) {
                    N = new k(hVar);
                    sVar.n0(N);
                }
                com.github.rudroid.uitoolkit.tooltip.e.a(hVar, null, (j71.a) N, null, null, null, null, null, d, sVar, 100663296, 250);
                sVar.q(false);
            } else {
                sVar.c0(-1493107606);
                d.s(sVar, 6);
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
