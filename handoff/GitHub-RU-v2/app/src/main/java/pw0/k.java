package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0Shadow.n("linkedIssuesOrPullRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(l.a, true))).a(eVar, wVar);
        }
        return new ow0.r(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.r rVar = (ow0.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("linkedIssuesOrPullRequests");
        aa.c.b(aa.c.a(aa.c.c(l.a, true))).b(fVar, wVar, rVar.a);
    }
}
