package com.github.rudroid.viewmodels;

import java.util.Set;

@c71.e(c = "com.github.rudroid.viewmodels.LoginViewModel$createUser$2", f = "LoginViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x2 extends c71.j implements j71.f {
    public /* synthetic */ yz0.c8 v;
    public /* synthetic */ Set w;

    public final Object f(Object obj, Object obj2, Object obj3) {
        x2 x2Var = new x2(3, (a71.c) obj3);
        x2Var.v = (yz0.c8) obj;
        x2Var.w = (Set) obj2;
        return x2Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        yz0.c8 c8Var = this.v;
        Set set = this.w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new w61.k(c8Var, set);
    }
}
