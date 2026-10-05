package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 implements aa.a {
    public static final l2 a = new l2();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.l4 l4Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l4Var = (jn0.l4) aa.c.c(u2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(p2.a, true)))).a(eVar, wVar);
            }
        }
        if (l4Var != null) {
            return new jn0.c4(l4Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c4 c4Var = (jn0.c4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c4Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(u2.a, false).b(fVar, wVar, c4Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(p2.a, true)))).b(fVar, wVar, c4Var.b);
    }
}
