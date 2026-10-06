package jm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        im0.m0 m0Var = null;
        while (eVar.r0(b) == 0) {
            m0Var = (im0.m0) aa.c.b(aa.c.c(z.a, false)).a(eVar, wVar);
        }
        return new im0.k0(m0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        im0.k0 k0Var = (im0.k0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(z.a, false)).b(fVar, wVar, k0Var.a);
    }
}
