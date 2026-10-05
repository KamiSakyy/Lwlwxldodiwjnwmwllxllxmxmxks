package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class md implements aa.a {
    public static final md a = new md();
    public static final List b = sy.d0.n("createSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.vj vjVar = null;
        while (eVar.r0(b) == 0) {
            vjVar = (jn0.vj) aa.c.b(aa.c.c(ld.a, false)).a(eVar, wVar);
        }
        return new jn0.wj(vjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.wj wjVar = (jn0.wj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wjVar, "value");
        fVar.z0("createSavedNotificationThread");
        aa.c.b(aa.c.c(ld.a, false)).b(fVar, wVar, wjVar.a);
    }
}
