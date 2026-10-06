package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e4 implements aaShadow.a {
    public static final e4 a = new e4();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.t6 t6Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t6Var = (jo.t6) aa.c.c(l4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(g4.a, true)))).a(eVar, wVar);
            }
        }
        if (t6Var != null) {
            return new jo.m6(t6Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.m6 m6Var = (jo.m6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m6Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(l4.a, false).b(fVar, wVar, m6Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(g4.a, true)))).b(fVar, wVar, m6Var.b);
    }
}
