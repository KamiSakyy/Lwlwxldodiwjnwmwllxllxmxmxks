package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yb implements aaShadow.a {
    public static final yb a = new yb();
    public static final List b = sy.d0.n("markNotificationsAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.bi biVar = null;
        while (eVar.r0(b) == 0) {
            biVar = (u10.bi) aa.c.b(aa.c.c(zb.a, false)).a(eVar, wVar);
        }
        return new u10.ai(biVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ai aiVar = (u10.ai) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aiVar, "value");
        fVar.z0("markNotificationsAsRead");
        aa.c.b(aa.c.c(zb.a, false)).b(fVar, wVar, aiVar.a);
    }
}
