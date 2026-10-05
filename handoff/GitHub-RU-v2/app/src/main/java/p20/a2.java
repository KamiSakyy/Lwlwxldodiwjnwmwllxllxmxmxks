package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 implements aa.a {
    public static final a2 a = new a2();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.k3 k3Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k3Var = (u10.k3) aa.c.c(z1.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y1.a, false)))).a(eVar, wVar);
            }
        }
        if (k3Var != null) {
            return new u10.l3(k3Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.l3 l3Var = (u10.l3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l3Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(z1.a, false).b(fVar, wVar, l3Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y1.a, false)))).b(fVar, wVar, l3Var.b);
    }
}
