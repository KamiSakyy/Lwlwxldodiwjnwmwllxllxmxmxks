package fd0;

import java.util.List;
import kc0.w50;
import kc0.x50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class us implements aa.a {
    public static final us a = new us();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w50 w50Var = null;
        while (eVar.r0(b) == 0) {
            w50Var = (w50) aa.c.b(aa.c.c(ts.a, true)).a(eVar, wVar);
        }
        return new x50(w50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x50 x50Var = (x50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x50Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(ts.a, true)).b(fVar, wVar, x50Var.a);
    }
}
