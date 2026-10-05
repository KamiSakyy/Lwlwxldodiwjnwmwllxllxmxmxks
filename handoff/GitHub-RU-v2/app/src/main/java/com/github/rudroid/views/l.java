package com.github.rudroid.views;

import com.github.rudroid.activities.d0;
import com.github.rudroid.views.LoadingViewFlipper;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ d0 s;

    public /* synthetic */ l(d0 d0Var, int i) {
        this.r = i;
        this.s = d0Var;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        a0 a0Var = a0.a;
        d0 d0Var = this.s;
        int i2 = 1;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                LoadingViewFlipper.a aVar = LoadingViewFlipper.Companion;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-1602742321, new l(d0Var, i2), sVar), sVar, 805306368, 511);
                    break;
                }
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                LoadingViewFlipper.a aVar2 = LoadingViewFlipper.Companion;
                if (!sVar2.S(1 & intValue2, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    d0Var.u(0, sVar2);
                    break;
                }
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!sVar3.S(1 & intValue3, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    d0Var.u(0, sVar3);
                    break;
                }
        }
        return a0Var;
    }
}
