package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qj implements aaShadow.a {
    public static final qj a = new qj();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ss ssVar = null;
        while (eVar.r0(b) == 0) {
            ssVar = (u10.ss) aa.c.b(aa.c.c(sj.a, true)).a(eVar, wVar);
        }
        return new u10.qs(ssVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.qs qsVar = (u10.qs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qsVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(sj.a, true)).b(fVar, wVar, qsVar.a);
    }
}
