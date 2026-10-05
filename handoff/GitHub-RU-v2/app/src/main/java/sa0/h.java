package sa0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.n("list");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ra0.q qVar = null;
        while (eVar.r0(b) == 0) {
            qVar = (ra0.q) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
        }
        return new ra0.o(qVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ra0.o oVar = (ra0.o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("list");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, oVar.a);
    }
}
