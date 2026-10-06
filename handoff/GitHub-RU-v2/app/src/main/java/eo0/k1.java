package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 implements aaShadow.a {
    public static final k1 a = new k1();
    public static final List b = sy.d0.n("approveActionRequiredWorkflowRuns");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.l2 l2Var = null;
        while (eVar.r0(b) == 0) {
            l2Var = (jn0.l2) aa.c.b(aa.c.c(j1.a, false)).a(eVar, wVar);
        }
        return new jn0.n2(l2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.n2 n2Var = (jn0.n2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n2Var, "value");
        fVar.z0("approveActionRequiredWorkflowRuns");
        aa.c.b(aa.c.c(j1.a, false)).b(fVar, wVar, n2Var.a);
    }
}
