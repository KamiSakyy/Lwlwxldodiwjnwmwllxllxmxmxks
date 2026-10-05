package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = sy.d0.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00.z zVar = null;
        while (eVar.r0(b) == 0) {
            zVar = (j00.z) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
        }
        return new j00.x(zVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.x xVar = (j00.x) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, xVar.a);
    }
}
