package fd0;

import java.util.List;
import kc0.b30;
import kc0.f30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yq implements aaShadow.a {
    public static final yq a = new yq();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f30 f30Var = null;
        while (eVar.r0(b) == 0) {
            f30Var = (f30) aa.c.c(cr.a, false).a(eVar, wVar);
        }
        if (f30Var != null) {
            return new b30(f30Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b30 b30Var = (b30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b30Var, "value");
        fVar.z0("viewer");
        aa.c.c(cr.a, false).b(fVar, wVar, b30Var.a);
    }
}
