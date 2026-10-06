package eo0;

import java.util.List;
import jn0.j40;
import jn0.k40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cs implements aaShadow.a {
    public static final cs a = new cs();
    public static final List b = sy.d0Shadow.n("setDashboardSearchShortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k40 k40Var = null;
        while (eVar.r0(b) == 0) {
            k40Var = (k40) aa.c.b(aa.c.c(ds.a, false)).a(eVar, wVar);
        }
        return new j40(k40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j40 j40Var = (j40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j40Var, "value");
        fVar.z0("setDashboardSearchShortcuts");
        aa.c.b(aa.c.c(ds.a, false)).b(fVar, wVar, j40Var.a);
    }
}
