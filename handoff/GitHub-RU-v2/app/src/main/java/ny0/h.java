package ny0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = sy.d0.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        my0.o oVar = null;
        while (eVar.r0(b) == 0) {
            oVar = (my0.o) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
        }
        return new my0.m(oVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my0.m mVar = (my0.m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, mVar.a);
    }
}
