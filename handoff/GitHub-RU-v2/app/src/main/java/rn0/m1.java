package rn0;

import java.util.List;
import qn0.h2;
import qn0.i2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.n("dispatchWorkflowRun");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i2 i2Var = null;
        while (eVar.r0(b) == 0) {
            i2Var = (i2) aa.c.b(aa.c.c(n1.a, false)).a(eVar, wVar);
        }
        return new h2(i2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h2 h2Var = (h2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h2Var, "value");
        fVar.z0("dispatchWorkflowRun");
        aa.c.b(aa.c.c(n1.a, false)).b(fVar, wVar, h2Var.a);
    }
}
