package com.github.rudroid.actions.workflowruns.dispatchworkflow;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public final String A;
    public final y1 B;
    public final i1 C;
    public q1 D;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f5369s;

    /* renamed from: t, reason: collision with root package name */
    public final si.b f5370t;

    /* renamed from: u, reason: collision with root package name */
    public final nl.j f5371u;

    /* renamed from: v, reason: collision with root package name */
    public final si.a f5372v;

    /* renamed from: w, reason: collision with root package name */
    public final si.c f5373w;

    /* renamed from: x, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f5374x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5375y;

    /* renamed from: z, reason: collision with root package name */
    public final String f5376z;

    public i0(si.b bVar, nl.j jVar, si.a aVar, si.c cVar, com.github.rudroid.activities.util.c cVar2, oa.m mVar, a1 a1Var) {
        k71.k.g(bVar, "fetchDefaultWorkflowInputsUseCase");
        k71.k.g(jVar, "fetchRepositoryDefaultBranchUseCase");
        k71.k.g(aVar, "dispatchWorkflowRunUseCase");
        k71.k.g(cVar, "fetchWorkflowInputsAndHasManualTriggerUseCase");
        k71.k.g(cVar2, "accountHolder");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f5369s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f5370t = bVar;
        this.f5371u = jVar;
        this.f5372v = aVar;
        this.f5373w = cVar;
        this.f5374x = cVar2;
        this.f5375y = (String) h2.a(a1Var, "EXTRA_WORKFLOW_ID");
        this.f5376z = (String) h2.a(a1Var, "EXTRA_REPO_OWNER");
        this.A = (String) h2.a(a1Var, "EXTRA_REPO_NAME");
        y1 c10 = n1.c(g1.a.c(g1.Companion));
        this.B = c10;
        this.C = new i1(c10);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new f0(this, null), 3);
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f5369s.a(g1Var, bVar, z10);
    }
}
