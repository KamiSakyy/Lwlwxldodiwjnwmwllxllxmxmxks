package ep;

import java.util.List;
import jo.qb0;
import jo.rb0;
import jo.tb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dx implements aaShadow.a {
    public static final dx a = new dx();
    public static final List b = sy.d0Shadow.o("updateSubscription", "markNotificationAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        tb0 tb0Var = null;
        rb0 rb0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                tb0Var = (tb0) aa.c.b(aa.c.c(gx.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new qb0(tb0Var, rb0Var);
                }
                rb0Var = (rb0) aa.c.b(aa.c.c(ex.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qb0 qb0Var = (qb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qb0Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(gx.a, false)).b(fVar, wVar, qb0Var.a);
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(ex.a, false)).b(fVar, wVar, qb0Var.b);
    }
}
