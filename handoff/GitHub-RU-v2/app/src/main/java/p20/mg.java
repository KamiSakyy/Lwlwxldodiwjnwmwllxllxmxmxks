package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mg implements aa.a {
    public static final mg a = new mg();
    public static final List b = sy.d0.n("deployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(lg.a, false))).a(eVar, wVar);
        }
        return new u10.io(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.io ioVar = (u10.io) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ioVar, "value");
        fVar.z0("deployments");
        aa.c.b(aa.c.a(aa.c.c(lg.a, false))).b(fVar, wVar, ioVar.a);
    }
}
