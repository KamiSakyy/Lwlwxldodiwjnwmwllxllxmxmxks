package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestAliveUseCase$collectAndUpdate$2", f = "IssueOrPullRequestAliveUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public final /* synthetic */ j71.c A;
    public final /* synthetic */ j71.a v;
    public final /* synthetic */ e w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j71.a aVar, e eVar, String str, String str2, int i, j71.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.v = aVar;
        this.w = eVar;
        this.x = str;
        this.y = str2;
        this.z = i;
        this.A = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.v, this.w, this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (qn.c) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        e eVar = this.w;
        com.github.rudroid.activities.util.c cVar = eVar.e;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        boolean booleanValue = ((Boolean) this.v.a()).booleanValue();
        j71.c cVar2 = this.A;
        String str = this.y;
        String str2 = this.x;
        if (booleanValue) {
            return eVar.d.a(cVar.d(), str2, str, this.z, cVar2);
        }
        zk.j0 j0Var = eVar.c;
        oa.j d = cVar.d();
        j0Var.getClass();
        cn.g gVar = j0Var.a;
        gVar.getClass();
        z01.f0 f0Var = (z01.f0) gVar.a.a(d);
        int i = this.z;
        return new c(new y71.i[]{b31.b.J(in.r.l(new y71.y(f0Var.l(str2, i, str), new cn.b(gVar, d, str2, str, i, null, 0), 6)), d, cVar2), eVar.d.a(cVar.d(), str2, str, this.z, cVar2)});
    }
}
