package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fe implements aaShadow.a {
    public static final fe a = new fe();
    public static final List b = sy.d0.n("markNotificationAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.xk xkVar = null;
        while (eVar.r0(b) == 0) {
            xkVar = (jo.xk) aa.c.b(aa.c.c(ge.a, false)).a(eVar, wVar);
        }
        return new jo.wk(xkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wk wkVar = (jo.wk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wkVar, "value");
        fVar.z0("markNotificationAsRead");
        aa.c.b(aa.c.c(ge.a, false)).b(fVar, wVar, wkVar.a);
    }
}
