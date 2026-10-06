package fd0;

import java.util.List;
import kc0.ub0;
import kc0.wb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uw implements aaShadow.a {
    public static final uw a = new uw();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wb0 wb0Var = null;
        while (eVar.r0(b) == 0) {
            wb0Var = (wb0) aa.c.c(ww.a, false).a(eVar, wVar);
        }
        if (wb0Var != null) {
            return new ub0(wb0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ub0 ub0Var = (ub0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ub0Var, "value");
        fVar.z0("viewer");
        aa.c.c(ww.a, false).b(fVar, wVar, ub0Var.a);
    }
}
