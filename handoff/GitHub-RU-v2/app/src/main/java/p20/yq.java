package p20;

import java.util.List;
import u10.h30;
import u10.i30;
import u10.k30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yq implements aaShadow.a {
    public static final yq a = new yq();
    public static final List b = sy.d0Shadow.o("updateSubscription", "markNotificationAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k30 k30Var = null;
        i30 i30Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k30Var = (k30) aa.c.b(aa.c.c(br.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new h30(k30Var, i30Var);
                }
                i30Var = (i30) aa.c.b(aa.c.c(zq.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h30 h30Var = (h30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h30Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(br.a, false)).b(fVar, wVar, h30Var.a);
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(zq.a, false)).b(fVar, wVar, h30Var.b);
    }
}
