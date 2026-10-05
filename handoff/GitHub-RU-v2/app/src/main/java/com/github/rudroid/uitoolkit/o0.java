package com.github.rudroid.uitoolkit;

import f1.ca;
import f1.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public static final void a(w1.r rVar, ca caVar, androidx.compose.runtime.s sVar, int i) {
        ca caVar2;
        androidx.compose.runtime.s sVar2;
        k71.k.g(caVar, "hostState");
        sVar.e0(263170321);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.f(caVar) ? 32 : 16;
        }
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            w1.r rVar2 = w1.o.a;
            caVar2 = caVar;
            sVar2 = sVar;
            e8.n(caVar2, androidx.compose.foundation.layout.p2.e(rVar2, 1.0f).f(rVar2), o.b, sVar2, ((i2 >> 3) & 14) | 384, 0);
            rVar = rVar2;
        } else {
            caVar2 = caVar;
            sVar2 = sVar;
            sVar2.V();
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new a0.r1(rVar, caVar2, i, 22);
        }
    }
}
