package fd0;

import java.util.List;
import kc0.i80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ou implements aa.a {
    public static final ou a = new ou();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mu.a, false)))).a(eVar, wVar);
        }
        return new i80(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i80 i80Var = (i80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i80Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mu.a, false)))).b(fVar, wVar, i80Var.a);
    }
}
