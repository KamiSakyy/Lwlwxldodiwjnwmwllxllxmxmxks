package com.github.rudroid.starredreposandlists;

import androidx.compose.runtime.b2;
import com.github.rudroid.agents.sessionevents.ui.o2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public static final void a(int i, androidx.compose.runtime.s sVar, w1.r rVar, boolean z) {
        w1.r rVar2;
        sVar.e0(-337322056);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.g(z) ? 32 : 16;
        }
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1141567338, new t(z, 0), sVar), sVar, 805306368, 511);
            rVar2 = w1.o.a;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new o2(rVar2, z, i);
        }
    }
}
