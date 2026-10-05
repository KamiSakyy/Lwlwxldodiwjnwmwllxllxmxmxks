package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.SavedRepliesViewModel$loadNextPage$1$2", f = "SavedRepliesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o7 extends c71.j implements j71.e {
    public final /* synthetic */ k7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(k7 k7Var, a71.c cVar) {
        super(2, cVar);
        this.v = k7Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o7(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        o7 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y71.y1 y1Var = this.v.v;
        com.github.rudroid.m0.u(fl.f.Companion, ((fl.f) y1Var.getValue()).b, y1Var, (Object) null);
        return w61.a0.a;
    }
}
