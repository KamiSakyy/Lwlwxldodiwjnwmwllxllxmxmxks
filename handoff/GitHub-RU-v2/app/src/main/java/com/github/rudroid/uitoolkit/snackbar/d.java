package com.github.rudroid.uitoolkit.snackbar;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.rudroid.starredreposandlists.u0;
import f1.ca;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final void a(Object obj, ca caVar, j71.c cVar, j71.c cVar2, j71.c cVar3, j71.c cVar4, j71.c cVar5, s sVar, int i) {
        j71.c cVar6;
        j71.c cVar7;
        j71.c cVar8;
        Object obj2 = obj;
        k71.k.g(caVar, "hostState");
        k71.k.g(cVar, "message");
        k71.k.g(cVar2, "onStateHandle");
        sVar.e0(-976613029);
        int i2 = i | (sVar.f(obj2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= sVar.f(caVar) ? 32 : 16;
        }
        int i3 = i2 | (sVar.h(cVar) ? 256 : 128) | (sVar.h(cVar2) ? 2048 : 1024) | 1794048;
        if (sVar.S(i3 & 1, (599187 & i3) != 599186)) {
            Object N = sVar.N();
            Object obj3 = androidx.compose.runtime.n.a;
            if (N == obj3) {
                N = b.r;
                sVar.n0(N);
            }
            j71.c cVar9 = (j71.c) N;
            Object N2 = sVar.N();
            if (N2 == obj3) {
                N2 = new u0(17);
                sVar.n0(N2);
            }
            j71.c cVar10 = (j71.c) N2;
            Object N3 = sVar.N();
            if (N3 == obj3) {
                N3 = new u0(17);
                sVar.n0(N3);
            }
            j71.c cVar11 = (j71.c) N3;
            f1 G = t.G(cVar, sVar);
            f1 G2 = t.G(cVar2, sVar);
            f1 G3 = t.G(cVar9, sVar);
            f1 G4 = t.G(cVar10, sVar);
            f1 G5 = t.G(cVar11, sVar);
            if (obj2 == null) {
                sVar.c0(-169692602);
                sVar.q(false);
            } else {
                sVar.c0(-169692601);
                boolean f = ((i3 & 112) == 32) | sVar.f(G) | sVar.h(obj2) | sVar.f(G2) | sVar.f(G3) | sVar.f(G5) | sVar.f(G4);
                Object N4 = sVar.N();
                if (f || N4 == obj3) {
                    c cVar12 = new c(caVar, obj2, G, G2, G3, G5, G4, null);
                    obj2 = obj2;
                    sVar.n0(cVar12);
                    N4 = cVar12;
                }
                t.f(sVar, (j71.e) N4, obj2);
                sVar.q(false);
            }
            cVar6 = cVar9;
            cVar7 = cVar10;
            cVar8 = cVar11;
        } else {
            sVar.V();
            cVar6 = cVar3;
            cVar7 = cVar4;
            cVar8 = cVar5;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.ui.c(obj2, caVar, cVar, cVar2, cVar6, cVar7, cVar8, i);
        }
    }
}
