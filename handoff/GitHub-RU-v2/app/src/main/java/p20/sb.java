package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sb implements aa.a {
    public static final sb a = new sb();
    public static final List b = sy.d0.n("deleteSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ph phVar = null;
        while (eVar.r0(b) == 0) {
            phVar = (u10.ph) aa.c.b(aa.c.c(tb.a, false)).a(eVar, wVar);
        }
        return new u10.oh(phVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.oh ohVar = (u10.oh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ohVar, "value");
        fVar.z0("deleteSavedNotificationThread");
        aa.c.b(aa.c.c(tb.a, false)).b(fVar, wVar, ohVar.a);
    }
}
