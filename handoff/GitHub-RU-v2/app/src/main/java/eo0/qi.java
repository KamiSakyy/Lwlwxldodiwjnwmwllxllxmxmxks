package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class qi implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("reactions");

    public static jn0.gr c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ir irVar = null;
        while (eVar.r0(a) == 0) {
            irVar = (jn0.ir) aa.c.c(si.a, false).a(eVar, wVar);
        }
        if (irVar != null) {
            return new jn0.gr(irVar);
        }
        k41.b.B(eVar, "reactions");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.gr grVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(grVar, "value");
        fVar.z0("reactions");
        aa.c.c(si.a, false).b(fVar, wVar, grVar.a);
    }
}
