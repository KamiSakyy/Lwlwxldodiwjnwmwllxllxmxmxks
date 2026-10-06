package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pi implements aaShadow.a {
    public static final pi a = new pi();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.cr crVar = null;
        while (eVar.r0(b) == 0) {
            crVar = (u10.cr) aa.c.b(aa.c.c(oi.a, true)).a(eVar, wVar);
        }
        return new u10.dr(crVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.dr drVar = (u10.dr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(drVar, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(oi.a, true)).b(fVar, wVar, drVar.a);
    }
}
