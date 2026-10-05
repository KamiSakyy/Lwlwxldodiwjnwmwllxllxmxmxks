package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sc implements aa.a {
    public static final sc a = new sc();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.hj hjVar = null;
        while (eVar.r0(b) == 0) {
            hjVar = (u10.hj) aa.c.b(aa.c.c(vc.a, true)).a(eVar, wVar);
        }
        return new u10.ej(hjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ej ejVar = (u10.ej) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ejVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(vc.a, true)).b(fVar, wVar, ejVar.a);
    }
}
