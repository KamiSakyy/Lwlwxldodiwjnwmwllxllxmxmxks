package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cc implements aaShadow.a {
    public static final cc a = new cc();
    public static final List b = sy.d0Shadow.n("markNotificationsAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ji jiVar = null;
        while (eVar.r0(b) == 0) {
            jiVar = (u10.ji) aa.c.b(aa.c.c(dc.a, false)).a(eVar, wVar);
        }
        return new u10.ii(jiVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ii iiVar = (u10.ii) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iiVar, "value");
        fVar.z0("markNotificationsAsUnread");
        aa.c.b(aa.c.c(dc.a, false)).b(fVar, wVar, iiVar.a);
    }
}
