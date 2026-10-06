package p20;

import java.util.List;
import u10.va0;
import u10.wa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zv implements aaShadow.a {
    public static final zv a = new zv();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        va0 va0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                va0Var = (va0) aa.c.c(yv.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(xv.a, true)))).a(eVar, wVar);
            }
        }
        if (va0Var != null) {
            return new wa0(va0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wa0 wa0Var = (wa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wa0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(yv.a, false).b(fVar, wVar, wa0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(xv.a, true)))).b(fVar, wVar, wa0Var.b);
    }
}
