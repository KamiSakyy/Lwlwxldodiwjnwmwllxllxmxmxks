package eo0;

import java.util.List;
import jn0.p80;
import jn0.t80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zu implements aa.a {
    public static final zu a = new zu();
    public static final List b = sy.d0.n("unmarkFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t80 t80Var = null;
        while (eVar.r0(b) == 0) {
            t80Var = (t80) aa.c.b(aa.c.c(dv.a, false)).a(eVar, wVar);
        }
        return new p80(t80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p80 p80Var = (p80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p80Var, "value");
        fVar.z0("unmarkFileAsViewed");
        aa.c.b(aa.c.c(dv.a, false)).b(fVar, wVar, p80Var.a);
    }
}
