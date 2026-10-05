package com.github.rudroid.uitoolkit.utils;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.z1;
import f1.g2;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public static final void a(long j, q0 q0Var, j71.e eVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(-2066637719);
        int i2 = (sVar.e(j) ? 4 : 2) | i | (sVar.f(q0Var) ? 32 : 16) | (sVar.h(eVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.runtime.d0 d0Var = ub.a;
            androidx.compose.runtime.t.b(new z1[]{f1.e.f(j, g2.a), d0Var.a(((q0) sVar.j(d0Var)).d(q0Var))}, eVar, sVar, ((i2 >> 3) & 112) | 8);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.triagesheet.projectbetacard.f(j, q0Var, eVar, i, 1);
        }
    }
}
