package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 implements aa.a {
    public static final h5 a = new h5();
    public static final List b = sy.d0.n("createDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.y7 y7Var = null;
        while (eVar.r0(b) == 0) {
            y7Var = (jn0.y7) aa.c.b(aa.c.c(f5.a, false)).a(eVar, wVar);
        }
        return new jn0.a8(y7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.a8 a8Var = (jn0.a8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a8Var, "value");
        fVar.z0("createDashboardSearchShortcut");
        aa.c.b(aa.c.c(f5.a, false)).b(fVar, wVar, a8Var.a);
    }
}
