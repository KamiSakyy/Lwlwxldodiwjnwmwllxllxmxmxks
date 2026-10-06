package fd0;

import java.util.List;
import kc0.tc0;
import kc0.xc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ix implements aaShadow.a {
    public static final ix a = new ix();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xc0 xc0Var = null;
        while (eVar.r0(b) == 0) {
            xc0Var = (xc0) aa.c.c(mx.a, false).a(eVar, wVar);
        }
        if (xc0Var != null) {
            return new tc0(xc0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        tc0 tc0Var = (tc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tc0Var, "value");
        fVar.z0("viewer");
        aa.c.c(mx.a, false).b(fVar, wVar, tc0Var.a);
    }
}
