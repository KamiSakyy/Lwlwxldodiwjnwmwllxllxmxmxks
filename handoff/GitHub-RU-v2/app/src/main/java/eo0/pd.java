package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pd implements aa.a {
    public static final pd a = new pd();
    public static final List b = sy.d0.n("markNotificationAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ek ekVar = null;
        while (eVar.r0(b) == 0) {
            ekVar = (jn0.ek) aa.c.b(aa.c.c(qd.a, false)).a(eVar, wVar);
        }
        return new jn0.dk(ekVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.dk dkVar = (jn0.dk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dkVar, "value");
        fVar.z0("markNotificationAsUnread");
        aa.c.b(aa.c.c(qd.a, false)).b(fVar, wVar, dkVar.a);
    }
}
