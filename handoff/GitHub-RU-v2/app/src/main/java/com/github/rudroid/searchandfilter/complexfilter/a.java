package com.github.rudroid.searchandfilter.complexfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.BaseLocalSearchViewModel$2", f = "BaseLocalSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, a71.c cVar) {
        super(2, cVar);
        this.w = bVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        a aVar = new a(this.w, cVar);
        aVar.v = obj;
        return aVar;
    }

    public final Object s(Object obj, Object obj2) {
        a r = r((a71.c) obj2, (String) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String str = (String) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.w.V(str);
        return w61.a0.a;
    }
}
