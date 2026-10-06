package com.github.rudroid.viewmodels;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sa extends w3 {
    public lm.j u;
    public com.github.rudroid.activities.util.c v;
    public androidx.lifecycle.p0 w;
    public x01.i x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(lm.j jVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(jVar, "fetchUsersUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.u = jVar;
        this.v = cVar;
        this.w = new androidx.lifecycle.p0();
        this.x = new x01.i((String) null, false, true);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.b0.j(androidx.lifecycle.d1.k(this).r);
        fl.e eVar = fl.f.Companion;
        androidx.lifecycle.p0 p0Var = this.w;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new ra(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.w3
    public final androidx.lifecycle.l0 P() {
        return this.w;
    }

    @Override // com.github.rudroid.viewmodels.w3
    public final void Q() {
        v71.b0.j(androidx.lifecycle.d1.k(this).r);
        fl.e eVar = fl.f.Companion;
        androidx.lifecycle.p0 p0Var = this.w;
        fl.f fVar = (fl.f) p0Var.d();
        List list = fVar != null ? (List) fVar.b : null;
        eVar.getClass();
        p0Var.j(fl.e.b(list));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new pa(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        return this.x;
    }
}
