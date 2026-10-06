package el0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = sy.d0Shadow.n("linkIssueOrPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dl0.n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (dl0.n) aa.c.b(aa.c.c(i.a, false)).a(eVar, wVar);
        }
        return new dl0.m(nVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dl0.m mVar = (dl0.m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("linkIssueOrPullRequest");
        aa.c.b(aa.c.c(i.a, false)).b(fVar, wVar, mVar.a);
    }
}
