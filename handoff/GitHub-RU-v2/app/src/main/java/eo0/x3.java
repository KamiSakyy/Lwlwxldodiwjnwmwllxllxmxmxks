package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x3 implements aaShadow.a {
    public static final x3 a = new x3();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.j6 j6Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j6Var = (jn0.j6) aa.c.c(e4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z3.a, true)))).a(eVar, wVar);
            }
        }
        if (j6Var != null) {
            return new jn0.c6(j6Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c6 c6Var = (jn0.c6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c6Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(e4.a, false).b(fVar, wVar, c6Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z3.a, true)))).b(fVar, wVar, c6Var.b);
    }
}
