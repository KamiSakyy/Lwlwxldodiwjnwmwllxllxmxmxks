package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kg implements aa.a {
    public static final kg a = new kg();
    public static final List b = sy.d0.n("rejectDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.io ioVar = null;
        while (eVar.r0(b) == 0) {
            ioVar = (u10.io) aa.c.b(aa.c.c(mg.a, false)).a(eVar, wVar);
        }
        return new u10.go(ioVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.go goVar = (u10.go) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(goVar, "value");
        fVar.z0("rejectDeployments");
        aa.c.b(aa.c.c(mg.a, false)).b(fVar, wVar, goVar.a);
    }
}
