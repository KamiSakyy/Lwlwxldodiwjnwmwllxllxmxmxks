package com.github.rudroid.actions.workflowruns;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.r0;
import java.util.Set;
import y71.y1;

@c71.e(c = "com.github.rudroid.actions.workflowruns.WorkflowRunsViewModel$cancelCheckSuite$1$2", f = "WorkflowRunsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
class s extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h0 f5450v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f5451w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ mn.w f5452x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h0 h0Var, String str, mn.w wVar, a71.c cVar) {
        super(2, cVar);
        this.f5450v = h0Var;
        this.f5451w = str;
        this.f5452x = wVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.f5450v, this.f5451w, this.f5452x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        s r10 = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        h0 h0Var = this.f5450v;
        h0Var.D = sy.f0.n((Set) h0Var.D, this.f5451w);
        y1 y1Var = h0Var.C;
        g1.Companion.getClass();
        r0 r0Var = new r0(this.f5452x);
        y1Var.getClass();
        y1Var.k((Object) null, r0Var);
        return w61.a0.a;
    }
}
