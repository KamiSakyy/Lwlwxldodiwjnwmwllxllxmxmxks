package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = sy.d0.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mb0.i iVar = null;
        while (eVar.r0(b) == 0) {
            iVar = (mb0.i) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new mb0.g(iVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.g gVar = (mb0.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, gVar.a);
    }
}
