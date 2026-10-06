package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ym implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"repositories", "id"});

    public static jn0.bx c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.fx fxVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                fxVar = (jn0.fx) aa.c.c(cn.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (fxVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str != null) {
            return new jn0.bx(fxVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.bx bxVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bxVar, "value");
        fVar.z0("repositories");
        aa.c.c(cn.a, false).b(fVar, wVar, bxVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, bxVar.b);
    }
}
