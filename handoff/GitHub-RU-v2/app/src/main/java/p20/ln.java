package p20;

import java.util.List;
import u10.fy;
import u10.jy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ln implements aaShadow.a {
    public static final ln a = new ln();
    public static final List b = sy.d0Shadow.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jy jyVar = null;
        while (eVar.r0(b) == 0) {
            jyVar = (jy) aa.c.c(pn.a, false).a(eVar, wVar);
        }
        if (jyVar != null) {
            return new fy(jyVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fy fyVar = (fy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fyVar, "value");
        fVar.z0("search");
        aa.c.c(pn.a, false).b(fVar, wVar, fyVar.a);
    }
}
