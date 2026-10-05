package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fi implements aa.a {
    public static final fi a = new fi();
    public static final List b = sy.d0.n("removeDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.oq oqVar = null;
        while (eVar.r0(b) == 0) {
            oqVar = (u10.oq) aa.c.b(aa.c.c(gi.a, false)).a(eVar, wVar);
        }
        return new u10.nq(oqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.nq nqVar = (u10.nq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nqVar, "value");
        fVar.z0("removeDashboardSearchShortcut");
        aa.c.b(aa.c.c(gi.a, false)).b(fVar, wVar, nqVar.a);
    }
}
