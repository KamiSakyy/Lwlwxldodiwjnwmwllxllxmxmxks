package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00.n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (j00.n) aa.c.b(aa.c.c(i.a, false)).a(eVar, wVar);
        }
        return new j00.l(nVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.l lVar = (j00.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(i.a, false)).b(fVar, wVar, lVar.a);
    }
}
