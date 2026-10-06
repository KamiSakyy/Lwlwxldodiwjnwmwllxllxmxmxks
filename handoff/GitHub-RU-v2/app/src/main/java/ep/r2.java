package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 implements aaShadow.a {
    public static final r2 a = new r2();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.u4 u4Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                u4Var = (jo.u4) aa.c.c(a3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(v2.a, true)))).a(eVar, wVar);
            }
        }
        if (u4Var != null) {
            return new jo.l4(u4Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.l4 l4Var = (jo.l4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l4Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(a3.a, false).b(fVar, wVar, l4Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(v2.a, true)))).b(fVar, wVar, l4Var.b);
    }
}
