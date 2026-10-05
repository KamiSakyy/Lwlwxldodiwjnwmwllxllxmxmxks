package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x6 implements aa.a {
    public static final x6 a = new x6();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p6 p6Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p6Var = (p6) aa.c.c(v6.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(u6.a, true)))).a(eVar, wVar);
            }
        }
        if (p6Var != null) {
            return new q6(p6Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q6 q6Var = (q6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q6Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(v6.a, true).b(fVar, wVar, q6Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(u6.a, true)))).b(fVar, wVar, q6Var.b);
    }
}
