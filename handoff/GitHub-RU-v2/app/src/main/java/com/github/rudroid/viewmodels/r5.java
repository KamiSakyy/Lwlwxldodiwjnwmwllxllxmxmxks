package com.github.rudroid.viewmodels;

import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r5 extends w3 {
    public v71.q1 A;
    public zk.y0 u;
    public zk.z0 v;
    public zk.x0 w;
    public com.github.rudroid.activities.util.c x;
    public androidx.lifecycle.p0 y;
    public x01.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(zk.y0 y0Var, zk.z0 z0Var, zk.x0 x0Var, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(y0Var, "observerUseCase");
        k71.k.g(z0Var, "refreshUseCase");
        k71.k.g(x0Var, "loadPageUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.u = y0Var;
        this.v = z0Var;
        this.w = x0Var;
        this.x = cVar;
        this.y = new androidx.lifecycle.p0();
        this.z = new x01.i((String) null, false, true);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new n5(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.w3
    public final androidx.lifecycle.l0 P() {
        return this.y;
    }

    @Override // com.github.rudroid.viewmodels.w3
    public final void Q() {
        v71.q1 q1Var = this.A;
        if (q1Var != null && q1Var.f()) {
            this.A = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new q5(this, null), 3);
            return;
        }
        v71.q1 q1Var2 = this.A;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        fl.e eVar = fl.f.Companion;
        androidx.lifecycle.p0 p0Var = this.y;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        v6.a k = androidx.lifecycle.d1.k(this);
        c81.e eVar2 = v71.l0.a;
        v71.b0.z(k, c81.d.t, (v71.a0Shadow) null, new k5(this, null), 2);
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        return this.z;
    }
}
