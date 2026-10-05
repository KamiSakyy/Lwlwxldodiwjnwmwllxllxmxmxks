package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kb implements aa.a {
    public static final kb a = new kb();
    public static final List b = sy.d0.n("markNotificationAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.zg zgVar = null;
        while (eVar.r0(b) == 0) {
            zgVar = (u10.zg) aa.c.b(aa.c.c(lb.a, false)).a(eVar, wVar);
        }
        return new u10.yg(zgVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.yg ygVar = (u10.yg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ygVar, "value");
        fVar.z0("markNotificationAsRead");
        aa.c.b(aa.c.c(lb.a, false)).b(fVar, wVar, ygVar.a);
    }
}
