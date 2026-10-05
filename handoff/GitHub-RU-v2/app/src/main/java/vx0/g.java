package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = sy.d0.n("deleteProjectV2Item");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ux0.m mVar = null;
        while (eVar.r0(b) == 0) {
            mVar = (ux0.m) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
        }
        return new ux0.l(mVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.l lVar = (ux0.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("deleteProjectV2Item");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, lVar.a);
    }
}
