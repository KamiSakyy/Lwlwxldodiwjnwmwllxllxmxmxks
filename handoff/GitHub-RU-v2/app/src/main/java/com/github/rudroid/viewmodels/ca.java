package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.TriageReviewersViewModel$observeChannel$2", f = "TriageReviewersViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class ca extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ t9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(t9 t9Var, a71.c cVar) {
        super(2, cVar);
        this.w = t9Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        ca caVar = new ca(this.w, cVar);
        caVar.v = obj;
        return caVar;
    }

    public final Object s(Object obj, Object obj2) {
        ca r = r((a71.c) obj2, (w61.k) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        w61.k kVar = (w61.k) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        String str = (String) kVar.r;
        if (!t71.p.T(str)) {
            t9 t9Var = this.w;
            t9Var.J = str;
            t9Var.P();
        }
        return w61.a0.a;
    }
}
