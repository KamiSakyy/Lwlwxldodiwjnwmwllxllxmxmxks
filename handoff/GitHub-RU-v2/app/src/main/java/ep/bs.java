package ep;

import java.util.List;
import jo.g40;
import jo.h40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bs implements aa.a {
    public static final bs a = new bs();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g40 g40Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g40Var = (g40) aa.c.c(as.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(xr.a, true)))).a(eVar, wVar);
            }
        }
        if (g40Var != null) {
            return new h40(g40Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h40 h40Var = (h40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h40Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(as.a, false).b(fVar, wVar, h40Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(xr.a, true)))).b(fVar, wVar, h40Var.b);
    }
}
