package com.github.rudroid.starredreposandlists.createoreditlist;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListViewModel$saveList$1", f = "CreateNewListViewModel.kt", l = {59}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, String str, String str2, a71.c cVar) {
        super(2, cVar);
        this.w = rVar;
        this.x = str;
        this.y = str2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            r rVar = this.w;
            ym.a aVar2 = rVar.t;
            com.github.rudroid.activities.util.c cVar = rVar.v;
            oa.j d = cVar.d();
            String str = cVar.d().c;
            l lVar = new l(0, rVar);
            aVar2.getClass();
            String str2 = this.x;
            k71.k.g(str2, "title");
            String str3 = this.y;
            k71.k.g(str3, "description");
            k71.k.g(str, "login");
            y71.y yVar = new y71.y(new n(rVar, null), b31.b.J(((z01.j0) aVar2.a.a(d)).e(str2, str3, str), d, lVar));
            o oVar = new o(rVar);
            this.v = 1;
            if (yVar.b(oVar, this) == aVar) {
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
