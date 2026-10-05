package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class hb implements aa.a {
    public static final List a = x61.l.r(new String[]{"following", "followers"});

    public static jn0.rg c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ng ngVar = null;
        jn0.mg mgVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                ngVar = (jn0.ng) aa.c.c(db.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                mgVar = (jn0.mg) aa.c.c(cb.a, false).a(eVar, wVar);
            }
        }
        if (ngVar == null) {
            k41.b.B(eVar, "following");
            throw null;
        }
        if (mgVar != null) {
            return new jn0.rg(ngVar, mgVar);
        }
        k41.b.B(eVar, "followers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.rg rgVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rgVar, "value");
        fVar.z0("following");
        aa.c.c(db.a, false).b(fVar, wVar, rgVar.a);
        fVar.z0("followers");
        aa.c.c(cb.a, false).b(fVar, wVar, rgVar.b);
    }
}
