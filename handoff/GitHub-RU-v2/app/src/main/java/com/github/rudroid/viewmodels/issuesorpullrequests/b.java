package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestAliveUseCase$collectAndUpdate$2$invokeSuspend$$inlined$combine$1$3", f = "IssueOrPullRequestAliveUseCase.kt", l = {234}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
public class b extends c71.j implements j71.f {
    public int v;
    public /* synthetic */ y71.j w;
    public /* synthetic */ Object[] x;

    public final Object f(Object obj, Object obj2, Object obj3) {
        b bVar = new b(3, (a71.c) obj3);
        bVar.w = (y71.j) obj;
        bVar.x = (Object[]) obj2;
        return bVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        y71.j jVar = this.w;
        this.w = null;
        this.x = null;
        this.v = 1;
        return jVar.c(a0Var, this) == aVar ? aVar : a0Var;
    }
}
