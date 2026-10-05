package vn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"pageInfo", "nodes"});

    public static m2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l2 l2Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                l2Var = (l2) aa.c.c(o2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n2.a, true)))).a(eVar, wVar);
            }
        }
        if (l2Var != null) {
            return new m2(l2Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m2 m2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m2Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(o2.a, false).b(fVar, wVar, m2Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n2.a, true)))).b(fVar, wVar, m2Var.b);
    }
}
