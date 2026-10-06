package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aaShadow.a {
    public static final g1 a = new g1();
    public static final List b = sy.d0.n("approveActionRequiredWorkflowRuns");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.f2 f2Var = null;
        while (eVar.r0(b) == 0) {
            f2Var = (u10.f2) aa.c.b(aa.c.c(f1.a, false)).a(eVar, wVar);
        }
        return new u10.h2(f2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.h2 h2Var = (u10.h2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h2Var, "value");
        fVar.z0("approveActionRequiredWorkflowRuns");
        aa.c.b(aa.c.c(f1.a, false)).b(fVar, wVar, h2Var.a);
    }
}
