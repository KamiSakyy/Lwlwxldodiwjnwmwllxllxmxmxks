package fd0;

import java.util.List;
import kc0.ab0;
import kc0.bb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iw implements aaShadow.a {
    public static final iw a = new iw();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bb0 bb0Var = null;
        while (eVar.r0(b) == 0) {
            bb0Var = (bb0) aa.c.c(jw.a, true).a(eVar, wVar);
        }
        if (bb0Var != null) {
            return new ab0(bb0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ab0 ab0Var = (ab0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ab0Var, "value");
        fVar.z0("viewer");
        aa.c.c(jw.a, true).b(fVar, wVar, ab0Var.a);
    }
}
