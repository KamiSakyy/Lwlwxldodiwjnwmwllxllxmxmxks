package com.github.rudroid.discussions;

import com.github.rudroid.utilities.ui.g1;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class ta extends androidx.lifecycle.k1 implements com.github.rudroid.viewmodels.v3, com.github.rudroid.utilities.viewmodel.b {
    public v71.q1 A;
    public v71.q1 B;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f11829s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f11830t;

    /* renamed from: u, reason: collision with root package name */
    public ik.g0 f11831u;

    /* renamed from: v, reason: collision with root package name */
    public ik.z f11832v;

    /* renamed from: w, reason: collision with root package name */
    public ik.i0 f11833w;

    /* renamed from: x, reason: collision with root package name */
    public y71.y1 f11834x;

    /* renamed from: y, reason: collision with root package name */
    public x01.i f11835y;

    /* renamed from: z, reason: collision with root package name */
    public String f11836z;

    public ta(com.github.rudroid.activities.util.c cVar, ik.g0 g0Var, ik.z zVar, ik.i0 i0Var, androidx.lifecycle.a1 a1Var, oa.m mVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(g0Var, "observeSearchDiscussionsUseCase");
        k71.k.g(zVar, "loadSearchDiscussionPageUseCase");
        k71.k.g(i0Var, "refreshSearchDiscussionsUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(mVar, "userManager");
        this.f11829s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f11830t = cVar;
        this.f11831u = g0Var;
        this.f11832v = zVar;
        this.f11833w = i0Var;
        this.f11834x = y71.n1Shadow.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        x01.i.Companion.getClass();
        this.f11835y = x01.i.d;
    }

    public final void D() {
        v71.q1 q1Var = this.B;
        if (q1Var == null || !q1Var.f()) {
            String str = this.f11836z;
            this.B = str != null ? v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new ma(this, str, null), 3) : null;
        }
    }

    public final void P() {
        v71.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        String str = this.f11836z;
        this.A = str != null ? v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new sa(this, str, null), 3) : null;
    }

    public final void Q(String str) {
        k71.k.g(str, "query");
        if (k71.k.b(this.f11836z, str)) {
            return;
        }
        v71.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.f11836z = str;
        com.github.rudroid.utilities.w0.n(this.f11834x);
        P();
    }

    public final void R(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f11829s.a(g1Var, bVar, z10);
    }

    public final boolean a() {
        return this.f11835y.a() && com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) this.f11834x.getValue());
    }
}
