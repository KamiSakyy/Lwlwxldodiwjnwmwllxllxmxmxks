package fd0;

import java.util.List;
import kc0.u90;
import kc0.w90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ov implements aa.a {
    public static final ov a = new ov();
    public static final List b = sy.d0.n("updateDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w90 w90Var = null;
        while (eVar.r0(b) == 0) {
            w90Var = (w90) aa.c.b(aa.c.c(qv.a, false)).a(eVar, wVar);
        }
        return new u90(w90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u90 u90Var = (u90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u90Var, "value");
        fVar.z0("updateDashboardSearchShortcut");
        aa.c.b(aa.c.c(qv.a, false)).b(fVar, wVar, u90Var.a);
    }
}
