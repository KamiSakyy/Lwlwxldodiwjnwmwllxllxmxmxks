package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = sy.d0.n("addMobileDeviceToken");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.t tVar = null;
        while (eVar.r0(b) == 0) {
            tVar = (u10.t) aa.c.b(aa.c.c(n.a, false)).a(eVar, wVar);
        }
        return new u10.v(tVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.v vVar = (u10.v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("addMobileDeviceToken");
        aa.c.b(aa.c.c(n.a, false)).b(fVar, wVar, vVar.a);
    }
}
