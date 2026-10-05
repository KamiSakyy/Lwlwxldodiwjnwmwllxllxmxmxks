package com.github.rudroid.uitoolkit;

import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public static final void a(w1.r rVar, w1.r rVar2, p2 p2Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        int i4;
        k71.k.g(p2Var, "simpleMetadataItem");
        sVar.e0(1786053943);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (sVar.f(rVar2) ? 32 : 16);
        }
        int i7 = i4 | (sVar.f(p2Var) ? 256 : 128);
        if (sVar.S(i7 & 1, (i7 & 147) != 146)) {
            w1.r rVar3 = w1.o.a;
            if (i5 != 0) {
                rVar = rVar3;
            }
            if (i6 != 0) {
                rVar2 = rVar3;
            }
            ub.a(ih.d.f(sVar).y, r1.i.d(290176422, new com.github.rudroid.profile.status.ui.x(p2Var, rVar2, rVar, 13), sVar), sVar, 48);
        } else {
            sVar.V();
        }
        w1.r rVar4 = rVar;
        w1.r rVar5 = rVar2;
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.lazy.layout.k0(rVar4, rVar5, p2Var, i, i2, 29);
        }
    }
}
