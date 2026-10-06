package jm0;

import im0.c1;
import im0.e1;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e1 e1Var = null;
        while (eVar.r0(b) == 0) {
            e1Var = (e1) aa.c.b(aa.c.c(l0.a, false)).a(eVar, wVar);
        }
        return new c1(e1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c1 c1Var = (c1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c1Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(l0.a, false)).b(fVar, wVar, c1Var.a);
    }
}
