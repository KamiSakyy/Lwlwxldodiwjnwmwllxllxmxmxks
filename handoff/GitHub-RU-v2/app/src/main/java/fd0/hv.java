package fd0;

import java.util.List;
import kc0.j90;
import kc0.m90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hv implements aa.a {
    public static final hv a = new hv();
    public static final List b = sy.d0.n("updatePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m90 m90Var = null;
        while (eVar.r0(b) == 0) {
            m90Var = (m90) aa.c.b(aa.c.c(kv.a, false)).a(eVar, wVar);
        }
        return new j90(m90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j90 j90Var = (j90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j90Var, "value");
        fVar.z0("updatePullRequestReviewComment");
        aa.c.b(aa.c.c(kv.a, false)).b(fVar, wVar, j90Var.a);
    }
}
