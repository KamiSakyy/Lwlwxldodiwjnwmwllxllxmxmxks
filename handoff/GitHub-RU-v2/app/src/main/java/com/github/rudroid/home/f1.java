package com.github.rudroid.home;

@c71.e(c = "com.github.rudroid.home.HomeViewModel$observeHomeData$1$cachedDataFlow$3", f = "HomeViewModel.kt", l = {180}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class f1 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f14934v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14935w;

    public final a71.c r(a71.c cVar, Object obj) {
        f1 f1Var = new f1(2, cVar);
        f1Var.f14935w = obj;
        return f1Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        y71.j jVar = (y71.j) this.f14935w;
        b71.a aVar = b71.a.r;
        int i = this.f14934v;
        if (i == 0) {
            sy.y.j(obj);
            fl.f.Companion.getClass();
            fl.f b10 = fl.e.b((Object) null);
            this.f14935w = null;
            this.f14934v = 1;
            if (jVar.c(b10, this) == aVar) {
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
