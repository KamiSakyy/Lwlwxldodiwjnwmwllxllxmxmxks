package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ui implements aaShadow.a {
    public static final ui a = new ui();
    public static final List b = sy.d0Shadow.n("rejectDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.or orVar = null;
        while (eVar.r0(b) == 0) {
            orVar = (jn0.or) aa.c.b(aa.c.c(wi.a, false)).a(eVar, wVar);
        }
        return new jn0.mr(orVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mr mrVar = (jn0.mr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mrVar, "value");
        fVar.z0("rejectDeployments");
        aa.c.b(aa.c.c(wi.a, false)).b(fVar, wVar, mrVar.a);
    }
}
