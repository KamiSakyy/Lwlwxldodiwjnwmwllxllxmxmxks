package fd0;

import java.util.List;
import kc0.la0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zv implements aa.a {
    public static final zv a = new zv();
    public static final List b = sy.d0.n("navLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(yv.a, false))).a(eVar, wVar);
        }
        return new la0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        la0 la0Var = (la0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(la0Var, "value");
        fVar.z0("navLinks");
        aa.c.b(aa.c.a(aa.c.c(yv.a, false))).b(fVar, wVar, la0Var.a);
    }
}
