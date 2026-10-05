package p20;

import java.util.List;
import u10.u70;
import u10.w70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cu implements aa.a {
    public static final cu a = new cu();
    public static final List b = sy.d0.n("updateDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w70 w70Var = null;
        while (eVar.r0(b) == 0) {
            w70Var = (w70) aa.c.b(aa.c.c(eu.a, false)).a(eVar, wVar);
        }
        return new u70(w70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u70 u70Var = (u70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u70Var, "value");
        fVar.z0("updateDashboardSearchShortcut");
        aa.c.b(aa.c.c(eu.a, false)).b(fVar, wVar, u70Var.a);
    }
}
