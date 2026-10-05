package fd0;

import java.util.List;
import kc0.qb0;
import kc0.rb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sw implements aa.a {
    public static final sw a = new sw();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rb0 rb0Var = null;
        while (eVar.r0(b) == 0) {
            rb0Var = (rb0) aa.c.b(aa.c.c(tw.a, true)).a(eVar, wVar);
        }
        return new qb0(rb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qb0 qb0Var = (qb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qb0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(tw.a, true)).b(fVar, wVar, qb0Var.a);
    }
}
