package fd0;

import java.util.List;
import kc0.y70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gu implements aaShadow.a {
    public static final gu a = new gu();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(cu.a, true)))).a(eVar, wVar);
        }
        return new y70(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y70 y70Var = (y70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y70Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(cu.a, true)))).b(fVar, wVar, y70Var.a);
    }
}
