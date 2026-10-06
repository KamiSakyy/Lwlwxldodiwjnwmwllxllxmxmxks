package fd0;

import java.util.List;
import kc0.w80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class av implements aaShadow.a {
    public static final av a = new av();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vu.a, true)))).a(eVar, wVar);
        }
        return new w80(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w80 w80Var = (w80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w80Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vu.a, true)))).b(fVar, wVar, w80Var.a);
    }
}
