package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 implements aa.a {
    public static final n1 a = new n1();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r0 r0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                r0Var = (r0) aa.c.c(m1.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(j1.a, false)))).a(eVar, wVar);
            }
        }
        if (r0Var != null) {
            return new s0(r0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s0 s0Var = (s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(m1.a, false).b(fVar, wVar, s0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(j1.a, false)))).b(fVar, wVar, s0Var.b);
    }
}
