package com.github.rudroid.starredreposandlists.listdetails;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;

@c71.e(c = "com.github.rudroid.starredreposandlists.listdetails.ListDetailViewModel$listData$1", f = "ListDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k0 extends c71.j implements j71.f {
    public /* synthetic */ g1 v;
    public /* synthetic */ g1 w;
    public final /* synthetic */ s0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(s0 s0Var, a71.c cVar) {
        super(3, cVar);
        this.x = s0Var;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        k0 k0Var = new k0(this.x, (a71.c) obj3);
        k0Var.v = (g1) obj;
        k0Var.w = (g1) obj2;
        return k0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        g1 g1Var = this.v;
        g1 g1Var2 = this.w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return h1.h(g1Var2, new f0(1, g1Var, this.x));
    }
}
