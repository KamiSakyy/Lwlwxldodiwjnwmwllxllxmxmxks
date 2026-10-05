package ep;

import java.util.List;
import jo.j90;
import jo.k90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tv implements aa.a {
    public static final tv a = new tv();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j90 j90Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j90Var = (j90) aa.c.c(sv.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(rv.a, true)))).a(eVar, wVar);
            }
        }
        if (j90Var != null) {
            return new k90(j90Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k90 k90Var = (k90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k90Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(sv.a, false).b(fVar, wVar, k90Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(rv.a, true)))).b(fVar, wVar, k90Var.b);
    }
}
