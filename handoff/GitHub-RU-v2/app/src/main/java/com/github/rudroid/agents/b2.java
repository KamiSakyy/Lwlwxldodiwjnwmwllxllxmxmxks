package com.github.rudroid.agents;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class b2 extends androidx.lifecycle.k1 implements com.github.rudroid.viewmodels.v3 {
    public static final a Companion = new a();
    public v71.q1 A;

    /* renamed from: s, reason: collision with root package name */
    public final ui.l f6598s;

    /* renamed from: t, reason: collision with root package name */
    public final ui.h f6599t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.a1 f6600u;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f6601v;

    /* renamed from: w, reason: collision with root package name */
    public final y71.y1 f6602w;

    /* renamed from: x, reason: collision with root package name */
    public final y71.i1 f6603x;

    /* renamed from: y, reason: collision with root package name */
    public x01.i f6604y;

    /* renamed from: z, reason: collision with root package name */
    public final v71.q1 f6605z;

    public static final class a {
    }

    public b2(ui.l lVar, ui.h hVar, androidx.lifecycle.a1 a1Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(lVar, "observeRepositorySubagentsUseCase");
        k71.k.g(hVar, "loadRepositorySubagentsUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(cVar, "accountHolder");
        this.f6598s = lVar;
        this.f6599t = hVar;
        this.f6600u = a1Var;
        this.f6601v = cVar;
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y71.y1 c10 = y71.n1.c(new com.github.rudroid.utilities.ui.u0(x61.r.r));
        this.f6602w = c10;
        this.f6603x = com.github.rudroid.utilities.w0.f(c10, androidx.lifecycle.d1.k(this), new a2(this, 0));
        this.f6604y = new x01.i((String) null, false, true);
        v71.q1 q1Var = this.f6605z;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        v71.q1 q1Var2 = this.A;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.f6605z = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new e2(this, null), 3);
    }

    public final void D() {
        v71.q1 q1Var = this.A;
        if (q1Var == null || !q1Var.f()) {
            this.A = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h2(this, null), 3);
        }
    }

    public final boolean a() {
        return com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) this.f6602w.getValue()) && this.f6604y.a();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0<T1,T2,T3,T4> {
        public a0() {
        }
    }
}
