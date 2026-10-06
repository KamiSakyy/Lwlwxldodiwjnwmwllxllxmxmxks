package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ng implements aaShadow.a {
    public static final ng a = new ng();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.qo qoVar = null;
        while (eVar.r0(b) == 0) {
            qoVar = (u10.qo) aa.c.b(aa.c.c(sg.a, false)).a(eVar, wVar);
        }
        return new u10.lo(qoVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.lo loVar = (u10.lo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(loVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(sg.a, false)).b(fVar, wVar, loVar.a);
    }
}
