package com.github.rudroid.starredreposandlists;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.List;
import y71.y1;
import yz0.c4;

/* loaded from: /home/user/work/p/classes3.dex */
final class e0<T> implements y71.j {
    public final /* synthetic */ h0 r;

    public e0(h0 h0Var) {
        this.r = h0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        x61.rShadow rVar;
        c4 c4Var;
        c4 c4Var2 = (c4) obj;
        x01.i iVar = c4Var2.b;
        h0 h0Var = this.r;
        h0Var.x = iVar;
        y1 y1Var = h0Var.A;
        w61.k kVar = (w61.k) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        x61.rShadow rVar2 = x61.rShadow.r;
        x61.rShadow l0 = (kVar == null || (c4Var = (c4) kVar.r) == null) ? rVar2 : x61.m.l0(c4Var.a, c4Var2.a);
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        c4 c4Var3 = new c4(l0, c4Var2.b);
        w61.k kVar2 = (w61.k) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        if (kVar2 != null && (rVar = (List) kVar2.s) != null) {
            rVar2 = rVar;
        }
        w61.k kVar3 = new w61.k(c4Var3, rVar2);
        aVar.getClass();
        t1 t1Var = new t1(kVar3);
        y1Var.getClass();
        y1Var.k((Object) null, t1Var);
        return w61.a0.a;
    }
}
