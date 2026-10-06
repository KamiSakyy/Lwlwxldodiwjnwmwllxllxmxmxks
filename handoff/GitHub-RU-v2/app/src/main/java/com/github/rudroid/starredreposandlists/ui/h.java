package com.github.rudroid.starredreposandlists.ui;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.t;
import com.github.rudroid.uitoolkit.j1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.r0;
import com.github.rudroid.utilities.ui.u0;
import com.github.rudroid.utilities.ui.y0;
import k71.k;
import m0.s;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final void a(r rVar, g1 g1Var, s sVar, boolean z, r1.d dVar, j71.a aVar, j71.e eVar, j71.a aVar2, j71.e eVar2, j71.c cVar, com.github.rudroid.html.b bVar, androidx.compose.runtime.s sVar2, int i) {
        k.g(g1Var, "stateEvent");
        k.g(aVar, "onSwipeRefresh");
        k.g(eVar, "onListSelect");
        k.g(aVar2, "onNewListClick");
        k.g(eVar2, "onRepositoryClick");
        k.g(cVar, "onEditListsClick");
        k.g(bVar, "htmlStyler");
        sVar2.e0(417975616);
        int i2 = (sVar2.h(cVar) ? 536870912 : 268435456) | i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.f(g1Var) ? 32 : 16) | (sVar2.f(sVar) ? 256 : 128) | (sVar2.g(z) ? 2048 : 1024) | (sVar2.h(aVar) ? 131072 : 65536) | (sVar2.h(eVar) ? 1048576 : 524288) | (sVar2.h(aVar2) ? 8388608 : 4194304) | (sVar2.h(eVar2) ? 67108864 : 33554432);
        if (sVar2.S(i2 & 1, ((306783379 & i2) == 306783378 && ((sVar2.h(bVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            Boolean valueOf = Boolean.valueOf((g1Var instanceof r0) || (g1Var instanceof u0));
            boolean z2 = (i2 & 896) == 256;
            Object N = sVar2.N();
            if (z2 || N == n.a) {
                N = new a(sVar, null);
                sVar2.n0(N);
            }
            t.f(sVar2, (j71.e) N, valueOf);
            j1.a(rVar, g1Var instanceof y0, false, 0L, aVar, r1.i.d(-1869382899, new com.github.rudroid.fragments.onboarding.notifications.g(g1Var, dVar, sVar, aVar2, eVar, z, cVar, eVar2, bVar), sVar2), sVar2, (i2 & 14) | 196608 | (57344 & (i2 >> 3)), 12);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.discussions.ui.b(rVar, g1Var, sVar, z, dVar, aVar, eVar, aVar2, eVar2, cVar, bVar, i);
        }
    }

    public Object j(Object p1, Object p2, Object p3) { return null; }
    public static final Object o = null;
    public Object j(Object, int, Object) { return null; }
}
