package com.github.rudroid.viewmodels;

import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 extends w3 {
    public static final a Companion = new a();
    public lm.l u;
    public com.github.rudroid.activities.util.c v;
    public androidx.lifecycle.p0 w;
    public x01.i x;
    public v71.q1 y;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(lm.l lVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(lVar, "searchOrganizationsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.u = lVar;
        this.v = cVar;
        this.w = new androidx.lifecycle.p0();
        this.x = new x01.i((String) null, false, true);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        fl.e eVar = fl.f.Companion;
        androidx.lifecycle.p0 p0Var = this.w;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        v71.q1 q1Var = this.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.y = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new p3(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.w3
    public final androidx.lifecycle.l0 P() {
        return this.w;
    }

    @Override // com.github.rudroid.viewmodels.w3
    public final void Q() {
        fl.e eVar = fl.f.Companion;
        androidx.lifecycle.p0 p0Var = this.w;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        v71.q1 q1Var = this.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.y = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new n3(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        return this.x;
    }
}
