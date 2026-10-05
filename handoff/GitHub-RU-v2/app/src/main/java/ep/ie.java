package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ie implements aa.a {
    public static final ie a = new ie();
    public static final List b = sy.d0.n("createSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.al alVar = null;
        while (eVar.r0(b) == 0) {
            alVar = (jo.al) aa.c.b(aa.c.c(he.a, false)).a(eVar, wVar);
        }
        return new jo.bl(alVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.bl blVar = (jo.bl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(blVar, "value");
        fVar.z0("createSavedNotificationThread");
        aa.c.b(aa.c.c(he.a, false)).b(fVar, wVar, blVar.a);
    }
}
