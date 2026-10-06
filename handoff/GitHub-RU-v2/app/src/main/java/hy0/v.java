package hy0;

import gy0.c0;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(x.a, true)))).a(eVar, wVar);
        }
        return new c0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(x.a, true)))).b(fVar, wVar, c0Var.a);
    }
}
