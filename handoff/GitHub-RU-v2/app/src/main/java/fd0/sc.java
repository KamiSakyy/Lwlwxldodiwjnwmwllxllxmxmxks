package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sc implements aaShadow.a {
    public static final sc a = new sc();
    public static final List b = sy.d0.n("markNotificationsAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.dj djVar = null;
        while (eVar.r0(b) == 0) {
            djVar = (kc0.dj) aa.c.b(aa.c.c(tc.a, false)).a(eVar, wVar);
        }
        return new kc0.cj(djVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.cj cjVar = (kc0.cj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cjVar, "value");
        fVar.z0("markNotificationsAsRead");
        aa.c.b(aa.c.c(tc.a, false)).b(fVar, wVar, cjVar.a);
    }
}
