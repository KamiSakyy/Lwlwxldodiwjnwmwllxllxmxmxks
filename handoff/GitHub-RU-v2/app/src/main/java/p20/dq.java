package p20;

import java.util.List;
import u10.c20;
import u10.d20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dq implements aaShadow.a {
    public static final dq a = new dq();
    public static final List b = sy.d0.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d20 d20Var = null;
        while (eVar.r0(b) == 0) {
            d20Var = (d20) aa.c.b(aa.c.c(eq.a, false)).a(eVar, wVar);
        }
        return new c20(d20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c20 c20Var = (c20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c20Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(eq.a, false)).b(fVar, wVar, c20Var.a);
    }
}
