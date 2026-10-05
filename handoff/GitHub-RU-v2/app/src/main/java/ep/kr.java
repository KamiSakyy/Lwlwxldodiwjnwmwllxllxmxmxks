package ep;

import java.util.List;
import jo.i30;
import jo.k30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kr implements aa.a {
    public static final kr a = new kr();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k30 k30Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k30Var = (k30) aa.c.c(mr.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(lr.a, true)))).a(eVar, wVar);
            }
        }
        if (k30Var != null) {
            return new i30(k30Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i30 i30Var = (i30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i30Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(mr.a, false).b(fVar, wVar, i30Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(lr.a, true)))).b(fVar, wVar, i30Var.b);
    }
}
