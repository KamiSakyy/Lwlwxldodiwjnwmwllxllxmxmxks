package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vd implements aaShadow.a {
    public static final vd a = new vd();
    public static final List b = sy.d0Shadow.n("markNotificationsAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.qk qkVar = null;
        while (eVar.r0(b) == 0) {
            qkVar = (jn0.qk) aa.c.b(aa.c.c(wd.a, false)).a(eVar, wVar);
        }
        return new jn0.pk(qkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.pk pkVar = (jn0.pk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pkVar, "value");
        fVar.z0("markNotificationsAsDone");
        aa.c.b(aa.c.c(wd.a, false)).b(fVar, wVar, pkVar.a);
    }
}
