package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public static final void a(w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(1369165996);
        int i2 = i | 6;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            w1.r rVar2 = w1.o.a;
            sVar2 = sVar;
            com.github.rudroid.uitoolkit.f1.a(androidx.compose.foundation.layout.b.z(p2.u(p2.d(rVar2, 1.0f)), 0.0f, ih.a.q, 1), null, 0.0f, 0L, sVar2, 0, 14);
            rVar = rVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.layout.r(i, 14, rVar);
        }
    }
}
