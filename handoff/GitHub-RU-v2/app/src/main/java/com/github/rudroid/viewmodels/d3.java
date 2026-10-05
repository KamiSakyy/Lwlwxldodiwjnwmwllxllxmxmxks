package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.LoginViewModel$fetchAccessToken$1$userVerificationAsync$1", f = "LoginViewModel.kt", l = {146}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ u2 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(u2 u2Var, String str, String str2, a71.c cVar) {
        super(2, cVar);
        this.w = u2Var;
        this.x = str;
        this.y = str2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d3(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return obj;
        }
        sy.y.j(obj);
        z01.x xVar = this.w.t;
        this.v = 1;
        xVar.getClass();
        Object s = i21.a.s(xVar.a, new x01.m(this.x, this.y), this);
        return s == aVar ? aVar : s;
    }
}
