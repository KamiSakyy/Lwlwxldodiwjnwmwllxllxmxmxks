package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.b2;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public static final void a(w1.r rVar, String str, q0 q0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        w1.r rVar3;
        q0 q0Var2;
        w1.r rVar4;
        int i4;
        q0 q0Var3;
        k71.k.g(str, "text");
        sVar.e0(1401108458);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i | (sVar.f(rVar2) ? 4 : 2);
        }
        int i6 = i3 | (sVar.f(str) ? 32 : 16) | 128;
        if (sVar.S(i6 & 1, (i6 & 147) != 146)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                rVar4 = i5 != 0 ? w1.o.a : rVar2;
                i4 = i6 & (-897);
                q0Var3 = ih.d.f(sVar).x;
            } else {
                sVar.V();
                q0Var3 = q0Var;
                i4 = i6 & (-897);
                rVar4 = rVar2;
            }
            sVar.r();
            rVar3 = rVar4;
            ub.b(str, rVar3, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var3, sVar, ((i4 >> 3) & 14) | ((i4 << 3) & 112), 0, 131068);
            q0Var2 = q0Var3;
        } else {
            sVar.V();
            rVar3 = rVar2;
            q0Var2 = q0Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.uitoolkit.markdown.components.v(rVar3, str, q0Var2, i, i2, 1);
        }
    }

}
