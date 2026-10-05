package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ii implements aa.a {
    public static final ii a = new ii();
    public static final List b = sy.d0.n("starrable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.tq tqVar = null;
        while (eVar.r0(b) == 0) {
            tqVar = (u10.tq) aa.c.b(aa.c.c(ji.a, true)).a(eVar, wVar);
        }
        return new u10.sq(tqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.sq sqVar = (u10.sq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sqVar, "value");
        fVar.z0("starrable");
        aa.c.b(aa.c.c(ji.a, true)).b(fVar, wVar, sqVar.a);
    }
}
