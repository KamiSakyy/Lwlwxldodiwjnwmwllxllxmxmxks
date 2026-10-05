package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$clearRecentSearches$1", f = "GlobalSearchViewModel.kt", l = {130, 131}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y0 extends c71.j implements j71.e {
    public androidx.lifecycle.p0 v;
    public fl.e w;
    public int x;
    public final /* synthetic */ g1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.y = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y0(this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r8 == r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        androidx.lifecycle.p0 p0Var;
        fl.e eVar;
        b71.a aVar = b71.a.r;
        int i = this.x;
        w61.a0 a0Var = w61.a0.a;
        g1 g1Var = this.y;
        if (i == 0) {
            sy.y.j(obj);
            ck.b S = g1Var.S();
            this.x = 1;
            Object M = m71.a.M(this, ((ck.f) S).a, false, true, new cd0.a(22));
            if (M != aVar) {
                M = a0Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = this.w;
                p0Var = this.v;
                sy.y.j(obj);
                eVar.getClass();
                p0Var.k(fl.e.c(obj));
                return a0Var;
            }
            sy.y.j(obj);
        }
        p0Var = g1Var.x;
        fl.e eVar2 = fl.f.Companion;
        this.v = p0Var;
        this.w = eVar2;
        this.x = 2;
        Object P = g1.P(g1Var, this);
        if (P != aVar) {
            eVar = eVar2;
            obj = P;
            eVar.getClass();
            p0Var.k(fl.e.c(obj));
            return a0Var;
        }
        return aVar;
    }
}
