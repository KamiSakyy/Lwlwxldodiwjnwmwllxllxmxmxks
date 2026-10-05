package fd0;

import java.util.List;
import kc0.p80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tu implements aa.a {
    public static final tu a = new tu();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(uu.a, true)))).a(eVar, wVar);
        }
        return new p80(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p80 p80Var = (p80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p80Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(uu.a, true)))).b(fVar, wVar, p80Var.a);
    }
}
