package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xb implements aa.a {
    public static final xb a = new xb();
    public static final List b = sy.d0.n("markFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qh qhVar = null;
        while (eVar.r0(b) == 0) {
            qhVar = (kc0.qh) aa.c.b(aa.c.c(yb.a, false)).a(eVar, wVar);
        }
        return new kc0.ph(qhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ph phVar = (kc0.ph) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(phVar, "value");
        fVar.z0("markFileAsViewed");
        aa.c.b(aa.c.c(yb.a, false)).b(fVar, wVar, phVar.a);
    }
}
