package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class rm implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("watchers");

    public static jn0.sw c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.uw uwVar = null;
        while (eVar.r0(a) == 0) {
            uwVar = (jn0.uw) aa.c.c(tm.a, false).a(eVar, wVar);
        }
        if (uwVar != null) {
            return new jn0.sw(uwVar);
        }
        k41.b.B(eVar, "watchers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.sw swVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(swVar, "value");
        fVar.z0("watchers");
        aa.c.c(tm.a, false).b(fVar, wVar, swVar.a);
    }
}
