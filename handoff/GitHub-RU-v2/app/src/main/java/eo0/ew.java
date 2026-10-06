package eo0;

import java.util.List;
import jn0.ma0;
import jn0.pa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ew implements aaShadow.a {
    public static final ew a = new ew();
    public static final List b = sy.d0.n("updateIssueIssueType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pa0 pa0Var = null;
        while (eVar.r0(b) == 0) {
            pa0Var = (pa0) aa.c.b(aa.c.c(hw.a, false)).a(eVar, wVar);
        }
        return new ma0(pa0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ma0 ma0Var = (ma0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ma0Var, "value");
        fVar.z0("updateIssueIssueType");
        aa.c.b(aa.c.c(hw.a, false)).b(fVar, wVar, ma0Var.a);
    }
}
