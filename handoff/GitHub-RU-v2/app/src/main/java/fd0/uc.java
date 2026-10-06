package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uc implements aaShadow.a {
    public static final uc a = new uc();
    public static final List b = sy.d0.n("markNotificationsAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.hj hjVar = null;
        while (eVar.r0(b) == 0) {
            hjVar = (kc0.hj) aa.c.b(aa.c.c(vc.a, false)).a(eVar, wVar);
        }
        return new kc0.gj(hjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gj gjVar = (kc0.gj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gjVar, "value");
        fVar.z0("markNotificationsAsUndone");
        aa.c.b(aa.c.c(vc.a, false)).b(fVar, wVar, gjVar.a);
    }
}
