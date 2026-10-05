package eo0;

import java.util.List;
import jn0.w80;
import jn0.y80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ev implements aa.a {
    public static final ev a = new ev();
    public static final List b = sy.d0.n("unminimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y80 y80Var = null;
        while (eVar.r0(b) == 0) {
            y80Var = (y80) aa.c.b(aa.c.c(gv.a, false)).a(eVar, wVar);
        }
        return new w80(y80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w80 w80Var = (w80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w80Var, "value");
        fVar.z0("unminimizeComment");
        aa.c.b(aa.c.c(gv.a, false)).b(fVar, wVar, w80Var.a);
    }
}
