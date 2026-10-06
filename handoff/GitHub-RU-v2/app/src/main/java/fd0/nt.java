package fd0;

import java.util.List;
import kc0.w60;
import kc0.x60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nt implements aaShadow.a {
    public static final nt a = new nt();
    public static final List b = sy.d0Shadow.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w60 w60Var = null;
        while (eVar.r0(b) == 0) {
            w60Var = (w60) aa.c.b(aa.c.c(mt.a, false)).a(eVar, wVar);
        }
        return new x60(w60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x60 x60Var = (x60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x60Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(mt.a, false)).b(fVar, wVar, x60Var.a);
    }
}
