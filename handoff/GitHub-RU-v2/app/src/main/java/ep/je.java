package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class je implements aaShadow.a {
    public static final je a = new je();
    public static final List b = sy.d0Shadow.n("markNotificationAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fl flVar = null;
        while (eVar.r0(b) == 0) {
            flVar = (jo.fl) aa.c.b(aa.c.c(ke.a, false)).a(eVar, wVar);
        }
        return new jo.el(flVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.el elVar = (jo.el) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(elVar, "value");
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(ke.a, false)).b(fVar, wVar, elVar.a);
    }
}
