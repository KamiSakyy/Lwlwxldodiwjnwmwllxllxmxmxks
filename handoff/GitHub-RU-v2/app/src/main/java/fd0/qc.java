package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qc implements aa.a {
    public static final qc a = new qc();
    public static final List b = sy.d0.n("markNotificationsAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.zi ziVar = null;
        while (eVar.r0(b) == 0) {
            ziVar = (kc0.zi) aa.c.b(aa.c.c(rc.a, false)).a(eVar, wVar);
        }
        return new kc0.yi(ziVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.yi yiVar = (kc0.yi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yiVar, "value");
        fVar.z0("markNotificationsAsDone");
        aa.c.b(aa.c.c(rc.a, false)).b(fVar, wVar, yiVar.a);
    }
}
