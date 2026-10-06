package fd0;

import java.util.List;
import kc0.g20;
import kc0.h20;
import kc0.j20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hq implements aaShadow.a {
    public static final hq a = new hq();
    public static final List b = sy.d0Shadow.o(new String[]{"updateSubscription", "markNotificationAsUndone"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j20 j20Var = null;
        h20 h20Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j20Var = (j20) aa.c.b(aa.c.c(kq.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new g20(j20Var, h20Var);
                }
                h20Var = (h20) aa.c.b(aa.c.c(iq.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g20 g20Var = (g20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g20Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(kq.a, false)).b(fVar, wVar, g20Var.a);
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(iq.a, false)).b(fVar, wVar, g20Var.b);
    }
}
