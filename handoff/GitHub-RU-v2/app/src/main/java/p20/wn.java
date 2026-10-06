package p20;

import java.util.List;
import u10.wy;
import u10.xy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wn implements aaShadow.a {
    public static final wn a = new wn();
    public static final List b = sy.d0Shadow.n("setDashboardSearchShortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xy xyVar = null;
        while (eVar.r0(b) == 0) {
            xyVar = (xy) aa.c.b(aa.c.c(xn.a, false)).a(eVar, wVar);
        }
        return new wy(xyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wy wyVar = (wy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wyVar, "value");
        fVar.z0("setDashboardSearchShortcuts");
        aa.c.b(aa.c.c(xn.a, false)).b(fVar, wVar, wyVar.a);
    }
}
