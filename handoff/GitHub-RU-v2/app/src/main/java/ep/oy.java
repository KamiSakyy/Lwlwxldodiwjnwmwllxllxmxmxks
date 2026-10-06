package ep;

import java.util.List;
import jo.wd0;
import jo.xd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oy implements aaShadow.a {
    public static final oy a = new oy();
    public static final List b = sy.d0Shadow.n("updateUserDashboardPins");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xd0 xd0Var = null;
        while (eVar.r0(b) == 0) {
            xd0Var = (xd0) aa.c.b(aa.c.c(py.a, false)).a(eVar, wVar);
        }
        return new wd0(xd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wd0 wd0Var = (wd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wd0Var, "value");
        fVar.z0("updateUserDashboardPins");
        aa.c.b(aa.c.c(py.a, false)).b(fVar, wVar, wd0Var.a);
    }
}
