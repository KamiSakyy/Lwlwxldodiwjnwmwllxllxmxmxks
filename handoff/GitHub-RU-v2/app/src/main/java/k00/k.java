package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00.t tVar = null;
        while (eVar.r0(b) == 0) {
            tVar = (j00.t) aa.c.b(aa.c.c(m.a, false)).a(eVar, wVar);
        }
        return new j00.r(tVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.r rVar = (j00.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(m.a, false)).b(fVar, wVar, rVar.a);
    }
}
