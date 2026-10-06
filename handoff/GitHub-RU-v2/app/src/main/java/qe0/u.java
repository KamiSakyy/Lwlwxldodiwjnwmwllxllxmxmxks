package qe0;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u implements aa.a {
    public static final List a = d0.n("repository");

    public static g c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l lVar = null;
        while (eVar.r0(a) == 0) {
            lVar = (l) aa.c.c(z.a, false).a(eVar, wVar);
        }
        if (lVar != null) {
            return new g(lVar);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("repository");
        aa.c.c(z.a, false).b(fVar, wVar, gVar.a);
    }
}
