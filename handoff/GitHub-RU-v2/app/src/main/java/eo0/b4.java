package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b4 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"history", "id"});

    public static jn0.g6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.c6 c6Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                c6Var = (jn0.c6) aa.c.c(x3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (c6Var == null) {
            k41.b.B(eVar, "history");
            throw null;
        }
        if (str != null) {
            return new jn0.g6(c6Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.g6 g6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g6Var, "value");
        fVar.z0("history");
        aa.c.c(x3.a, false).b(fVar, wVar, g6Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, g6Var.b);
    }
}
