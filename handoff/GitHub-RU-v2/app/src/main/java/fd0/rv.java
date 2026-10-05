package fd0;

import java.util.List;
import kc0.ba0;
import kc0.z90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rv implements aa.a {
    public static final rv a = new rv();
    public static final List b = sy.d0.n("updateSubscription");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ba0 ba0Var = null;
        while (eVar.r0(b) == 0) {
            ba0Var = (ba0) aa.c.b(aa.c.c(tv.a, false)).a(eVar, wVar);
        }
        return new z90(ba0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z90 z90Var = (z90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z90Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(tv.a, false)).b(fVar, wVar, z90Var.a);
    }
}
