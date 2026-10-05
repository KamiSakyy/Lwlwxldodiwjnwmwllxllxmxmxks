package fd0;

import java.util.List;
import kc0.fb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lw implements aa.a {
    public static final lw a = new lw();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mw.a, true)))).a(eVar, wVar);
        }
        return new fb0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0 fb0Var = (fb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fb0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mw.a, true)))).b(fVar, wVar, fb0Var.a);
    }
}
