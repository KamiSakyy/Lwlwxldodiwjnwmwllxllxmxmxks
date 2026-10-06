package eo0;

import java.util.List;
import jn0.ud0;
import jn0.wd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ny implements aaShadow.a {
    public static final ny a = new ny();
    public static final List b = sy.d0Shadow.n("updateDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wd0 wd0Var = null;
        while (eVar.r0(b) == 0) {
            wd0Var = (wd0) aa.c.b(aa.c.c(py.a, false)).a(eVar, wVar);
        }
        return new ud0(wd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ud0 ud0Var = (ud0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ud0Var, "value");
        fVar.z0("updateDashboardSearchShortcut");
        aa.c.b(aa.c.c(py.a, false)).b(fVar, wVar, ud0Var.a);
    }
}
