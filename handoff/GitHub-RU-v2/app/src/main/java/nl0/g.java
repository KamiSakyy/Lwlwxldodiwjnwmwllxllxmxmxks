package nl0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0Shadow.n("enqueuePullRequest");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ml0.k kVar = null;
        while (eVar.r0(b) == 0) {
            kVar = (ml0.k) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
        }
        return new ml0.j(kVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ml0.j jVar = (ml0.j) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("enqueuePullRequest");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, jVar.a);
    }
}
