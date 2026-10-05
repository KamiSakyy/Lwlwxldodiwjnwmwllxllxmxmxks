package com.github.rudroid.utilities;

import android.content.Context;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class j1 implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.f s;

    public /* synthetic */ j1(j71.f fVar, int i) {
        this.r = i;
        this.s = fVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        w61.a0 a0Var;
        switch (this.r) {
            case 0:
                fl.b bVar = (fl.b) obj;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g(bVar, "e");
                this.s.f(bVar, (androidx.compose.runtime.s) obj2, Integer.valueOf(intValue & 14));
                break;
            case 1:
                fl.b bVar2 = (fl.b) obj;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g(bVar2, "e");
                this.s.f(bVar2, (androidx.compose.runtime.s) obj2, Integer.valueOf(intValue2 & 14));
                break;
            case 2:
                fl.b bVar3 = (fl.b) obj;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                k71.k.g(bVar3, "it");
                com.github.rudroid.activities.d0 a = com.github.rudroid.activities.e0.a((Context) sVar.j(w2.j0.b));
                j71.f fVar = this.s;
                w61.a0 a0Var2 = w61.a0.a;
                if (a == null) {
                    sVar.c0(-200692572);
                    sVar.q(false);
                    a0Var = null;
                } else {
                    sVar.c0(-1114852611);
                    a.j(r1.i.d(-868432104, new com.github.rudroid.settings.copilot.debug.q((Object) fVar, (Object) bVar3, false, 13), sVar), bVar3, sVar, ((intValue3 << 3) & 112) | 6);
                    sVar.q(false);
                    a0Var = a0Var2;
                }
                if (a0Var == null) {
                    sVar.c0(-1114847529);
                    fVar.f(bVar3, sVar, Integer.valueOf(intValue3 & 14));
                    sVar.q(false);
                } else {
                    sVar.c0(-1114855155);
                    sVar.q(false);
                }
                return a0Var2;
            case 3:
                androidx.compose.foundation.layout.m2 m2Var = (androidx.compose.foundation.layout.m2) obj;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k71.k.g(m2Var, "$this$PrimaryTopAppBar");
                if ((intValue4 & 6) == 0) {
                    intValue4 |= sVar2.f(m2Var) ? 4 : 2;
                }
                if (sVar2.S(intValue4 & 1, (intValue4 & 19) != 18)) {
                    this.s.f(m2Var, sVar2, Integer.valueOf(intValue4 & 14));
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
            default:
                androidx.compose.foundation.layout.m2 m2Var2 = (androidx.compose.foundation.layout.m2) obj;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                k71.k.g(m2Var2, "$this$OutlinedButton");
                if ((intValue5 & 6) == 0) {
                    intValue5 |= sVar3.f(m2Var2) ? 4 : 2;
                }
                if (sVar3.S(intValue5 & 1, (intValue5 & 19) != 18)) {
                    this.s.f(m2Var2, sVar3, Integer.valueOf(intValue5 & 14));
                } else {
                    sVar3.V();
                }
                return w61.a0.a;
        }
        return w61.a0.a;
    }
}
