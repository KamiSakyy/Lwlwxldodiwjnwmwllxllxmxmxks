package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.a6;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class x5 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ a6 s;

    public /* synthetic */ x5(a6 a6Var, int i) {
        this.r = i;
        this.s = a6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        int i2 = 0;
        int i3 = 1;
        a6 a6Var = this.s;
        switch (i) {
            case 0:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                a6.a aVar = a6.Companion;
                k71.k.g(g1Var, "model");
                break;
            case 1:
                yz0.m3 m3Var = (yz0.m3) obj;
                a6.a aVar2 = a6.Companion;
                k71.k.g(m3Var, "searchResult");
                y3 y3Var = a6Var.z;
                ArrayList arrayList = m3Var.b;
                String S = a6Var.S();
                String str = m3Var.a;
                if (str == null) {
                    str = "";
                }
                y3Var.getClass();
                k71.k.g(S, "currentQuery");
                com.github.rudroid.common.k0 k0Var = com.github.rudroid.common.k0.s;
                Object[] objArr = t71.p.I(S, "user-review-requested:@me", false) || t71.p.I(S, "review-requested:@me", false);
                ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    yz0.j3 j3Var = (yz0.j3) obj2;
                    he.q a = he.r.a(j3Var.v);
                    if (a == he.q.r && objArr != false) {
                        a = null;
                    }
                    arrayList2.add(oe.d.b(j3Var, a, 1));
                }
                break;
            case 2:
                y71.y1 y1Var = a6Var.C;
                Boolean bool = Boolean.FALSE;
                y1Var.getClass();
                y1Var.k((Object) null, bool);
                break;
            case 3:
                fl.b bVar = (fl.b) obj;
                y71.y1 y1Var2 = a6Var.A;
                a6Var.X(y1Var2, bVar, ((com.github.rudroid.utilities.ui.g1) y1Var2.getValue()).getData() == null);
                break;
            case 4:
                fl.b bVar2 = (fl.b) obj;
                y71.y1 y1Var3 = a6Var.A;
                a6Var.X(y1Var3, bVar2, ((com.github.rudroid.utilities.ui.g1) y1Var3.getValue()).getData() == null);
                break;
            default:
                fl.b bVar3 = (fl.b) obj;
                y71.y1 y1Var4 = a6Var.A;
                a6Var.X(y1Var4, bVar3, ((com.github.rudroid.utilities.ui.g1) y1Var4.getValue()).getData() == null);
                break;
        }
        return a0Var;
    }
}
