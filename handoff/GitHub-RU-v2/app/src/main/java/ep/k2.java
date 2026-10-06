package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 implements aaShadow.a {
    public static final k2 a = new k2();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.y3 y3Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                y3Var = (jo.y3) aa.c.c(j2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i2.a, false)))).a(eVar, wVar);
            }
        }
        if (y3Var != null) {
            return new jo.z3(y3Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.z3 z3Var = (jo.z3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z3Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(j2.a, false).b(fVar, wVar, z3Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i2.a, false)))).b(fVar, wVar, z3Var.b);
    }
}
