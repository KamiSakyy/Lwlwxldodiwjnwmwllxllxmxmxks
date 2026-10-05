package p20;

import java.util.List;
import u10.q50;
import u10.z50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ls implements aa.a {
    public static final ls a = new ls();
    public static final List b = sy.d0.n("updatePullRequestBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z50 z50Var = null;
        while (eVar.r0(b) == 0) {
            z50Var = (z50) aa.c.b(aa.c.c(us.a, false)).a(eVar, wVar);
        }
        return new q50(z50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q50 q50Var = (q50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q50Var, "value");
        fVar.z0("updatePullRequestBranch");
        aa.c.b(aa.c.c(us.a, false)).b(fVar, wVar, q50Var.a);
    }
}
