package p20;

import java.util.List;
import u10.p70;
import u10.r70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zt implements aaShadow.a {
    public static final zt a = new zt();
    public static final List b = sy.d0.n("updatePullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r70 r70Var = null;
        while (eVar.r0(b) == 0) {
            r70Var = (r70) aa.c.b(aa.c.c(bu.a, false)).a(eVar, wVar);
        }
        return new p70(r70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p70 p70Var = (p70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p70Var, "value");
        fVar.z0("updatePullRequestReview");
        aa.c.b(aa.c.c(bu.a, false)).b(fVar, wVar, p70Var.a);
    }
}
