package ep;

import java.util.List;
import jo.t70;
import jo.v70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qu implements aaShadow.a {
    public static final qu a = new qu();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t70 t70Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t70Var = (t70) aa.c.c(ou.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mu.a, true)))).a(eVar, wVar);
            }
        }
        if (t70Var != null) {
            return new v70(t70Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v70 v70Var = (v70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v70Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(ou.a, false).b(fVar, wVar, v70Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mu.a, true)))).b(fVar, wVar, v70Var.b);
    }
}
