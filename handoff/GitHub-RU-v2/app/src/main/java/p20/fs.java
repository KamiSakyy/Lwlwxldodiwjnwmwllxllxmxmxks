package p20;

import java.util.List;
import u10.g50;
import u10.h50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fs implements aa.a {
    public static final fs a = new fs();
    public static final List b = sy.d0.n("updateUserDashboardPins");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h50 h50Var = null;
        while (eVar.r0(b) == 0) {
            h50Var = (h50) aa.c.b(aa.c.c(gs.a, false)).a(eVar, wVar);
        }
        return new g50(h50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g50 g50Var = (g50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g50Var, "value");
        fVar.z0("updateUserDashboardPins");
        aa.c.b(aa.c.c(gs.a, false)).b(fVar, wVar, g50Var.a);
    }
}
