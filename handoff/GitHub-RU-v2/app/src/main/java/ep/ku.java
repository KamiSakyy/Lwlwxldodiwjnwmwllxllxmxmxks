package ep;

import java.util.List;
import jo.l70;
import jo.n70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ku implements aa.a {
    public static final ku a = new ku();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l70 l70Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l70Var = (l70) aa.c.c(iu.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(fu.a, false)))).a(eVar, wVar);
            }
        }
        if (l70Var != null) {
            return new n70(l70Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n70 n70Var = (n70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n70Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(iu.a, false).b(fVar, wVar, n70Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(fu.a, false)))).b(fVar, wVar, n70Var.b);
    }
}
