package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aaShadow.a {
    public static final q a = new q();
    public static final List b = sy.d0.n("createUserDashboardPin");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.y yVar = null;
        while (eVar.r0(b) == 0) {
            yVar = (u10.y) aa.c.b(aa.c.c(p.a, false)).a(eVar, wVar);
        }
        return new u10.z(yVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.z zVar = (u10.z) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("createUserDashboardPin");
        aa.c.b(aa.c.c(p.a, false)).b(fVar, wVar, zVar.a);
    }
}
