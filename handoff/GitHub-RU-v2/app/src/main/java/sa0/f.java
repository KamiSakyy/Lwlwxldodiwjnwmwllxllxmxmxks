package sa0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0Shadow.n("list");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ra0.l lVar = null;
        while (eVar.r0(b) == 0) {
            lVar = (ra0.l) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
        }
        return new ra0.k(lVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ra0.k kVar = (ra0.k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("list");
        aa.c.b(aa.c.c(g.a, false)).b(fVar, wVar, kVar.a);
    }
}
