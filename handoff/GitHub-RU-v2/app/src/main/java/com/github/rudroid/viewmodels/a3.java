package com.github.rudroid.viewmodels;

import com.github.rudroid.common.e;
import java.util.Objects;

@c71.e(c = "com.github.rudroid.viewmodels.LoginViewModel$createUser$fetchCapabilities$1", f = "LoginViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a3 extends c71.j implements j71.f {
    public /* synthetic */ Throwable v;
    public final /* synthetic */ u2 w;
    public final /* synthetic */ oa.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(u2 u2Var, oa.j jVar, a71.c cVar) {
        super(3, cVar);
        this.w = u2Var;
        this.x = jVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        a3 a3Var = new a3(this.w, this.x, (a71.c) obj3);
        a3Var.v = (Throwable) obj2;
        w61.a0 a0Var = w61.a0.a;
        a3Var.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Throwable th2 = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        Objects.toString(th2);
        u2 u2Var = this.w;
        qe.a aVar2 = u2Var.y;
        com.github.rudroid.common.e.Companion.getClass();
        aVar2.f(e.a.r);
        u2Var.w.k(this.x);
        com.github.rudroid.auth.p.a(u2Var.F, com.github.rudroid.auth.i.z, th2);
        return w61.a0.a;
    }
}
