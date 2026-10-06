package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = sy.d0Shadow.n("linkIssueOrPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ow0.r rVar = null;
        while (eVar.r0(b) == 0) {
            rVar = (ow0.r) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
        }
        return new ow0.q(rVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.q qVar = (ow0.q) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("linkIssueOrPullRequest");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, qVar.a);
    }
}
