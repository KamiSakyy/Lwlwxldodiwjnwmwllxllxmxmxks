package eo0;

import java.util.List;
import jn0.oc0;
import jn0.vc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qx implements aa.a {
    public static final qx a = new qx();
    public static final List b = sy.d0.n("requestReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vc0 vc0Var = null;
        while (eVar.r0(b) == 0) {
            vc0Var = (vc0) aa.c.b(aa.c.c(xx.a, false)).a(eVar, wVar);
        }
        return new oc0(vc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oc0 oc0Var = (oc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oc0Var, "value");
        fVar.z0("requestReviews");
        aa.c.b(aa.c.c(xx.a, false)).b(fVar, wVar, oc0Var.a);
    }
}
