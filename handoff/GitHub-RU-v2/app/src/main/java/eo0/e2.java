package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 implements aa.a {
    public static final e2 a = new e2();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.q3 q3Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                q3Var = (jn0.q3) aa.c.c(d2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c2.a, false)))).a(eVar, wVar);
            }
        }
        if (q3Var != null) {
            return new jn0.r3(q3Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.r3 r3Var = (jn0.r3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r3Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(d2.a, false).b(fVar, wVar, r3Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c2.a, false)))).b(fVar, wVar, r3Var.b);
    }
}
