package eo0;

import java.util.List;
import jn0.fe0;
import jn0.ge0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uy implements aaShadow.a {
    public static final uy a = new uy();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ge0 ge0Var = null;
        while (eVar.r0(b) == 0) {
            ge0Var = (ge0) aa.c.b(aa.c.c(vy.a, false)).a(eVar, wVar);
        }
        return new fe0(ge0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fe0 fe0Var = (fe0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fe0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(vy.a, false)).b(fVar, wVar, fe0Var.a);
    }
}
