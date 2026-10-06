package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 implements aaShadow.a {
    public static final l1 a = new l1();
    public static final List b = sy.d0Shadow.n("deployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(n1.a, false))).a(eVar, wVar);
        }
        return new jn0.p2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.p2 p2Var = (jn0.p2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p2Var, "value");
        fVar.z0("deployments");
        aa.c.b(aa.c.a(aa.c.c(n1.a, false))).b(fVar, wVar, p2Var.a);
    }
}
