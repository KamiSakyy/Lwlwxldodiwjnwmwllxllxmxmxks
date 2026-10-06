package hy0;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f implements aa.a {
    public static final List a = d0Shadow.n("projectV2");

    public static gy0.g c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gy0.h hVar = null;
        while (eVar.r0(a) == 0) {
            hVar = (gy0.h) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
        }
        return new gy0.g(hVar);
    }

    public static void d(ea.f fVar, aa.w wVar, gy0.g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("projectV2");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, gVar.a);
    }
}
