package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ec implements aa.a {
    public static final ec a = new ec();
    public static final List b = sy.d0.n("markNotificationAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bi biVar = null;
        while (eVar.r0(b) == 0) {
            biVar = (kc0.bi) aa.c.b(aa.c.c(fc.a, false)).a(eVar, wVar);
        }
        return new kc0.ai(biVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ai aiVar = (kc0.ai) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aiVar, "value");
        fVar.z0("markNotificationAsRead");
        aa.c.b(aa.c.c(fc.a, false)).b(fVar, wVar, aiVar.a);
    }
}
