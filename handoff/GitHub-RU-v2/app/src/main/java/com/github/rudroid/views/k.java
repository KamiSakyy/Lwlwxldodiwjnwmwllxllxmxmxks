package com.github.rudroid.views;

import com.github.rudroid.activities.d0;
import com.github.rudroid.views.LoadingViewFlipper;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ d0 s;
    public final /* synthetic */ fl.b t;

    public /* synthetic */ k(d0 d0Var, fl.b bVar, int i) {
        this.r = i;
        this.s = d0Var;
        this.t = bVar;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        a0 a0Var = a0.a;
        fl.b bVar = this.t;
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
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-1185405096, new k(d0Var, bVar, i2), sVar), sVar, 805306368, 511);
                    break;
                }
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                LoadingViewFlipper.a aVar2 = LoadingViewFlipper.Companion;
                if (!sVar2.S(1 & intValue2, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    d0Var.g(bVar, sVar2, 0);
                    break;
                }
        }
        return a0Var;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g {
        public g() {
        }
    }
}
