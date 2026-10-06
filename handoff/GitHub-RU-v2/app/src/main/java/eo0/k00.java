package eo0;

import java.util.List;
import jn0.vg0;
import jn0.wg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k00 implements aaShadow.a {
    public static final k00 a = new k00();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vg0 vg0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vg0Var = (vg0) aa.c.c(j00.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i00.a, true)))).a(eVar, wVar);
            }
        }
        if (vg0Var != null) {
            return new wg0(vg0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wg0 wg0Var = (wg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wg0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(j00.a, true).b(fVar, wVar, wg0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i00.a, true)))).b(fVar, wVar, wg0Var.b);
    }
}
