package com.github.rudroid.starredreposandlists.listdetails;

import com.github.rudroid.utilities.ui.g1;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.starredreposandlists.listdetails.ListDetailViewModel$loadNextPage$1$2", f = "ListDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p0 extends c71.j implements j71.e {
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, a71.c cVar) {
        super(2, cVar);
        this.v = s0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p0(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        p0 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y1 y1Var = this.v.B;
        g1.a aVar2 = g1.Companion;
        x61.rShadow rVar = (List) ((g1) y1Var.getValue()).getData();
        if (rVar == null) {
            rVar = x61.rShadow.r;
        }
        aVar2.getClass();
        com.github.rudroid.utilities.ui.t0 t0Var = new com.github.rudroid.utilities.ui.t0(rVar);
        y1Var.getClass();
        y1Var.k((Object) null, t0Var);
        return w61.a0.a;
    }
}
