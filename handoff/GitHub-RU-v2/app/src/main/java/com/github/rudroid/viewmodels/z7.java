package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class z7 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ g8 s;

    public /* synthetic */ z7(g8 g8Var, int i) {
        this.r = i;
        this.s = g8Var;
    }

    public final Object k(Object obj) {
        ArrayList arrayList;
        List list;
        switch (this.r) {
            case 0:
                y7 y7Var = (y7) obj;
                k71.k.g(y7Var, "state");
                break;
            case 1:
                h01.o oVar = (h01.o) obj;
                if (oVar == null || (list = oVar.b) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (k71.k.b(((h01.n) obj2).l, this.s.A)) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (arrayList == null) {
                    break;
                }
                break;
            case 2:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "executionError");
                this.s.s.a(bVar);
                break;
            default:
                fl.b bVar2 = (fl.b) obj;
                g8 g8Var = this.s;
                g8Var.getClass();
                k71.k.g(bVar2, "executionError");
                g8Var.s.a(bVar2);
                break;
        }
        return w61.a0.a;
    }
}
