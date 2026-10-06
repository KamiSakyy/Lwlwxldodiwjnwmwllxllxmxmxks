package eo0;

import java.util.List;
import jn0.j50;
import jn0.m50;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class us implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"starredRepositories", "id"});

    public static j50 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m50 m50Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                m50Var = (m50) aa.c.c(xs.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (m50Var == null) {
            k41.b.B(eVar, "starredRepositories");
            throw null;
        }
        if (str != null) {
            return new j50(m50Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j50 j50Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j50Var, "value");
        fVar.z0("starredRepositories");
        aa.c.c(xs.a, false).b(fVar, wVar, j50Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, j50Var.b);
    }
}
