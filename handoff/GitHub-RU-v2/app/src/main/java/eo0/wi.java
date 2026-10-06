package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wi implements aaShadow.a {
    public static final wi a = new wi();
    public static final List b = sy.d0.n("deployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(vi.a, false))).a(eVar, wVar);
        }
        return new jn0.or(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.or orVar = (jn0.or) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(orVar, "value");
        fVar.z0("deployments");
        aa.c.b(aa.c.a(aa.c.c(vi.a, false))).b(fVar, wVar, orVar.a);
    }
}
