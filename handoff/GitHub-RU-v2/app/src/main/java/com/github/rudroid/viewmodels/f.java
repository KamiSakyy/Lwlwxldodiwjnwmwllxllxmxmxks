package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.CommitSuggestionViewModel$commitSuggestion$1", f = "CommitSuggestionViewModel.kt", l = {48}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public int v;
    public final /* synthetic */ g w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, String str3, String str4, String str5, a71.c cVar) {
        super(2, cVar);
        this.w = gVar;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = str4;
        this.B = str5;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f(this.w, this.x, this.y, this.z, this.A, this.B, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g gVar = this.w;
            kj.k kVar = gVar.s;
            oa.j d = gVar.t.d();
            com.github.rudroid.support.u uVar = new com.github.rudroid.support.u(8, gVar);
            kVar.getClass();
            String str = this.x;
            k71.k.g(str, "pullRequestId");
            String str2 = this.y;
            k71.k.g(str2, "headRefOid");
            String str3 = this.z;
            k71.k.g(str3, "commentId");
            String str4 = this.A;
            k71.k.g(str4, "suggestionId");
            y71.y yVar = new y71.y(new d(gVar, null), b31.b.J(((z01.f) kVar.a.a(d)).l(str, str2, sy.d0Shadow.n(new w61.k(str3, str4)), this.B), d, uVar));
            e eVar = new e(gVar);
            this.v = 1;
            if (yVar.b(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
