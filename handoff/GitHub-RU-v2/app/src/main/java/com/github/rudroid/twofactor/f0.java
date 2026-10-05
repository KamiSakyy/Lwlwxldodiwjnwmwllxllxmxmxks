package com.github.rudroid.twofactor;

import com.google.android.gms.internal.measurement.z3;

@c71.e(c = "com.github.rudroid.twofactor.TwoFactorRequestCheckViewModel$observeTwoFactorEventsDirectly$1", f = "TwoFactorRequestCheckViewModel.kt", l = {56}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, a71.c cVar) {
        super(2, cVar);
        this.w = g0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g0 g0Var = this.w;
            com.github.rudroid.twofactor.missed.d dVar = g0Var.u;
            a61.l0 G = z3.G(dVar.a.getData(), new com.github.rudroid.support.u(2, dVar));
            e0 e0Var = new e0(g0Var);
            this.v = 1;
            if (G.b(e0Var, this) == aVar) {
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
