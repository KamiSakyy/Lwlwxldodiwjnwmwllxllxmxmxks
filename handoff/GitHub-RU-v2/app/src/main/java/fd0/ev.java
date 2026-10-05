package fd0;

import java.util.List;
import kc0.e90;
import kc0.g90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ev implements aa.a {
    public static final ev a = new ev();
    public static final List b = sy.d0.n("updateMobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g90 g90Var = null;
        while (eVar.r0(b) == 0) {
            g90Var = (g90) aa.c.b(aa.c.c(gv.a, false)).a(eVar, wVar);
        }
        return new e90(g90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e90 e90Var = (e90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e90Var, "value");
        fVar.z0("updateMobilePushNotificationSchedules");
        aa.c.b(aa.c.c(gv.a, false)).b(fVar, wVar, e90Var.a);
    }
}
