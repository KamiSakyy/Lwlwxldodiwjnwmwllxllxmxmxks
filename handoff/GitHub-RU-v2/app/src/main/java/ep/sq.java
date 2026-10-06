package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sq implements aaShadow.a {
    public static final sq a = new sq();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.i20 i20Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i20Var = (jo.i20) aa.c.c(uq.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(tq.a, false)))).a(eVar, wVar);
            }
        }
        if (i20Var != null) {
            return new jo.g20(i20Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.g20 g20Var = (jo.g20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g20Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(uq.a, false).b(fVar, wVar, g20Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(tq.a, false)))).b(fVar, wVar, g20Var.b);
    }
}
