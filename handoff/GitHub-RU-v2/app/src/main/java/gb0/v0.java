package gb0;

import fb0.a1;
import fb0.e1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements aa.a {
    public static final v0 a = new v0();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e1 e1Var = null;
        while (eVar.r0(b) == 0) {
            e1Var = (e1) aa.c.c(z0.a, false).a(eVar, wVar);
        }
        if (e1Var != null) {
            return new a1(e1Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a1 a1Var = (a1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("viewer");
        aa.c.c(z0.a, false).b(fVar, wVar, a1Var.a);
    }
}
