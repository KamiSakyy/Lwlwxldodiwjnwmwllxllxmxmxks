package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, w1.r rVar) {
        int i3;
        androidx.compose.runtime.s sVar2;
        sVar.e0(-14810882);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (sVar.S(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                rVar = w1.o.a;
            }
            sVar2 = sVar;
            com.github.rudroid.uitoolkit.f1.a(p2.d(rVar, 1.0f), null, 0.0f, 0L, sVar2, 0, 14);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.agenttasks.c(rVar, i, i2, 6);
        }
    }
}
