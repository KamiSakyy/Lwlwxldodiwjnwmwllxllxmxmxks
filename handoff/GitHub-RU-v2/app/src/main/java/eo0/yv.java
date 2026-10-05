package eo0;

import java.util.List;
import jn0.ca0;
import jn0.ea0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yv implements aa.a {
    public static final yv a = new yv();
    public static final List b = sy.d0.n("setDashboardFeedFilters");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ea0 ea0Var = null;
        while (eVar.r0(b) == 0) {
            ea0Var = (ea0) aa.c.b(aa.c.c(aw.a, false)).a(eVar, wVar);
        }
        return new ca0(ea0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ca0 ca0Var = (ca0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ca0Var, "value");
        fVar.z0("setDashboardFeedFilters");
        aa.c.b(aa.c.c(aw.a, false)).b(fVar, wVar, ca0Var.a);
    }
}
