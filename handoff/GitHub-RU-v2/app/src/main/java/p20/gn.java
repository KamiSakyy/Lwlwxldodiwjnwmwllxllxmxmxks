package p20;

import java.util.List;
import u10.cy;
import u10.xx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gn implements aa.a {
    public static final gn a = new gn();
    public static final List b = sy.d0.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        cy cyVar = null;
        while (eVar.r0(b) == 0) {
            cyVar = (cy) aa.c.c(kn.a, false).a(eVar, wVar);
        }
        if (cyVar != null) {
            return new xx(cyVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xx xxVar = (xx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xxVar, "value");
        fVar.z0("search");
        aa.c.c(kn.a, false).b(fVar, wVar, xxVar.a);
    }
}
