package com.github.rudroid.starredreposandlists;

import com.github.rudroid.starredreposandlists.navigation.StarredReposAndListsRoute;

@c71.e(c = "com.github.rudroid.starredreposandlists.StarredReposAndListsViewModel$loadInitialPage$1", f = "StarredReposAndListsViewModel.kt", l = {103}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h0 w;
    public final /* synthetic */ com.github.rudroid.utilities.ui.s0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, com.github.rudroid.utilities.ui.s0 s0Var, a71.c cVar) {
        super(2, cVar);
        this.w = h0Var;
        this.x = s0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        h0 h0Var = this.w;
        StarredReposAndListsRoute starredReposAndListsRoute = h0Var.w;
        com.github.rudroid.activities.util.c cVar = h0Var.u;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            y71.y yVar = new y71.y(new a0(h0Var, this.x, null), new c00.g(h0Var.s.a(cVar.d(), starredReposAndListsRoute.a, (String) h0Var.y.t(h0Var, h0.C[0]), null, new y(h0Var, 2)), h0Var.t.a(cVar.d(), starredReposAndListsRoute.a, new y(h0Var, 3)), new z(3, null), 27));
            b0 b0Var = new b0(h0Var);
            this.v = 1;
            if (yVar.b(b0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
