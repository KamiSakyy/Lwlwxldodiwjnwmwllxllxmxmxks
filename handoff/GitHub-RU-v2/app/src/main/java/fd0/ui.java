package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ui implements aaShadow.a {
    public static final ui a = new ui();
    public static final List b = sy.d0Shadow.n("deleteUserDashboardPin");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.hr hrVar = null;
        while (eVar.r0(b) == 0) {
            hrVar = (kc0.hr) aa.c.b(aa.c.c(vi.a, false)).a(eVar, wVar);
        }
        return new kc0.gr(hrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gr grVar = (kc0.gr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(grVar, "value");
        fVar.z0("deleteUserDashboardPin");
        aa.c.b(aa.c.c(vi.a, false)).b(fVar, wVar, grVar.a);
    }
}
