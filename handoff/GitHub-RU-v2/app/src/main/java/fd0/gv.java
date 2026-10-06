package fd0;

import java.util.List;
import kc0.g90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gv implements aaShadow.a {
    public static final gv a = new gv();
    public static final List b = sy.d0Shadow.n("mobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(fv.a, true))).a(eVar, wVar);
        }
        return new g90(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g90 g90Var = (g90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g90Var, "value");
        fVar.z0("mobilePushNotificationSchedules");
        aa.c.b(aa.c.a(aa.c.c(fv.a, true))).b(fVar, wVar, g90Var.a);
    }
}
