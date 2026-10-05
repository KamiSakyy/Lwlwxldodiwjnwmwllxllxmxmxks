package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nd implements aa.a {
    public static final nd a = new nd();
    public static final List b = sy.d0.n("markNotificationAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ak akVar = null;
        while (eVar.r0(b) == 0) {
            akVar = (jn0.ak) aa.c.b(aa.c.c(od.a, false)).a(eVar, wVar);
        }
        return new jn0.zj(akVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.zj zjVar = (jn0.zj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zjVar, "value");
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(od.a, false)).b(fVar, wVar, zjVar.a);
    }
}
