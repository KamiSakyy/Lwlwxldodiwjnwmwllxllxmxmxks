package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class te implements aa.a {
    public static final te a = new te();
    public static final List b = sy.d0.n("markNotificationsAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.zl zlVar = null;
        while (eVar.r0(b) == 0) {
            zlVar = (jo.zl) aa.c.b(aa.c.c(ue.a, false)).a(eVar, wVar);
        }
        return new jo.yl(zlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.yl ylVar = (jo.yl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ylVar, "value");
        fVar.z0("markNotificationsAsRead");
        aa.c.b(aa.c.c(ue.a, false)).b(fVar, wVar, ylVar.a);
    }
}
