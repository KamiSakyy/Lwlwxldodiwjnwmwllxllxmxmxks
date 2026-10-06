package ep;

import java.util.List;
import jo.j60;
import jo.k60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ot implements aaShadow.a {
    public static final ot a = new ot();
    public static final List b = sy.d0Shadow.n("setDashboardSearchShortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k60 k60Var = null;
        while (eVar.r0(b) == 0) {
            k60Var = (k60) aa.c.b(aa.c.c(pt.a, false)).a(eVar, wVar);
        }
        return new j60(k60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j60 j60Var = (j60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j60Var, "value");
        fVar.z0("setDashboardSearchShortcuts");
        aa.c.b(aa.c.c(pt.a, false)).b(fVar, wVar, j60Var.a);
    }
}
