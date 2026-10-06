package bm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 implements aa.a {
    public static final p0 a = new p0();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        am0.y0 y0Var = null;
        while (eVar.r0(b) == 0) {
            y0Var = (am0.y0) aa.c.c(v0.a, false).a(eVar, wVar);
        }
        if (y0Var != null) {
            return new am0.s0(y0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        am0.s0 s0Var = (am0.s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("viewer");
        aa.c.c(v0.a, false).b(fVar, wVar, s0Var.a);
    }
}
