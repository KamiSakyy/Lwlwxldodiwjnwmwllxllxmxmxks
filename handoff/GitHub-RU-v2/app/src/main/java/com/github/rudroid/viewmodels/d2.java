package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.e2;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d2 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ e2 s;

    public /* synthetic */ d2(e2 e2Var, int i) {
        this.r = i;
        this.s = e2Var;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        int i2 = 0;
        e2 e2Var = this.s;
        switch (i) {
            case 0:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                e2.a aVar = e2.Companion;
                k71.k.g(g1Var, "stateEvent");
                break;
            case 1:
                yz0.e4 e4Var = (yz0.e4) obj;
                e2.a aVar2 = e2.Companion;
                k71.k.g(e4Var, "repositoryIssuesPaged");
                b2 b2Var = e2Var.y;
                String str = e4Var.a;
                if (str == null) {
                    str = "";
                }
                p01.m mVar = e4Var.b;
                ArrayList arrayList = mVar.a;
                ArrayList arrayList2 = mVar.b;
                boolean z = mVar.c;
                Boolean bool = (Boolean) e2Var.t.a("EXTRA_REPO_SHOW_PINNED_ISSUES");
                r3 = (!(bool != null ? bool.booleanValue() : false) || e2Var.C || e2Var.D) ? 0 : 1;
                b2Var.getClass();
                y61.b i3 = sy.d0Shadow.i();
                if (!arrayList.isEmpty() && r3 != 0) {
                    i3.add(new oe.e());
                    ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        yz0.y1 y1Var = (yz0.y1) obj2;
                        arrayList3.add(oe.b.a(y1Var, "pinned:" + y1Var + ".id"));
                    }
                    i3.addAll(arrayList3);
                    i3.add(new oe.f());
                }
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList2, 10));
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    yz0.y1 y1Var2 = (yz0.y1) obj3;
                    arrayList4.add(oe.b.a(y1Var2, "search:".concat(y1Var2.a)));
                }
                i3.addAll(arrayList4);
                break;
            case 2:
                fl.b bVar = (fl.b) obj;
                y71.y1 y1Var3 = e2Var.z;
                e2Var.X(y1Var3, bVar, ((com.github.rudroid.utilities.ui.g1) y1Var3.getValue()).getData() == null);
                break;
            case 3:
                fl.b bVar2 = (fl.b) obj;
                y71.y1 y1Var4 = e2Var.z;
                e2Var.X(y1Var4, bVar2, ((com.github.rudroid.utilities.ui.g1) y1Var4.getValue()).getData() == null);
                break;
            default:
                fl.b bVar3 = (fl.b) obj;
                y71.y1 y1Var5 = e2Var.z;
                e2Var.X(y1Var5, bVar3, ((com.github.rudroid.utilities.ui.g1) y1Var5.getValue()).getData() == null);
                break;
        }
        return a0Var;
    }
}
