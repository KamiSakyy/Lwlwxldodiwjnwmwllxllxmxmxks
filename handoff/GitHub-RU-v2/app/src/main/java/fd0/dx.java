package fd0;

import java.util.List;
import kc0.mc0;
import kc0.qc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dx implements aa.a {
    public static final dx a = new dx();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qc0 qc0Var = null;
        while (eVar.r0(b) == 0) {
            qc0Var = (qc0) aa.c.c(hx.a, false).a(eVar, wVar);
        }
        if (qc0Var != null) {
            return new mc0(qc0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mc0 mc0Var = (mc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mc0Var, "value");
        fVar.z0("viewer");
        aa.c.c(hx.a, false).b(fVar, wVar, mc0Var.a);
    }
}
