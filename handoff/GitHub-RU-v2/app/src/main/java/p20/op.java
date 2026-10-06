package p20;

import java.util.List;
import u10.d10;
import u10.h10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class op implements aaShadow.a {
    public static final op a = new op();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h10 h10Var = null;
        while (eVar.r0(b) == 0) {
            h10Var = (h10) aa.c.c(sp.a, false).a(eVar, wVar);
        }
        if (h10Var != null) {
            return new d10(h10Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d10 d10Var = (d10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d10Var, "value");
        fVar.z0("viewer");
        aa.c.c(sp.a, false).b(fVar, wVar, d10Var.a);
    }
}
