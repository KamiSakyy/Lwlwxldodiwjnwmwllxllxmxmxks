package wk;

import k71.k;
import um.r;
import y00.l;
import y71.n1;
import z01.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final i a;
    public final j b;
    public final oa.g c;
    public final r d;

    public h(i iVar, j jVar, oa.g gVar, r rVar) {
        k.g(iVar, "refreshMyWorkItemsUseCase");
        k.g(jVar, "refreshUserPinnedItemsUseCase");
        k.g(gVar, "homeService");
        k.g(rVar, "shortcutsRepository");
        this.a = iVar;
        this.b = jVar;
        this.c = gVar;
        this.d = rVar;
    }

    public final gl.f a(oa.j jVar, j71.c cVar) {
        k.g(jVar, "user");
        y71.i a = ((a0) this.c.a(jVar)).a();
        j jVar2 = this.b;
        jVar2.getClass();
        l lVar = new l(b31.b.J(jVar2.a.a(jVar), jVar, cVar), 8);
        i iVar = this.a;
        iVar.getClass();
        return in.r.l(b31.b.J(n1.m(a, lVar, new l(b31.b.J(iVar.a.b(jVar), jVar, cVar), 8), this.d.d(jVar), new g(5, null)), jVar, cVar));
    }
}
