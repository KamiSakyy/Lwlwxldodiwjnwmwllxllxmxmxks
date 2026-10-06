package eo0;

import java.util.List;
import jn0.x10;
import jn0.y10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iq implements aaShadow.a {
    public static final iq a = new iq();
    public static final List b = sy.d0Shadow.n("resolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y10 y10Var = null;
        while (eVar.r0(b) == 0) {
            y10Var = (y10) aa.c.b(aa.c.c(jq.a, false)).a(eVar, wVar);
        }
        return new x10(y10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x10 x10Var = (x10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x10Var, "value");
        fVar.z0("resolveReviewThread");
        aa.c.b(aa.c.c(jq.a, false)).b(fVar, wVar, x10Var.a);
    }
}
