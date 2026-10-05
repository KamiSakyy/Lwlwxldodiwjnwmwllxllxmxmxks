package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zd implements aa.a {
    public static final zd a = new zd();
    public static final List b = sy.d0.n("markNotificationsAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.yk ykVar = null;
        while (eVar.r0(b) == 0) {
            ykVar = (jn0.yk) aa.c.b(aa.c.c(ae.a, false)).a(eVar, wVar);
        }
        return new jn0.xk(ykVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xk xkVar = (jn0.xk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xkVar, "value");
        fVar.z0("markNotificationsAsUndone");
        aa.c.b(aa.c.c(ae.a, false)).b(fVar, wVar, xkVar.a);
    }
}
