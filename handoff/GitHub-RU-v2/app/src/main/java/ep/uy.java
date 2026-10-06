package ep;

import java.util.List;
import jo.ge0;
import jo.re0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uy implements aaShadow.a {
    public static final uy a = new uy();
    public static final List b = sy.d0.n("updatePullRequestBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        re0 re0Var = null;
        while (eVar.r0(b) == 0) {
            re0Var = (re0) aa.c.b(aa.c.c(fz.a, false)).a(eVar, wVar);
        }
        return new ge0(re0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ge0 ge0Var = (ge0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ge0Var, "value");
        fVar.z0("updatePullRequestBranch");
        aa.c.b(aa.c.c(fz.a, false)).b(fVar, wVar, ge0Var.a);
    }
}
