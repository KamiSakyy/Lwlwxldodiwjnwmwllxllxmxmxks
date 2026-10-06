package p20;

import java.util.List;
import u10.e70;
import u10.g70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class st implements aaShadow.a {
    public static final st a = new st();
    public static final List b = sy.d0.n("updateMobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g70 g70Var = null;
        while (eVar.r0(b) == 0) {
            g70Var = (g70) aa.c.b(aa.c.c(ut.a, false)).a(eVar, wVar);
        }
        return new e70(g70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e70 e70Var = (e70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e70Var, "value");
        fVar.z0("updateMobilePushNotificationSchedules");
        aa.c.b(aa.c.c(ut.a, false)).b(fVar, wVar, e70Var.a);
    }
}
