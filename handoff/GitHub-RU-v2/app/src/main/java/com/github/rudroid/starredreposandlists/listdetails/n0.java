package com.github.rudroid.starredreposandlists.listdetails;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.List;
import y71.y1;
import yz0.g1;
import yz0.p2;

/* loaded from: /home/user/work/p/classes3.dex */
final class n0<T> implements y71.j {
    public final /* synthetic */ s0 r;

    public n0(s0 s0Var) {
        this.r = s0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        g1 g1Var = (g1) obj;
        x01.i iVar = g1Var.b.b;
        s0 s0Var = this.r;
        s0Var.x = iVar;
        y1 y1Var = s0Var.B;
        y1 y1Var2 = s0Var.A;
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        p2 p2Var = g1Var.a;
        aVar.getClass();
        t1 t1Var = new t1(p2Var);
        y1Var2.getClass();
        y1Var2.k((Object) null, t1Var);
        List list = g1Var.b.a;
        if (list.isEmpty()) {
            com.github.rudroid.utilities.w0.k(y1Var);
        } else {
            com.github.rudroid.utilities.w0.p(y1Var, list);
        }
        return w61.a0.a;
    }
}
