package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u3 implements aa.a {
    public static final u3 a = new u3();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.k6 k6Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k6Var = (jn0.k6) aa.c.c(f4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y3.a, false)))).a(eVar, wVar);
            }
        }
        if (k6Var != null) {
            return new jn0.y5(k6Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.y5 y5Var = (jn0.y5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(f4.a, false).b(fVar, wVar, y5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y3.a, false)))).b(fVar, wVar, y5Var.b);
    }
}
