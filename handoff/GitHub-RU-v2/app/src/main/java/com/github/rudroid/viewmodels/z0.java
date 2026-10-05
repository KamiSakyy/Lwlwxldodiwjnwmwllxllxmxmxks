package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$fetchRecentSearches$1", f = "GlobalSearchViewModel.kt", l = {111}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.w = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        g1 g1Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            ck.b S = g1Var.S();
            this.v = 1;
            obj = ((ck.f) S).a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        androidx.lifecycle.p0 p0Var = g1Var.x;
        fl.e eVar = fl.f.Companion;
        ArrayList X = g1.X((List) obj);
        eVar.getClass();
        p0Var.k(fl.e.c(X));
        return w61.a0.a;
    }
}
