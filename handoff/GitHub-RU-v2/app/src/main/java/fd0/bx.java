package fd0;

import java.util.List;
import kc0.ic0;
import kc0.jc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bx implements aa.a {
    public static final bx a = new bx();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jc0 jc0Var = null;
        while (eVar.r0(b) == 0) {
            jc0Var = (jc0) aa.c.c(cx.a, false).a(eVar, wVar);
        }
        if (jc0Var != null) {
            return new ic0(jc0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ic0 ic0Var = (ic0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ic0Var, "value");
        fVar.z0("viewer");
        aa.c.c(cx.a, false).b(fVar, wVar, ic0Var.a);
    }
}
