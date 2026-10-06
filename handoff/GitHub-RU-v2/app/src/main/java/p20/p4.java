package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p4 implements aaShadow.a {
    public static final p4 a = new p4();
    public static final List b = sy.d0Shadow.n("createDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.a7 a7Var = null;
        while (eVar.r0(b) == 0) {
            a7Var = (u10.a7) aa.c.b(aa.c.c(n4.a, false)).a(eVar, wVar);
        }
        return new u10.c7(a7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.c7 c7Var = (u10.c7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c7Var, "value");
        fVar.z0("createDashboardSearchShortcut");
        aa.c.b(aa.c.c(n4.a, false)).b(fVar, wVar, c7Var.a);
    }
}
