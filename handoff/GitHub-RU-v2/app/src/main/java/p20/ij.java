package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ij implements aa.a {
    public static final List a = sy.d0.n("forks");

    public static u10.es c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.bs bsVar = null;
        while (eVar.r0(a) == 0) {
            bsVar = (u10.bs) aa.c.c(fj.a, false).a(eVar, wVar);
        }
        if (bsVar != null) {
            return new u10.es(bsVar);
        }
        k41.b.B(eVar, "forks");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.es esVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(esVar, "value");
        fVar.z0("forks");
        aa.c.c(fj.a, false).b(fVar, wVar, esVar.a);
    }
}
