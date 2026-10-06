package ny0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        my0.u uVar = null;
        while (eVar.r0(b) == 0) {
            uVar = (my0.u) aa.c.b(aa.c.c(n.a, false)).a(eVar, wVar);
        }
        return new my0.s(uVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my0.s sVar = (my0.s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(n.a, false)).b(fVar, wVar, sVar.a);
    }
}
