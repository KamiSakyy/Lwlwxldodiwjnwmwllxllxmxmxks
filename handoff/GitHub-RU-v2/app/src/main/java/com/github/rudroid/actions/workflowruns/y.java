package com.github.rudroid.actions.workflowruns;

@c71.e(c = "com.github.rudroid.actions.workflowruns.WorkflowRunsViewModel$observe$1$3", f = "WorkflowRunsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class y extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ mn.w f5500v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f5501w;

    public final Object f(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        y yVar = new y(3, (a71.c) obj3);
        yVar.f5500v = (mn.w) obj;
        yVar.f5501w = booleanValue;
        return yVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        mn.w wVar = this.f5500v;
        boolean z10 = this.f5501w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new w61.k(wVar, Boolean.valueOf(z10));
    }
}
