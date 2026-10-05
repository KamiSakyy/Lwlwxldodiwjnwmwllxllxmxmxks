package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 implements aa.a {
    public static final t3 a = new t3();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.d6 d6Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d6Var = (kc0.d6) aa.c.c(a4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(v3.a, true)))).a(eVar, wVar);
            }
        }
        if (d6Var != null) {
            return new kc0.w5(d6Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.w5 w5Var = (kc0.w5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(a4.a, false).b(fVar, wVar, w5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(v3.a, true)))).b(fVar, wVar, w5Var.b);
    }
}
