package com.github.rudroid.templates.ui;

import androidx.compose.runtime.b2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.s1;
import k71.k;
import m0.s;
import m0.u;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r4 == androidx.compose.runtime.n.a) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, j71.c cVar, g1 g1Var, s sVar, androidx.compose.runtime.s sVar2, int i) {
        r rVar2;
        s sVar3;
        int i2;
        r rVar3;
        s sVar4;
        Object obj;
        k.g(cVar, "onTemplateClick");
        k.g(g1Var, "stateEvent");
        sVar2.e0(488051964);
        int i3 = i | 6 | (sVar2.h(cVar) ? 32 : 16) | (sVar2.f(g1Var) ? 256 : 128) | 1024;
        if (sVar2.S(i3 & 1, (i3 & 1171) != 1170)) {
            sVar2.X();
            if ((i & 1) == 0 || sVar2.A()) {
                s a = u.a(0, 3, sVar2);
                i2 = i3 & (-7169);
                rVar3 = o.a;
                sVar4 = a;
            } else {
                sVar2.V();
                i2 = i3 & (-7169);
                rVar3 = rVar;
                sVar4 = sVar;
            }
            sVar2.r();
            boolean z = (i2 & 112) == 32;
            Object N = sVar2.N();
            if (!z) {
                obj = N;
            }
            com.github.rudroid.actions.checkssummary.ui.d dVar = new com.github.rudroid.actions.checkssummary.ui.d(9, cVar);
            sVar2.n0(dVar);
            obj = dVar;
            r rVar4 = rVar3;
            s1.c(rVar4, g1Var, null, null, null, null, null, null, null, sVar4, null, null, null, null, null, (j71.f) obj, sVar2, 6 | ((i2 >> 3) & 112), 0, 65020);
            rVar2 = rVar4;
            sVar3 = sVar4;
        } else {
            sVar2.V();
            rVar2 = rVar;
            sVar3 = sVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new bd.d(rVar2, cVar, g1Var, sVar3, i, 28);
        }
    }
}
