package fd0;

import java.util.List;
import kc0.eb0;
import kc0.ib0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kw implements aaShadow.a {
    public static final kw a = new kw();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ib0 ib0Var = null;
        while (eVar.r0(b) == 0) {
            ib0Var = (ib0) aa.c.b(aa.c.c(ow.a, false)).a(eVar, wVar);
        }
        return new eb0(ib0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        eb0 eb0Var = (eb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eb0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(ow.a, false)).b(fVar, wVar, eb0Var.a);
    }
}
