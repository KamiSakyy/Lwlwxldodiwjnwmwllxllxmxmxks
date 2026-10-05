package com.github.rudroid.uitoolkit.copilot;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import java.util.List;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final void a(r rVar, List list, j71.c cVar, boolean z, s sVar, int i, int i2) {
        int i3;
        r rVar2;
        boolean z2;
        k71.k.g(cVar, "onSuggestionSelect");
        sVar.e0(1683809119);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        }
        int i5 = i3 | (sVar.h(list) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= sVar.h(cVar) ? 256 : 128;
        }
        int i6 = i5 | 3072;
        if (sVar.S(i6 & 1, (i6 & 1171) != 1170)) {
            if (i4 != 0) {
                rVar = o.a;
            }
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
            androidx.compose.foundation.layout.j g = androidx.compose.foundation.layout.l.g(ih.a.l);
            boolean h = sVar.h(list) | ((i6 & 896) == 256);
            Object N = sVar.N();
            if (h || N == n.a) {
                N = new d(list, cVar, 0);
                sVar.n0(N);
            }
            int i7 = (i6 & 14) | 27648;
            r rVar3 = rVar;
            ah.h.a(rVar3, 0L, 0.0f, true, g, null, (j71.c) N, sVar, i7, 38);
            rVar2 = rVar3;
            z2 = true;
        } else {
            sVar.V();
            rVar2 = rVar;
            z2 = z;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.c(rVar2, list, cVar, z2, i, i2);
        }
    }
}
