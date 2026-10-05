package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 implements aa.a {
    public static final b4 a = new b4();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.u6 u6Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                u6Var = (jo.u6) aa.c.c(m4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(f4.a, false)))).a(eVar, wVar);
            }
        }
        if (u6Var != null) {
            return new jo.i6(u6Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i6 i6Var = (jo.i6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i6Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(m4.a, false).b(fVar, wVar, i6Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(f4.a, false)))).b(fVar, wVar, i6Var.b);
    }
}
