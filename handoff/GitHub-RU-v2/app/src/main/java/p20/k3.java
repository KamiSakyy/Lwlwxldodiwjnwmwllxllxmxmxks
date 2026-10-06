package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 implements aaShadow.a {
    public static final k3 a = new k3();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.w5 w5Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                w5Var = (u10.w5) aa.c.c(v3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o3.a, false)))).a(eVar, wVar);
            }
        }
        if (w5Var != null) {
            return new u10.k5(w5Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.k5 k5Var = (u10.k5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(v3.a, false).b(fVar, wVar, k5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o3.a, false)))).b(fVar, wVar, k5Var.b);
    }
}
