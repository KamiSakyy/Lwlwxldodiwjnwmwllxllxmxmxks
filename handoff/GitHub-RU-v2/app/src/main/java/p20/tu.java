package p20;

import java.util.List;
import u10.v80;
import u10.w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tu implements aaShadow.a {
    public static final tu a = new tu();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w80 w80Var = null;
        while (eVar.r0(b) == 0) {
            w80Var = (w80) aa.c.c(uu.a, false).a(eVar, wVar);
        }
        if (w80Var != null) {
            return new v80(w80Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v80 v80Var = (v80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v80Var, "value");
        fVar.z0("viewer");
        aa.c.c(uu.a, false).b(fVar, wVar, v80Var.a);
    }
}
