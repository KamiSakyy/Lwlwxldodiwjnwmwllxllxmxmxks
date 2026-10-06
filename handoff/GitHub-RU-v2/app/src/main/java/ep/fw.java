package ep;

import java.util.List;
import jo.ga0;
import jo.ha0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fw implements aaShadow.a {
    public static final fw a = new fw();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ha0 ha0Var = null;
        while (eVar.r0(b) == 0) {
            ha0Var = (ha0) aa.c.b(aa.c.c(gw.a, true)).a(eVar, wVar);
        }
        return new ga0(ha0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ga0 ga0Var = (ga0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ga0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(gw.a, true)).b(fVar, wVar, ga0Var.a);
    }
}
