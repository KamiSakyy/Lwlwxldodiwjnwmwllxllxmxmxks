package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ej implements aaShadow.a {
    public static final ej a = new ej();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ds dsVar = null;
        while (eVar.r0(b) == 0) {
            dsVar = (u10.ds) aa.c.b(aa.c.c(hj.a, true)).a(eVar, wVar);
        }
        return new u10.as(dsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.as asVar = (u10.as) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(asVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(hj.a, true)).b(fVar, wVar, asVar.a);
    }
}
