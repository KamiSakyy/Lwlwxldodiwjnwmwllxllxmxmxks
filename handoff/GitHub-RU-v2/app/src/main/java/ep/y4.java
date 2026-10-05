package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y4 implements aa.a {
    public static final y4 a = new y4();
    public static final List b = sy.d0.n("createCopilotAgentTask");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l7 l7Var = null;
        while (eVar.r0(b) == 0) {
            l7Var = (jo.l7) aa.c.b(aa.c.c(x4.a, false)).a(eVar, wVar);
        }
        return new jo.m7(l7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.m7 m7Var = (jo.m7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m7Var, "value");
        fVar.z0("createCopilotAgentTask");
        aa.c.b(aa.c.c(x4.a, false)).b(fVar, wVar, m7Var.a);
    }
}
