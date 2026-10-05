package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ic implements aa.a {
    public static final ic a = new ic();
    public static final List b = sy.d0.n("markNotificationAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ji jiVar = null;
        while (eVar.r0(b) == 0) {
            jiVar = (kc0.ji) aa.c.b(aa.c.c(jc.a, false)).a(eVar, wVar);
        }
        return new kc0.ii(jiVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ii iiVar = (kc0.ii) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iiVar, "value");
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(jc.a, false)).b(fVar, wVar, iiVar.a);
    }
}
