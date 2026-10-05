package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qf implements aa.a {
    public static final qf a = new qf();
    public static final List b = sy.d0.n("mobileEventsUpdate");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.gn gnVar = null;
        while (eVar.r0(b) == 0) {
            gnVar = (jn0.gn) aa.c.b(aa.c.c(rf.a, false)).a(eVar, wVar);
        }
        return new jn0.fn(gnVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.fn fnVar = (jn0.fn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fnVar, "value");
        fVar.z0("mobileEventsUpdate");
        aa.c.b(aa.c.c(rf.a, false)).b(fVar, wVar, fnVar.a);
    }
}
