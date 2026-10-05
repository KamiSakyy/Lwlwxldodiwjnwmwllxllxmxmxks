package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class re implements aa.a {
    public static final re a = new re();
    public static final List b = sy.d0.n("markNotificationsAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.vl vlVar = null;
        while (eVar.r0(b) == 0) {
            vlVar = (jo.vl) aa.c.b(aa.c.c(se.a, false)).a(eVar, wVar);
        }
        return new jo.ul(vlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ul ulVar = (jo.ul) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ulVar, "value");
        fVar.z0("markNotificationsAsDone");
        aa.c.b(aa.c.c(se.a, false)).b(fVar, wVar, ulVar.a);
    }
}
