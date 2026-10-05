package p20;

import java.util.List;
import u10.ea0;
import u10.fa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nv implements aa.a {
    public static final nv a = new nv();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fa0 fa0Var = null;
        while (eVar.r0(b) == 0) {
            fa0Var = (fa0) aa.c.c(ov.a, false).a(eVar, wVar);
        }
        if (fa0Var != null) {
            return new ea0(fa0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ea0 ea0Var = (ea0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ea0Var, "value");
        fVar.z0("viewer");
        aa.c.c(ov.a, false).b(fVar, wVar, ea0Var.a);
    }
}
