package fd0;

import java.util.List;
import kc0.h10;
import kc0.l10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qp implements aa.a {
    public static final qp a = new qp();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l10 l10Var = null;
        while (eVar.r0(b) == 0) {
            l10Var = (l10) aa.c.c(up.a, false).a(eVar, wVar);
        }
        if (l10Var != null) {
            return new h10(l10Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h10 h10Var = (h10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h10Var, "value");
        fVar.z0("viewer");
        aa.c.c(up.a, false).b(fVar, wVar, h10Var.a);
    }
}
