package p20;

import java.util.List;
import u10.l70;
import u10.m70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yt implements aa.a {
    public static final yt a = new yt();
    public static final List b = sy.d0.n("pullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l70 l70Var = null;
        while (eVar.r0(b) == 0) {
            l70Var = (l70) aa.c.b(aa.c.c(xt.a, true)).a(eVar, wVar);
        }
        return new m70(l70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m70 m70Var = (m70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m70Var, "value");
        fVar.z0("pullRequestReviewComment");
        aa.c.b(aa.c.c(xt.a, true)).b(fVar, wVar, m70Var.a);
    }
}
