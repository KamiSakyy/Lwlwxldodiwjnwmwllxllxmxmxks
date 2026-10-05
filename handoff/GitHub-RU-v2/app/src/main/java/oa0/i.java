package oa0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = sy.d0.n("linkedIssuesOrPullRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(j.a, true))).a(eVar, wVar);
        }
        return new na0.n(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.n nVar = (na0.n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("linkedIssuesOrPullRequests");
        aa.c.b(aa.c.a(aa.c.c(j.a, true))).b(fVar, wVar, nVar.a);
    }
}
