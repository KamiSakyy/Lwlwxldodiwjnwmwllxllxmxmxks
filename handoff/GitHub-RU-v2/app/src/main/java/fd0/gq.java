package fd0;

import java.util.List;
import kc0.c20;
import kc0.d20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gq implements aaShadow.a {
    public static final gq a = new gq();
    public static final List b = sy.d0Shadow.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c20 c20Var = null;
        while (eVar.r0(b) == 0) {
            c20Var = (c20) aa.c.b(aa.c.c(fq.a, true)).a(eVar, wVar);
        }
        return new d20(c20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d20 d20Var = (d20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d20Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(fq.a, true)).b(fVar, wVar, d20Var.a);
    }
}
