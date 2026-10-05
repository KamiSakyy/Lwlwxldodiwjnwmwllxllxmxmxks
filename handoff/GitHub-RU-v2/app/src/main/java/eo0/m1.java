package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.n("approveDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.p2 p2Var = null;
        while (eVar.r0(b) == 0) {
            p2Var = (jn0.p2) aa.c.b(aa.c.c(l1.a, false)).a(eVar, wVar);
        }
        return new jn0.r2(p2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.r2 r2Var = (jn0.r2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r2Var, "value");
        fVar.z0("approveDeployments");
        aa.c.b(aa.c.c(l1.a, false)).b(fVar, wVar, r2Var.a);
    }
}
