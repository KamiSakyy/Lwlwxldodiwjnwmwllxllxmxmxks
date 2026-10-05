package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hi implements aa.a {
    public static final hi a = new hi();
    public static final List b = sy.d0.n("removeStar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.sq sqVar = null;
        while (eVar.r0(b) == 0) {
            sqVar = (u10.sq) aa.c.b(aa.c.c(ii.a, false)).a(eVar, wVar);
        }
        return new u10.rq(sqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.rq rqVar = (u10.rq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rqVar, "value");
        fVar.z0("removeStar");
        aa.c.b(aa.c.c(ii.a, false)).b(fVar, wVar, rqVar.a);
    }
}
