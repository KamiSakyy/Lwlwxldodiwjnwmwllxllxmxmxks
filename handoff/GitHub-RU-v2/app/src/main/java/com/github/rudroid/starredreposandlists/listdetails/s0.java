package com.github.rudroid.starredreposandlists.listdetails;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.starredreposandlists.navigation.ListDetailRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.ui.t1;
import com.github.rudroid.viewmodels.v3;
import java.util.List;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 extends k1 implements v3 {
    public y1 A;
    public y1 B;
    public ll.b s;
    public ym.b t;
    public com.github.rudroid.activities.util.c u;
    public c0 v;
    public ListDetailRoute w;
    public x01.i x;
    public y1 y;
    public i1 z;

    public s0(ll.b bVar, ym.b bVar2, com.github.rudroid.activities.util.c cVar, c0 c0Var, a1 a1Var) {
        k71.k.g(bVar, "fetchListUseCase");
        k71.k.g(bVar2, "deleteListUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = bVar;
        this.t = bVar2;
        this.u = cVar;
        this.v = c0Var;
        ListDetailRoute listDetailRoute = (ListDetailRoute) sy.y.m(a1Var, k71.x.a(ListDetailRoute.class), x61.s.r);
        this.w = listDetailRoute;
        x01.i.Companion.getClass();
        this.x = x01.i.d;
        y1 c = n1.c(listDetailRoute.b);
        this.y = c;
        this.z = new i1(c);
        this.A = n1.c(g1.a.c(g1.Companion));
        this.B = n1.c(new com.github.rudroid.utilities.ui.u0(null));
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new o0(null, this, false), 3);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new r0(this, null), 3);
    }

    public final void P(boolean z) {
        y1 y1Var = this.B;
        if (z) {
            g1.a aVar = g1.Companion;
            Object data = ((g1) y1Var.getValue()).getData();
            aVar.getClass();
            com.github.rudroid.utilities.ui.u0 u0Var = new com.github.rudroid.utilities.ui.u0(data);
            y1Var.getClass();
            y1Var.k((Object) null, u0Var);
            return;
        }
        List list = (List) ((g1) y1Var.getValue()).getData();
        if (list != null) {
            g1.Companion.getClass();
            t1 t1Var = new t1(list);
            y1Var.getClass();
            y1Var.k((Object) null, t1Var);
        }
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        return h1.g((g1) this.B.getValue()) && this.x.a();
    }
}
