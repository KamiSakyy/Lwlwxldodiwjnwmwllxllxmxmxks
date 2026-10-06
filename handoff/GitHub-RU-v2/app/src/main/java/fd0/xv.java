package fd0;

import java.util.List;
import kc0.ja0;
import kc0.la0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xv implements aaShadow.a {
    public static final xv a = new xv();
    public static final List b = sy.d0Shadow.n("updateUserDashboardNavLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        la0 la0Var = null;
        while (eVar.r0(b) == 0) {
            la0Var = (la0) aa.c.b(aa.c.c(zv.a, false)).a(eVar, wVar);
        }
        return new ja0(la0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ja0 ja0Var = (ja0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ja0Var, "value");
        fVar.z0("updateUserDashboardNavLinks");
        aa.c.b(aa.c.c(zv.a, false)).b(fVar, wVar, ja0Var.a);
    }
}
