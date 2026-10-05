package com.github.rudroid.viewmodels.notifications;

/* loaded from: /home/user/work/p/classes3.dex */
final class q<T> implements y71.j {
    public final /* synthetic */ s r;

    public q(s sVar) {
        this.r = sVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        oa.j jVar = (oa.j) obj;
        s sVar = this.r;
        v71.q1 q1Var = sVar.k0;
        if (q1Var == null || !q1Var.f()) {
            sVar.k0 = th.a.a(sVar, null, sVar.P, new g1(sVar, null), 27);
        }
        sVar.V();
        sVar.g0 = false;
        sVar.h0 = true;
        sVar.i0 = true;
        sVar.X.j(sVar.W.a(jVar));
        sVar.X(false);
        Object Q = s.Q(sVar, jVar, cVar);
        return Q == b71.a.r ? Q : w61.a0.a;
    }
}
