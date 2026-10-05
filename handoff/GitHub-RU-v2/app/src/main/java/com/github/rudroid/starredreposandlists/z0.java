package com.github.rudroid.starredreposandlists;

import com.github.rudroid.main.MainActivity;

@c71.e(c = "com.github.rudroid.starredreposandlists.StarredRepositoriesAndListsFragment$onCreateView$1$1$1$4$1", f = "StarredRepositoriesAndListsFragment.kt", l = {212}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m0.s w;
    public final /* synthetic */ StarredRepositoriesAndListsFragment x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(m0.s sVar, StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
        this.x = starredRepositoriesAndListsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.x;
        o0 o0Var = new o0(starredRepositoriesAndListsFragment, 3);
        MainActivity g4 = starredRepositoriesAndListsFragment.g4();
        MainActivity mainActivity = g4 instanceof MainActivity ? g4 : null;
        if (mainActivity != null) {
            this.v = 1;
            if (com.github.rudroid.interfaces.c.a(this.w, o0Var, mainActivity, this) == aVar) {
                return aVar;
            }
        }
        return a0Var;
    }
}
