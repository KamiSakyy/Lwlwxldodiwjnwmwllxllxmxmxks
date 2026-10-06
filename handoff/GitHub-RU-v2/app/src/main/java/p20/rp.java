package p20;

import java.util.List;
import u10.f10;
import u10.g10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rp implements aaShadow.a {
    public static final rp a = new rp();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f10 f10Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f10Var = (f10) aa.c.c(qp.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pp.a, true)))).a(eVar, wVar);
            }
        }
        if (f10Var != null) {
            return new g10(f10Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g10 g10Var = (g10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g10Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(qp.a, false).b(fVar, wVar, g10Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pp.a, true)))).b(fVar, wVar, g10Var.b);
    }
}
