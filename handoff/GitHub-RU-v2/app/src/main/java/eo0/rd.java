package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rd implements aa.a {
    public static final rd a = new rd();
    public static final List b = sy.d0.n("deleteSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ik ikVar = null;
        while (eVar.r0(b) == 0) {
            ikVar = (jn0.ik) aa.c.b(aa.c.c(sd.a, false)).a(eVar, wVar);
        }
        return new jn0.hk(ikVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hk hkVar = (jn0.hk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hkVar, "value");
        fVar.z0("deleteSavedNotificationThread");
        aa.c.b(aa.c.c(sd.a, false)).b(fVar, wVar, hkVar.a);
    }
}
