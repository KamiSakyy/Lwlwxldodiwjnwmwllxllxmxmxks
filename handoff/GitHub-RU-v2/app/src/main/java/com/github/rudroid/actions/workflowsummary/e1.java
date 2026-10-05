package com.github.rudroid.actions.workflowsummary;

import com.github.service.models.response.CheckConclusionState;

@c71.e(c = "com.github.rudroid.actions.workflowsummary.WorkflowSummaryViewModel$refreshUntilCancelled$1$3$1", f = "WorkflowSummaryViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class e1 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5548v;

    public final a71.c r(a71.c cVar, Object obj) {
        e1 e1Var = new e1(2, cVar);
        e1Var.f5548v = obj;
        return e1Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (com.github.rudroid.utilities.ui.g1) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) this.f5548v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        mn.g gVar = (mn.g) g1Var.getData();
        return Boolean.valueOf((gVar != null ? gVar.j : null) == CheckConclusionState.CANCELLED);
    }
}
