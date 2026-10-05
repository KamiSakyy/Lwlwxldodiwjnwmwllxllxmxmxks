package e00;

import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = d0.n("projectV2");

    public static d00.g c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d00.h hVar = null;
        while (eVar.r0(a) == 0) {
            hVar = (d00.h) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
        }
        return new d00.g(hVar);
    }

    public static void d(ea.f fVar, aa.w wVar, d00.g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("projectV2");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, gVar.a);
    }
}
