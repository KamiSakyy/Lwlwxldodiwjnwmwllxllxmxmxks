package fd0;

import java.util.List;
import kc0.a20;
import kc0.d20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dq implements aaShadow.a {
    public static final dq a = new dq();
    public static final List b = sy.d0Shadow.n("submitPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d20 d20Var = null;
        while (eVar.r0(b) == 0) {
            d20Var = (d20) aa.c.b(aa.c.c(gq.a, false)).a(eVar, wVar);
        }
        return new a20(d20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a20 a20Var = (a20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a20Var, "value");
        fVar.z0("submitPullRequestReview");
        aa.c.b(aa.c.c(gq.a, false)).b(fVar, wVar, a20Var.a);
    }
}
