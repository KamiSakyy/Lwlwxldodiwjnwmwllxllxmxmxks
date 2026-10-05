package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 implements aa.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fb0.x0 x0Var = null;
        while (eVar.r0(b) == 0) {
            x0Var = (fb0.x0) aa.c.c(u0.a, false).a(eVar, wVar);
        }
        if (x0Var != null) {
            return new fb0.r0(x0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0.r0 r0Var = (fb0.r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("viewer");
        aa.c.c(u0.a, false).b(fVar, wVar, r0Var.a);
    }
}
