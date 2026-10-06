package fd0;

import java.util.List;
import kc0.a10;
import kc0.e10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lp implements aaShadow.a {
    public static final lp a = new lp();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e10 e10Var = null;
        while (eVar.r0(b) == 0) {
            e10Var = (e10) aa.c.c(pp.a, false).a(eVar, wVar);
        }
        if (e10Var != null) {
            return new a10(e10Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a10 a10Var = (a10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a10Var, "value");
        fVar.z0("viewer");
        aa.c.c(pp.a, false).b(fVar, wVar, a10Var.a);
    }
}
