package com.github.rudroid.actions.workflowruns;

import com.github.service.models.response.CheckConclusionState;
import java.util.Set;

@c71.e(c = "com.github.rudroid.actions.workflowruns.WorkflowRunsViewModel$observe$1$4", f = "WorkflowRunsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class z extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5502v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f5503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h0 h0Var, a71.c cVar) {
        super(2, cVar);
        this.f5503w = h0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        z zVar = new z(this.f5503w, cVar);
        zVar.f5502v = obj;
        return zVar;
    }

    public final Object s(Object obj, Object obj2) {
        z r10 = r((a71.c) obj2, (w61.k) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable, java.lang.Object] */
    public final Object v(Object obj) {
        w61.k kVar = (w61.k) this.f5502v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        for (mn.u uVar : ((mn.w) kVar.r).d) {
            h0 h0Var = this.f5503w;
            if (h0Var.D.contains(uVar.g.a)) {
                mn.s sVar = uVar.g;
                if (sVar.e == CheckConclusionState.CANCELLED) {
                    h0Var.D = sy.f0.k((Set) h0Var.D, sVar.a);
                }
            }
        }
        return w61.a0.a;
    }
}
