package fd0;

import java.util.List;
import kc0.l90;
import kc0.m90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kv implements aaShadow.a {
    public static final kv a = new kv();
    public static final List b = sy.d0.n("pullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l90 l90Var = null;
        while (eVar.r0(b) == 0) {
            l90Var = (l90) aa.c.b(aa.c.c(jv.a, true)).a(eVar, wVar);
        }
        return new m90(l90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m90 m90Var = (m90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m90Var, "value");
        fVar.z0("pullRequestReviewComment");
        aa.c.b(aa.c.c(jv.a, true)).b(fVar, wVar, m90Var.a);
    }
}
