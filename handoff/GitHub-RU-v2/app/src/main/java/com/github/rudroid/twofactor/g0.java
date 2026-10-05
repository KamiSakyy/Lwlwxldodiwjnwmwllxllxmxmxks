package com.github.rudroid.twofactor;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import java.util.concurrent.CancellationException;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 extends k1 implements androidx.lifecycle.i {
    public final dn.p s;
    public final dn.z t;
    public final com.github.rudroid.twofactor.missed.d u;
    public final com.github.rudroid.twofactor.missed.g v;
    public final x71.h w;
    public final y71.d x;
    public q1 y;
    public q1 z;

    public g0(dn.p pVar, dn.z zVar, com.github.rudroid.twofactor.missed.d dVar, com.github.rudroid.twofactor.missed.g gVar) {
        k71.k.g(pVar, "fetchAuthRequestsUseCase");
        k71.k.g(zVar, "prepareTwoFactorAuthHandler");
        k71.k.g(dVar, "observeBackgroundTwoFactorRequestsUseCase");
        k71.k.g(gVar, "setBackgroundTwoFactorHandledUseCase");
        this.s = pVar;
        this.t = zVar;
        this.u = dVar;
        this.v = gVar;
        x71.h a = t.e.a(1, 4, x71.a.s);
        this.w = a;
        this.x = new y71.d(a);
    }

    public final void P() {
        q1 q1Var = this.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.y = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new c0(this, null), 3);
    }

    public final void f(androidx.lifecycle.c0 c0Var) {
        k71.k.g(c0Var, "owner");
        q1 q1Var = this.z;
        if (q1Var == null || !q1Var.f()) {
            this.z = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new f0(this, null), 3);
        }
        P();
    }

    public final void r(androidx.lifecycle.c0 c0Var) {
        q1 q1Var = this.z;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
    }
}
