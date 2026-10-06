package fd0;

import java.util.List;
import kc0.a40;
import kc0.b40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nr implements aaShadow.a {
    public static final nr a = new nr();
    public static final List b = sy.d0Shadow.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b40 b40Var = null;
        while (eVar.r0(b) == 0) {
            b40Var = (b40) aa.c.b(aa.c.c(or.a, false)).a(eVar, wVar);
        }
        return new a40(b40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a40 a40Var = (a40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a40Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(or.a, false)).b(fVar, wVar, a40Var.a);
    }
}
