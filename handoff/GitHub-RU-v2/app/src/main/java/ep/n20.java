package ep;

import java.util.List;
import jo.wj0;
import jo.xj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n20 implements aa.a {
    public static final n20 a = new n20();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xj0 xj0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xj0Var = (xj0) aa.c.c(o20.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(m20.a, true)))).a(eVar, wVar);
            }
        }
        if (xj0Var != null) {
            return new wj0(xj0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wj0 wj0Var = (wj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wj0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(o20.a, false).b(fVar, wVar, wj0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(m20.a, true)))).b(fVar, wVar, wj0Var.b);
    }
}
