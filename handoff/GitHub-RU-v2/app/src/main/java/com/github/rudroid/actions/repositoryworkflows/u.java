package com.github.rudroid.actions.repositoryworkflows;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.actions.navigation.WorkflowsRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.concurrent.CancellationException;
import v71.a0Shadow;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class u extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public q1 A;
    public q1 B;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f5174s;

    /* renamed from: t, reason: collision with root package name */
    public si.f f5175t;

    /* renamed from: u, reason: collision with root package name */
    public si.h f5176u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f5177v;

    /* renamed from: w, reason: collision with root package name */
    public String f5178w;

    /* renamed from: x, reason: collision with root package name */
    public String f5179x;

    /* renamed from: y, reason: collision with root package name */
    public y1 f5180y;

    /* renamed from: z, reason: collision with root package name */
    public i1 f5181z;

    public u(a1 a1Var, si.f fVar, si.d dVar, si.h hVar, com.github.rudroid.activities.util.c cVar, oa.m mVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(fVar, "observeRepositoryWorkflowsUseCase");
        k71.k.g(dVar, "loadRepositoryWorkflowsPageUseCase");
        k71.k.g(hVar, "refreshRepositoryWorkflowsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        this.f5174s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f5175t = fVar;
        this.f5176u = hVar;
        this.f5177v = cVar;
        WorkflowsRoute workflowsRoute = (WorkflowsRoute) sy.y.m(a1Var, k71.xShadow.a(WorkflowsRoute.class), x61.s.r);
        this.f5178w = workflowsRoute.f5125s;
        this.f5179x = workflowsRoute.f5124r;
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.f5180y = c10;
        this.f5181z = w0.f(c10, d1.k(this), new com.github.rudroid.actions.checklog.t(6));
        q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.A = b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new q(this, null), 3);
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f5174s.a(g1Var, bVar, z10);
    }
}
