package fd0;

import java.util.List;
import kc0.p90;
import kc0.r90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lv implements aaShadow.a {
    public static final lv a = new lv();
    public static final List b = sy.d0Shadow.n("updatePullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r90 r90Var = null;
        while (eVar.r0(b) == 0) {
            r90Var = (r90) aa.c.b(aa.c.c(nv.a, false)).a(eVar, wVar);
        }
        return new p90(r90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p90 p90Var = (p90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p90Var, "value");
        fVar.z0("updatePullRequestReview");
        aa.c.b(aa.c.c(nv.a, false)).b(fVar, wVar, p90Var.a);
    }
}
