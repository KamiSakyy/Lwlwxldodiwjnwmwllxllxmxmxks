package com.github.rudroid.viewmodels;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.RepositorySearchViewModel$loadNextPage$1$2", f = "RepositorySearchViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a7 extends c71.j implements j71.e {
    public final /* synthetic */ v6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(v6 v6Var, a71.c cVar) {
        super(2, cVar);
        this.v = v6Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a7(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        a7 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        androidx.lifecycle.p0 p0Var = this.v.w;
        fl.e eVar = fl.f.Companion;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        return w61.a0.a;
    }
}
