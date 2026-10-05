package com.github.rudroid.viewmodels;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.IssueSearchViewModel$refresh$1$2", f = "IssueSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s1 extends c71.j implements j71.e {
    public final /* synthetic */ v1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(v1 v1Var, a71.c cVar) {
        super(2, cVar);
        this.v = v1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s1(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        s1 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        androidx.lifecycle.p0 p0Var = this.v.y;
        fl.e eVar = fl.f.Companion;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        return w61.a0.a;
    }
}
