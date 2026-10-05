package com.github.rudroid.searchandfilter.complexfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.BaseSearchViewModel$observeChannel$1", f = "BaseSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        q qVar = new q(this.w, cVar);
        qVar.v = obj;
        return qVar;
    }

    public final Object s(Object obj, Object obj2) {
        q r = r((a71.c) obj2, (String) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String str = (String) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.w.S(str);
        return w61.a0.a;
    }
}
