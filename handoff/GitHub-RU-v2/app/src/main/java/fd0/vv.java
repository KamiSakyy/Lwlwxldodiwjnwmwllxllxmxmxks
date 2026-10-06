package fd0;

import java.util.List;
import kc0.fa0;
import kc0.ga0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vv implements aaShadow.a {
    public static final vv a = new vv();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ga0 ga0Var = null;
        while (eVar.r0(b) == 0) {
            ga0Var = (ga0) aa.c.b(aa.c.c(wv.a, false)).a(eVar, wVar);
        }
        return new fa0(ga0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fa0 fa0Var = (fa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fa0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(wv.a, false)).b(fVar, wVar, fa0Var.a);
    }
}
