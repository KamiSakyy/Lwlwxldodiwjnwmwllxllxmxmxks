package eo0;

import java.util.List;
import jn0.i10;
import jn0.k10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zp implements aa.a {
    public static final zp a = new zp();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k10 k10Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k10Var = (k10) aa.c.c(bq.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(aq.a, true)))).a(eVar, wVar);
            }
        }
        if (k10Var != null) {
            return new i10(k10Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i10 i10Var = (i10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i10Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(bq.a, false).b(fVar, wVar, i10Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(aq.a, true)))).b(fVar, wVar, i10Var.b);
    }
}
