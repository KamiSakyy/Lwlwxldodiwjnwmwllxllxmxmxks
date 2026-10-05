package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b6 implements aa.a {
    public static final b6 a = new b6();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t5 t5Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t5Var = (t5) aa.c.c(z5.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y5.a, true)))).a(eVar, wVar);
            }
        }
        if (t5Var != null) {
            return new u5(t5Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u5 u5Var = (u5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(z5.a, true).b(fVar, wVar, u5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y5.a, true)))).b(fVar, wVar, u5Var.b);
    }
}
