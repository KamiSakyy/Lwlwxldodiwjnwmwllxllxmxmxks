package p20;

import java.util.List;
import u10.j80;
import u10.l80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lu implements aaShadow.a {
    public static final lu a = new lu();
    public static final List b = sy.d0Shadow.n("updateUserDashboardNavLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l80 l80Var = null;
        while (eVar.r0(b) == 0) {
            l80Var = (l80) aa.c.b(aa.c.c(nu.a, false)).a(eVar, wVar);
        }
        return new j80(l80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j80 j80Var = (j80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j80Var, "value");
        fVar.z0("updateUserDashboardNavLinks");
        aa.c.b(aa.c.c(nu.a, false)).b(fVar, wVar, j80Var.a);
    }
}
