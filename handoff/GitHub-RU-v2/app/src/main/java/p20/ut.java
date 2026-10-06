package p20;

import java.util.List;
import u10.g70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ut implements aaShadow.a {
    public static final ut a = new ut();
    public static final List b = sy.d0Shadow.n("mobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(tt.a, true))).a(eVar, wVar);
        }
        return new g70(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g70 g70Var = (g70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g70Var, "value");
        fVar.z0("mobilePushNotificationSchedules");
        aa.c.b(aa.c.a(aa.c.c(tt.a, true))).b(fVar, wVar, g70Var.a);
    }
}
