package eo0;

import java.util.List;
import jn0.ed0;
import jn0.gd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dy implements aa.a {
    public static final dy a = new dy();
    public static final List b = sy.d0.n("updateMobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gd0 gd0Var = null;
        while (eVar.r0(b) == 0) {
            gd0Var = (gd0) aa.c.b(aa.c.c(fy.a, false)).a(eVar, wVar);
        }
        return new ed0(gd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ed0 ed0Var = (ed0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ed0Var, "value");
        fVar.z0("updateMobilePushNotificationSchedules");
        aa.c.b(aa.c.c(fy.a, false)).b(fVar, wVar, ed0Var.a);
    }
}
