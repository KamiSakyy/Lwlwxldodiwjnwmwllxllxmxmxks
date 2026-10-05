package com.github.rudroid.viewmodels;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class i4 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ c5 s;

    public /* synthetic */ i4(c5 c5Var, int i) {
        this.r = i;
        this.s = c5Var;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.r) {
            case 0:
                y71.y1 y1Var = this.s.H;
                g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
                Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
                aVar.getClass();
                y1Var.k((Object) null, g1.a.b(bVar, data));
                break;
            case 1:
                y71.y1 y1Var2 = this.s.H;
                g1.a aVar2 = com.github.rudroid.utilities.ui.g1.Companion;
                Object data2 = ((com.github.rudroid.utilities.ui.g1) y1Var2.getValue()).getData();
                aVar2.getClass();
                y1Var2.k((Object) null, g1.a.b(bVar, data2));
                break;
            case 2:
                y71.y1 y1Var3 = this.s.H;
                g1.a aVar3 = com.github.rudroid.utilities.ui.g1.Companion;
                Object data3 = ((com.github.rudroid.utilities.ui.g1) y1Var3.getValue()).getData();
                aVar3.getClass();
                y1Var3.k((Object) null, g1.a.b(bVar, data3));
                break;
            case 3:
                k71.k.g(bVar, "executionError");
                this.s.t.a(bVar);
                break;
            default:
                k71.k.g(bVar, "executionError");
                this.s.t.a(bVar);
                break;
        }
        return w61.a0.a;
    }
}
