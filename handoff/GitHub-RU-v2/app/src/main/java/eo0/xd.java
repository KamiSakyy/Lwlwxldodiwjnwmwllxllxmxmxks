package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xd implements aa.a {
    public static final xd a = new xd();
    public static final List b = sy.d0.n("markNotificationsAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.uk ukVar = null;
        while (eVar.r0(b) == 0) {
            ukVar = (jn0.uk) aa.c.b(aa.c.c(yd.a, false)).a(eVar, wVar);
        }
        return new jn0.tk(ukVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.tk tkVar = (jn0.tk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tkVar, "value");
        fVar.z0("markNotificationsAsRead");
        aa.c.b(aa.c.c(yd.a, false)).b(fVar, wVar, tkVar.a);
    }
}
