package el0;

import dl0.s0;
import dl0.t0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s0 s0Var = null;
        while (eVar.r0(b) == 0) {
            s0Var = (s0) aa.c.b(aa.c.c(h0.a, false)).a(eVar, wVar);
        }
        return new t0(s0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t0 t0Var = (t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(h0.a, false)).b(fVar, wVar, t0Var.a);
    }
}
