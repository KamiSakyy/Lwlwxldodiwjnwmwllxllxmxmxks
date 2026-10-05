package p20;

import java.util.List;
import u10.jx;
import u10.nx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wm implements aa.a {
    public static final wm a = new wm();
    public static final List b = sy.d0.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        nx nxVar = null;
        while (eVar.r0(b) == 0) {
            nxVar = (nx) aa.c.c(an.a, false).a(eVar, wVar);
        }
        if (nxVar != null) {
            return new jx(nxVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jx jxVar = (jx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jxVar, "value");
        fVar.z0("search");
        aa.c.c(an.a, false).b(fVar, wVar, jxVar.a);
    }
}
