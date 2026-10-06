package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kc implements aaShadow.a {
    public static final kc a = new kc();
    public static final List b = sy.d0Shadow.n("markNotificationAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ni niVar = null;
        while (eVar.r0(b) == 0) {
            niVar = (kc0.ni) aa.c.b(aa.c.c(lc.a, false)).a(eVar, wVar);
        }
        return new kc0.mi(niVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.mi miVar = (kc0.mi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(miVar, "value");
        fVar.z0("markNotificationAsUnread");
        aa.c.b(aa.c.c(lc.a, false)).b(fVar, wVar, miVar.a);
    }
}
