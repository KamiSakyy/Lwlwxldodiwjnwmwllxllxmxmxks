package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mg implements aaShadow.a {
    public static final mg a = new mg();
    public static final List b = sy.d0.n("minimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.mo moVar = null;
        while (eVar.r0(b) == 0) {
            moVar = (jo.mo) aa.c.b(aa.c.c(ng.a, false)).a(eVar, wVar);
        }
        return new jo.lo(moVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.lo loVar = (jo.lo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(loVar, "value");
        fVar.z0("minimizeComment");
        aa.c.b(aa.c.c(ng.a, false)).b(fVar, wVar, loVar.a);
    }
}
