package eo0;

import java.util.List;
import jn0.t50;
import jn0.w50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class at implements aa.a {
    public static final at a = new at();
    public static final List b = sy.d0.n("submitPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w50 w50Var = null;
        while (eVar.r0(b) == 0) {
            w50Var = (w50) aa.c.b(aa.c.c(dt.a, false)).a(eVar, wVar);
        }
        return new t50(w50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t50 t50Var = (t50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t50Var, "value");
        fVar.z0("submitPullRequestReview");
        aa.c.b(aa.c.c(dt.a, false)).b(fVar, wVar, t50Var.a);
    }
}
