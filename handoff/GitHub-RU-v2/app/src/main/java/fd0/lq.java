package fd0;

import java.util.List;
import kc0.l20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lq implements aaShadow.a {
    public static final lq a = new lq();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oq.a, false)))).a(eVar, wVar);
        }
        return new l20(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l20 l20Var = (l20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l20Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oq.a, false)))).b(fVar, wVar, l20Var.a);
    }
}
