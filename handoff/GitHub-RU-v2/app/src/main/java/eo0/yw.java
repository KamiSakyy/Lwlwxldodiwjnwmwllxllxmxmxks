package eo0;

import java.util.List;
import jn0.dc0;
import jn0.sb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yw implements aa.a {
    public static final yw a = new yw();
    public static final List b = sy.d0.n("updatePullRequestBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dc0 dc0Var = null;
        while (eVar.r0(b) == 0) {
            dc0Var = (dc0) aa.c.b(aa.c.c(jx.a, false)).a(eVar, wVar);
        }
        return new sb0(dc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sb0 sb0Var = (sb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sb0Var, "value");
        fVar.z0("updatePullRequestBranch");
        aa.c.b(aa.c.c(jx.a, false)).b(fVar, wVar, sb0Var.a);
    }
}
