package ep;

import java.util.List;
import jo.qc0;
import jo.sc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tx implements aa.a {
    public static final tx a = new tx();
    public static final List b = sy.d0.n("setDashboardFeedFilters");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        sc0 sc0Var = null;
        while (eVar.r0(b) == 0) {
            sc0Var = (sc0) aa.c.b(aa.c.c(vx.a, false)).a(eVar, wVar);
        }
        return new qc0(sc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qc0 qc0Var = (qc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qc0Var, "value");
        fVar.z0("setDashboardFeedFilters");
        aa.c.b(aa.c.c(vx.a, false)).b(fVar, wVar, qc0Var.a);
    }
}
