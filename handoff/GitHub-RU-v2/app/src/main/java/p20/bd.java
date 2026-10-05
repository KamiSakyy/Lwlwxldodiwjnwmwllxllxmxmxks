package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bd implements aa.a {
    public static final bd a = new bd();
    public static final List b = sy.d0.n("mergePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.tj tjVar = null;
        while (eVar.r0(b) == 0) {
            tjVar = (u10.tj) aa.c.b(aa.c.c(dd.a, false)).a(eVar, wVar);
        }
        return new u10.rj(tjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.rj rjVar = (u10.rj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rjVar, "value");
        fVar.z0("mergePullRequest");
        aa.c.b(aa.c.c(dd.a, false)).b(fVar, wVar, rjVar.a);
    }
}
