package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class td implements aa.a {
    public static final td a = new td();
    public static final List b = sy.d0.n("markNotificationSubjectAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.mk mkVar = null;
        while (eVar.r0(b) == 0) {
            mkVar = (jn0.mk) aa.c.b(aa.c.c(ud.a, false)).a(eVar, wVar);
        }
        return new jn0.lk(mkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.lk lkVar = (jn0.lk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lkVar, "value");
        fVar.z0("markNotificationSubjectAsRead");
        aa.c.b(aa.c.c(ud.a, false)).b(fVar, wVar, lkVar.a);
    }
}
