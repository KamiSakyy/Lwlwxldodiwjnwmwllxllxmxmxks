package com.github.rudroid.viewmodels;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class p7<T> implements y71.j {
    public final /* synthetic */ k7 r;

    public p7(k7 k7Var) {
        this.r = k7Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        y71.y1 y1Var = this.r.v;
        x61.r rVar = x61.r.r;
        if (booleanValue) {
            fl.e eVar = fl.f.Companion;
            x61.r rVar2 = (List) ((fl.f) y1Var.getValue()).b;
            if (rVar2 != null) {
                rVar = rVar2;
            }
            eVar.getClass();
            y1Var.k((Object) null, fl.e.c(rVar));
        } else {
            fl.f.Companion.getClass();
            fl.f c = fl.e.c(rVar);
            y1Var.getClass();
            y1Var.k((Object) null, c);
        }
        return w61.a0.a;
    }
}
