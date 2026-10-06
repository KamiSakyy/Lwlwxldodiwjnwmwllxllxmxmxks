package ep;

import java.util.List;
import jo.xg0;
import jo.zg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r00 implements aaShadow.a {
    public static final r00 a = new r00();
    public static final List b = sy.d0Shadow.n("updateUserDashboardNavLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zg0 zg0Var = null;
        while (eVar.r0(b) == 0) {
            zg0Var = (zg0) aa.c.b(aa.c.c(t00.a, false)).a(eVar, wVar);
        }
        return new xg0(zg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xg0 xg0Var = (xg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xg0Var, "value");
        fVar.z0("updateUserDashboardNavLinks");
        aa.c.b(aa.c.c(t00.a, false)).b(fVar, wVar, xg0Var.a);
    }
}
