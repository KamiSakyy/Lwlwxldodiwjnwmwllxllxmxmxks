package p20;

import java.util.List;
import u10.ia0;
import u10.ja0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pv implements aaShadow.a {
    public static final pv a = new pv();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ja0 ja0Var = null;
        while (eVar.r0(b) == 0) {
            ja0Var = (ja0) aa.c.c(qv.a, false).a(eVar, wVar);
        }
        if (ja0Var != null) {
            return new ia0(ja0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ia0 ia0Var = (ia0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ia0Var, "value");
        fVar.z0("viewer");
        aa.c.c(qv.a, false).b(fVar, wVar, ia0Var.a);
    }
}
