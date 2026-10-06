package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qb implements aaShadow.a {
    public static final qb a = new qb();
    public static final List b = sy.d0.n("markNotificationAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.lh lhVar = null;
        while (eVar.r0(b) == 0) {
            lhVar = (u10.lh) aa.c.b(aa.c.c(rb.a, false)).a(eVar, wVar);
        }
        return new u10.kh(lhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.kh khVar = (u10.kh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(khVar, "value");
        fVar.z0("markNotificationAsUnread");
        aa.c.b(aa.c.c(rb.a, false)).b(fVar, wVar, khVar.a);
    }
}
