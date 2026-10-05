package com.github.rudroid.searchandfilter.filterbar;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.utilities.ui.e0;
import com.github.rudroid.utilities.ui.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(int i, int i2, s sVar, j71.a aVar, boolean z) {
        k71.k.g(aVar, "resetFilter");
        sVar.e0(-1100544556);
        int i3 = (sVar.h(aVar) ? 4 : 2) | i2 | (sVar.g(z) ? 32 : 16) | (sVar.d(i) ? 256 : 128);
        if (!sVar.S(i3 & 1, (i3 & 147) != 146)) {
            sVar.V();
        } else if (z) {
            sVar.c0(1457631690);
            e0.a(null, Integer.valueOf(i), 2131952621, 2131952619, aVar, sVar, ((i3 >> 3) & 112) | ((i3 << 12) & 57344));
            sVar.q(false);
        } else {
            sVar.c0(1457891718);
            m0.a(null, 2131231509, i, null, sVar, i3 & 896, 9);
            sVar.q(false);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new b(aVar, z, i, i2);
        }
    }
}
