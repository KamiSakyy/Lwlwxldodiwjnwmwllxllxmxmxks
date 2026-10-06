package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y implements aa.a {
    public static final List a = sy.d0Shadow.n("projectsV2");

    public static ux0.m0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ux0.o0 o0Var = null;
        while (eVar.r0(a) == 0) {
            o0Var = (ux0.o0) aa.c.c(a0.a, true).a(eVar, wVar);
        }
        if (o0Var != null) {
            return new ux0.m0(o0Var);
        }
        k41.b.B(eVar, "projectsV2");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ux0.m0 m0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("projectsV2");
        aa.c.c(a0.a, true).b(fVar, wVar, m0Var.a);
    }
}
