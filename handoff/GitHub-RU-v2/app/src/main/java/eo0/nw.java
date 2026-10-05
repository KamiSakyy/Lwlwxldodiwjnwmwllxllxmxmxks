package eo0;

import java.util.List;
import jn0.bb0;
import jn0.za0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nw implements aa.a {
    public static final nw a = new nw();
    public static final List b = sy.d0.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bb0 bb0Var = null;
        while (eVar.r0(b) == 0) {
            bb0Var = (bb0) aa.c.b(aa.c.c(pw.a, false)).a(eVar, wVar);
        }
        return new za0(bb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        za0 za0Var = (za0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(za0Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(pw.a, false)).b(fVar, wVar, za0Var.a);
    }
}
