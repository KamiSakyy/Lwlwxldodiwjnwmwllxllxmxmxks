package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$offlineSearch$1", f = "GlobalSearchViewModel.kt", l = {83}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b1 extends c71.j implements j71.e {
    public androidx.lifecycle.p0 v;
    public fl.e w;
    public int x;
    public final /* synthetic */ g1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.y = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b1(this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        androidx.lifecycle.p0 p0Var;
        fl.e eVar;
        b71.a aVar = b71.a.r;
        int i = this.x;
        if (i == 0) {
            sy.y.j(obj);
            g1 g1Var = this.y;
            p0Var = g1Var.x;
            fl.e eVar2 = fl.f.Companion;
            this.v = p0Var;
            this.w = eVar2;
            this.x = 1;
            obj = g1.P(g1Var, this);
            if (obj == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.w;
            p0Var = this.v;
            sy.y.j(obj);
        }
        eVar.getClass();
        p0Var.k(fl.e.c(obj));
        return w61.a0.a;
    }
}
