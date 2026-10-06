package fd0;

import java.util.List;
import kc0.oa0;
import kc0.pa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aw implements aaShadow.a {
    public static final aw a = new aw();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pa0 pa0Var = null;
        while (eVar.r0(b) == 0) {
            pa0Var = (pa0) aa.c.c(bw.a, true).a(eVar, wVar);
        }
        if (pa0Var != null) {
            return new oa0(pa0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oa0 oa0Var = (oa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oa0Var, "value");
        fVar.z0("viewer");
        aa.c.c(bw.a, true).b(fVar, wVar, oa0Var.a);
    }
}
