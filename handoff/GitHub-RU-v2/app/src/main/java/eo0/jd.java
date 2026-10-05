package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jd implements aa.a {
    public static final jd a = new jd();
    public static final List b = sy.d0.n("markNotificationAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.sj sjVar = null;
        while (eVar.r0(b) == 0) {
            sjVar = (jn0.sj) aa.c.b(aa.c.c(kd.a, false)).a(eVar, wVar);
        }
        return new jn0.rj(sjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.rj rjVar = (jn0.rj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rjVar, "value");
        fVar.z0("markNotificationAsRead");
        aa.c.b(aa.c.c(kd.a, false)).b(fVar, wVar, rjVar.a);
    }
}
