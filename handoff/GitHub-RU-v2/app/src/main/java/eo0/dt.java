package eo0;

import java.util.List;
import jn0.v50;
import jn0.w50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dt implements aaShadow.a {
    public static final dt a = new dt();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v50 v50Var = null;
        while (eVar.r0(b) == 0) {
            v50Var = (v50) aa.c.b(aa.c.c(ct.a, true)).a(eVar, wVar);
        }
        return new w50(v50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w50 w50Var = (w50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w50Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(ct.a, true)).b(fVar, wVar, w50Var.a);
    }
}
