package com.github.rudroid.actions.workflowruns;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.actions.navigation.WorkflowRunsRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public String A;
    public String B;
    public y1 C;
    public Object D;
    public boolean E;
    public w61.p F;
    public q1 G;
    public q1 H;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f5433s;

    /* renamed from: t, reason: collision with root package name */
    public si.g f5434t;

    /* renamed from: u, reason: collision with root package name */
    public ml.m f5435u;

    /* renamed from: v, reason: collision with root package name */
    public si.e f5436v;

    /* renamed from: w, reason: collision with root package name */
    public si.i f5437w;

    /* renamed from: x, reason: collision with root package name */
    public ri.a f5438x;

    /* renamed from: y, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f5439y;

    /* renamed from: z, reason: collision with root package name */
    public String f5440z;

    public h0(si.g gVar, ml.m mVar, si.e eVar, si.i iVar, ri.a aVar, com.github.rudroid.activities.util.c cVar, oa.m mVar2, a1 a1Var) {
        k71.k.g(gVar, "observeWorkflowRunsUseCase");
        k71.k.g(mVar, "fetchViewerCanPushToRepoUseCase");
        k71.k.g(eVar, "loadWorkflowRunsPageUseCase");
        k71.k.g(iVar, "refreshWorkflowRunsUseCase");
        k71.k.g(aVar, "cancelCheckSuiteUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar2, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f5433s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar2);
        this.f5434t = gVar;
        this.f5435u = mVar;
        this.f5436v = eVar;
        this.f5437w = iVar;
        this.f5438x = aVar;
        this.f5439y = cVar;
        WorkflowRunsRoute workflowRunsRoute = (WorkflowRunsRoute) sy.y.m(a1Var, k71.xShadow.a(WorkflowRunsRoute.class), x61.s.r);
        this.f5440z = workflowRunsRoute.f5117r;
        this.A = workflowRunsRoute.f5118s;
        this.B = workflowRunsRoute.f5119t;
        g1.a aVar2 = g1.Companion;
        mn.w.Companion.getClass();
        mn.w wVar = mn.w.g;
        aVar2.getClass();
        this.C = n1Shadow.c(new u0(wVar));
        this.D = x61.t.r;
        this.F = sy.w.t(new a0.m0(17, this));
        P();
    }

    public final void P() {
        q1 q1Var = this.G;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.G = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new b0(this, null), 3);
    }

    public final void Q() {
        q1 q1Var = this.G;
        if (q1Var == null || !q1Var.f()) {
            P();
            return;
        }
        q1 q1Var2 = this.H;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.H = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new e0(this, null), 3);
    }

    public final void R(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f5433s.a(g1Var, bVar, z10);
    }
}
