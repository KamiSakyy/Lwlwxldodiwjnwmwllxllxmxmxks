package com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues;

@c71.e(c = "com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.AddExistingSubIssuesViewModel$addSubIssue$1$2", f = "AddExistingSubIssuesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class p0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n0 f15982v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0 n0Var, String str, a71.c cVar) {
        super(2, cVar);
        this.f15982v = n0Var;
        this.f15983w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p0(this.f15982v, this.f15983w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        p0 r10 = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        n0 n0Var = this.f15982v;
        n0Var.A.j((Object) null);
        com.github.rudroid.utilities.w0.o(n0Var.f15974y, this.f15983w);
        return w61.a0.a;
    }
}
