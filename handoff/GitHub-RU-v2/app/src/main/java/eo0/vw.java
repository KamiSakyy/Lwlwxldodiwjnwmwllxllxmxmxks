package eo0;

import java.util.List;
import jn0.nb0;
import jn0.pb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vw implements aa.a {
    public static final vw a = new vw();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pb0 pb0Var = null;
        while (eVar.r0(b) == 0) {
            pb0Var = (pb0) aa.c.b(aa.c.c(xw.a, false)).a(eVar, wVar);
        }
        return new nb0(pb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nb0 nb0Var = (nb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nb0Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(xw.a, false)).b(fVar, wVar, nb0Var.a);
    }
}
