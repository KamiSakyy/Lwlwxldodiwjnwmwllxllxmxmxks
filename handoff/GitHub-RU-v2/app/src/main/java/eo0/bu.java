package eo0;

import java.util.List;
import jn0.b70;
import jn0.d70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bu implements aaShadow.a {
    public static final bu a = new bu();
    public static final List b = sy.d0.n("unresolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d70 d70Var = null;
        while (eVar.r0(b) == 0) {
            d70Var = (d70) aa.c.b(aa.c.c(du.a, false)).a(eVar, wVar);
        }
        return new b70(d70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b70 b70Var = (b70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b70Var, "value");
        fVar.z0("unresolveReviewThread");
        aa.c.b(aa.c.c(du.a, false)).b(fVar, wVar, b70Var.a);
    }
}
