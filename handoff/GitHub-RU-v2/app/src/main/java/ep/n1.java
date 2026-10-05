package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 implements aa.a {
    public static final n1 a = new n1();
    public static final List b = sy.d0.n("approveActionRequiredWorkflowRuns");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.q2 q2Var = null;
        while (eVar.r0(b) == 0) {
            q2Var = (jo.q2) aa.c.b(aa.c.c(m1.a, false)).a(eVar, wVar);
        }
        return new jo.s2(q2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.s2 s2Var = (jo.s2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s2Var, "value");
        fVar.z0("approveActionRequiredWorkflowRuns");
        aa.c.b(aa.c.c(m1.a, false)).b(fVar, wVar, s2Var.a);
    }
}
