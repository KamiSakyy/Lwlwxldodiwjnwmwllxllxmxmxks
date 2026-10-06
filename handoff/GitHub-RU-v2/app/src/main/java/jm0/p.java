package jm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        im0.a0 a0Var = null;
        while (eVar.r0(b) == 0) {
            a0Var = (im0.a0) aa.c.b(aa.c.c(r.a, false)).a(eVar, wVar);
        }
        return new im0.y(a0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        im0.y yVar = (im0.y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(r.a, false)).b(fVar, wVar, yVar.a);
    }
}
