package com.github.rudroid.uitoolkit.utils.lists;

import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public static final void a(o0.b bVar, int i, j71.a aVar, j71.a aVar2, androidx.compose.runtime.s sVar, int i2) {
        k71.k.g(aVar, "canLoadNextPage");
        k71.k.g(aVar2, "loadPage");
        sVar.e0(-1295348668);
        int i3 = (sVar.f(bVar) ? 4 : 2) | i2 | 48 | (sVar.h(aVar) ? 256 : 128) | (sVar.h(aVar2) ? 2048 : 1024);
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new h0(bVar, aVar, aVar2, null);
                sVar.n0(N);
            }
            androidx.compose.runtime.t.g(bVar, aVar, aVar2, (j71.e) N, sVar);
            i = 5;
        } else {
            sVar.V();
        }
        int i4 = i;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.uitoolkit.markdown.components.v(i4, i2, 2, (Object) bVar, (Object) aVar2, (w61.e) aVar);
        }
    }
}
