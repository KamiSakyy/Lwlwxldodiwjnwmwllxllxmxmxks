package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wc implements aa.a {
    public static final wc a = new wc();
    public static final List b = sy.d0.n("markNotificationsAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.lj ljVar = null;
        while (eVar.r0(b) == 0) {
            ljVar = (kc0.lj) aa.c.b(aa.c.c(xc.a, false)).a(eVar, wVar);
        }
        return new kc0.kj(ljVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.kj kjVar = (kc0.kj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kjVar, "value");
        fVar.z0("markNotificationsAsUnread");
        aa.c.b(aa.c.c(xc.a, false)).b(fVar, wVar, kjVar.a);
    }
}
