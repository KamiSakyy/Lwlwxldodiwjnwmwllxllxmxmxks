package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 implements aaShadow.a {
    public static final h2 a = new h2();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.f4 f4Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f4Var = (kc0.f4) aa.c.c(q2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(l2.a, true)))).a(eVar, wVar);
            }
        }
        if (f4Var != null) {
            return new kc0.w3(f4Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.w3 w3Var = (kc0.w3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w3Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(q2.a, false).b(fVar, wVar, w3Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(l2.a, true)))).b(fVar, wVar, w3Var.b);
    }
}
