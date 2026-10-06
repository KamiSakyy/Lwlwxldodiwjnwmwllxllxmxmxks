package fd0;

import java.util.List;
import kc0.u00;
import kc0.v00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hp implements aaShadow.a {
    public static final hp a = new hp();
    public static final List b = sy.d0.n("setDashboardSearchShortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v00 v00Var = null;
        while (eVar.r0(b) == 0) {
            v00Var = (v00) aa.c.b(aa.c.c(ip.a, false)).a(eVar, wVar);
        }
        return new u00(v00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u00 u00Var = (u00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u00Var, "value");
        fVar.z0("setDashboardSearchShortcuts");
        aa.c.b(aa.c.c(ip.a, false)).b(fVar, wVar, u00Var.a);
    }
}
