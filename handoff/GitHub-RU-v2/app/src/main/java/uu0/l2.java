package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 implements aa.a {
    public static final l2 a = new l2();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(q2.a, false)))).a(eVar, wVar);
        }
        return new q1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q1 q1Var = (q1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(q2.a, false)))).b(fVar, wVar, q1Var.a);
    }
}
