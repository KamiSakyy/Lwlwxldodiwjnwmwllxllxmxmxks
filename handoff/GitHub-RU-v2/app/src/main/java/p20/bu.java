package p20;

import java.util.List;
import u10.q70;
import u10.r70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bu implements aaShadow.a {
    public static final bu a = new bu();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q70 q70Var = null;
        while (eVar.r0(b) == 0) {
            q70Var = (q70) aa.c.b(aa.c.c(au.a, true)).a(eVar, wVar);
        }
        return new r70(q70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r70 r70Var = (r70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r70Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(au.a, true)).b(fVar, wVar, r70Var.a);
    }
}
