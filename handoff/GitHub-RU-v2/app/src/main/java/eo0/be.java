package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class be implements aa.a {
    public static final be a = new be();
    public static final List b = sy.d0.n("markNotificationsAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.cl clVar = null;
        while (eVar.r0(b) == 0) {
            clVar = (jn0.cl) aa.c.b(aa.c.c(ce.a, false)).a(eVar, wVar);
        }
        return new jn0.bl(clVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.bl blVar = (jn0.bl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(blVar, "value");
        fVar.z0("markNotificationsAsUnread");
        aa.c.b(aa.c.c(ce.a, false)).b(fVar, wVar, blVar.a);
    }
}
