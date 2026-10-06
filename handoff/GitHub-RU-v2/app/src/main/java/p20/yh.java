package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yh implements aaShadow.a {
    public static final yh a = new yh();
    public static final List b = sy.d0.n("deleteUserDashboardPin");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.dq dqVar = null;
        while (eVar.r0(b) == 0) {
            dqVar = (u10.dq) aa.c.b(aa.c.c(zh.a, false)).a(eVar, wVar);
        }
        return new u10.cq(dqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.cq cqVar = (u10.cq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cqVar, "value");
        fVar.z0("deleteUserDashboardPin");
        aa.c.b(aa.c.c(zh.a, false)).b(fVar, wVar, cqVar.a);
    }
}
