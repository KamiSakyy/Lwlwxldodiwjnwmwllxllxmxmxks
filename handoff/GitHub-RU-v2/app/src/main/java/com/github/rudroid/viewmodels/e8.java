package com.github.rudroid.viewmodels;

import com.github.rudroid.utilities.ui.g1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
final class e8<T> implements y71.j {
    public final /* synthetic */ g8 r;
    public final /* synthetic */ Set s;
    public final /* synthetic */ String t;
    public final /* synthetic */ int u;

    public e8(g8 g8Var, Set set, String str, int i) {
        this.r = g8Var;
        this.s = set;
        this.t = str;
        this.u = i;
    }

    public final Object c(Object obj, a71.c cVar) {
        Object value;
        y7 y7Var;
        h01.o oVar;
        com.github.rudroid.utilities.ui.t1 t1Var;
        Set set;
        String str;
        List list;
        List list2 = (List) obj;
        y71.y1 y1Var = this.r.x;
        do {
            value = y1Var.getValue();
            y7Var = (y7) value;
            g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
            h01.o oVar2 = (h01.o) ((y7) y1Var.getValue()).a.getData();
            if (oVar2 != null) {
                h01.o oVar3 = (h01.o) ((y7) y1Var.getValue()).a.getData();
                if (oVar3 != null) {
                    ArrayList H0 = x61.m.H0(oVar3.b);
                    H0.addAll(this.u + 1, list2);
                    list = x61.m.F0(H0);
                } else {
                    list = x61.r.r;
                }
                oVar = new h01.o(oVar2.a, list, oVar2.c);
            } else {
                oVar = null;
            }
            aVar.getClass();
            t1Var = new com.github.rudroid.utilities.ui.t1(oVar);
            set = this.s;
            str = this.t;
        } while (!y1Var.i(value, y7.a(y7Var, t1Var, false, sy.f0.n(set, str), sy.f0.k(y7Var.d, str), 2)));
        return w61.a0.a;
    }
}
