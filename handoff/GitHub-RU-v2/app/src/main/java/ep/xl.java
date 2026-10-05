package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xl implements aa.a {
    public static final xl a = new xl();
    public static final List b = sy.d0.n("removeDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.sv svVar = null;
        while (eVar.r0(b) == 0) {
            svVar = (jo.sv) aa.c.b(aa.c.c(yl.a, false)).a(eVar, wVar);
        }
        return new jo.rv(svVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rv rvVar = (jo.rv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rvVar, "value");
        fVar.z0("removeDashboardSearchShortcut");
        aa.c.b(aa.c.c(yl.a, false)).b(fVar, wVar, rvVar.a);
    }
}
