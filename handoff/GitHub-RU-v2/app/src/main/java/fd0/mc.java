package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mc implements aaShadow.a {
    public static final mc a = new mc();
    public static final List b = sy.d0.n("deleteSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ri riVar = null;
        while (eVar.r0(b) == 0) {
            riVar = (kc0.ri) aa.c.b(aa.c.c(nc.a, false)).a(eVar, wVar);
        }
        return new kc0.qi(riVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qi qiVar = (kc0.qi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qiVar, "value");
        fVar.z0("deleteSavedNotificationThread");
        aa.c.b(aa.c.c(nc.a, false)).b(fVar, wVar, qiVar.a);
    }
}
