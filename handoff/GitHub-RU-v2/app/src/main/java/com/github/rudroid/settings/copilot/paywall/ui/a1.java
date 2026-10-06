package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.runtime.b2;
import com.github.rudroid.adapters.viewholders.d2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 {
    public static final void a(w1.r rVar, j71.a aVar, int i, int i2, androidx.compose.runtime.s sVar, int i3, int i4) {
        int i5;
        w1.r rVar2;
        k71.k.g(aVar, "onDialogDismiss");
        sVar.e0(-1670481007);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar.h(aVar) ? 32 : 16;
        }
        int i7 = i5 | (sVar.d(i) ? 256 : 128) | (sVar.d(i2) ? 2048 : 1024);
        if (sVar.S(i7 & 1, (i7 & 1171) != 1170)) {
            w1.r rVar3 = i6 != 0 ? w1.o.a : rVar;
            xg.tShadow.b(rVar3, r1.i.d(-84704445, new d2(i, 3), sVar), r1.i.d(-969440252, new d2(i2, 4), sVar), r1.i.d(-1854176059, new com.github.rudroid.agents.copilothome.ui.f0(21, aVar), sVar), aVar, sVar, ((i7 << 9) & 57344) | (i7 & 14) | 3504, 0);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new z0(rVar2, aVar, i, i2, i3, i4);
        }
    }
}
