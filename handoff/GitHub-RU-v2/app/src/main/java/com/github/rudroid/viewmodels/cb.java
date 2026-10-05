package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.UsersViewModel$loadNextPage$1$2", f = "UsersViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class cb extends c71.j implements j71.e {
    public final /* synthetic */ za v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(za zaVar, a71.c cVar) {
        super(2, cVar);
        this.v = zaVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new cb(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        cb r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        com.github.rudroid.utilities.w0.g(this.v.v);
        return w61.a0.a;
    }
}
