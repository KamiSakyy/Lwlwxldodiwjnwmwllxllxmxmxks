package com.github.rudroid.viewmodels;

import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;

@c71.e(c = "com.github.rudroid.viewmodels.LoginViewModel$createReviewLabUser$1", f = "LoginViewModel.kt", l = {108}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ u2 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(u2 u2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = u2Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v2(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        u2 u2Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            oa.j T = u2Var.T();
            String a = T != null ? u2Var.z.a(T) : null;
            if (T == null || a == null) {
                qe.a aVar2 = u2Var.y;
                com.github.rudroid.common.e.Companion.getClass();
                aVar2.f(e.a.q);
                y71.y1 y1Var = u2Var.F;
                com.github.rudroid.auth.i iVar = com.github.rudroid.auth.i.C;
                k71.k.g(y1Var, "<this>");
                y1Var.k((Object) null, new com.github.rudroid.auth.k(iVar, (ApiFailure) null, (Throwable) null, 6));
                return a0Var;
            }
            String str = T.c;
            this.v = 1;
            if (u2.Q(this.w, str, this.x, "", a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        qe.a aVar3 = u2Var.y;
        com.github.rudroid.common.e.Companion.getClass();
        aVar3.f(e.a.w);
        return a0Var;
    }
}
