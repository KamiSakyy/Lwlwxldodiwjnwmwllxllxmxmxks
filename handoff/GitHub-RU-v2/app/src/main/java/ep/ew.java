package ep;

import java.util.List;
import jo.fa0;
import jo.ga0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ew implements aa.a {
    public static final ew a = new ew();
    public static final List b = sy.d0.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ga0 ga0Var = null;
        while (eVar.r0(b) == 0) {
            ga0Var = (ga0) aa.c.b(aa.c.c(fw.a, false)).a(eVar, wVar);
        }
        return new fa0(ga0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fa0 fa0Var = (fa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fa0Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(fw.a, false)).b(fVar, wVar, fa0Var.a);
    }
}
