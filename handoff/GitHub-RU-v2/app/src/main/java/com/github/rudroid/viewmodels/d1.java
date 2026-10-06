package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$saveRecentSearch$1", f = "GlobalSearchViewModel.kt", l = {122}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.w = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d1(this.w, cVar);
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
        g1 g1Var = this.w;
        if (!t71.p.T(g1Var.w)) {
            ck.b S = g1Var.S();
            String str = g1Var.w;
            this.v = 1;
            S.getClass();
            ck.f fVar = (ck.f) S;
            Object M = m71.a.M(this, fVar.a, false, true, new ck.c(fVar, new ck.h(str), 1));
            if (M != aVar) {
                M = a0Var;
            }
            if (M != aVar) {
                M = a0Var;
            }
            if (M == aVar) {
                return aVar;
            }
        }
        return a0Var;
    }
    public v6 k(Object p1) { return null; }
}
