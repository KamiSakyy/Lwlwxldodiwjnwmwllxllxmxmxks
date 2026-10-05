package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y1 implements aa.a {
    public static final y1 a = new y1();
    public static final List b = sy.d0.n("blockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.f3 f3Var = null;
        while (eVar.r0(b) == 0) {
            f3Var = (jn0.f3) aa.c.b(aa.c.c(x1.a, false)).a(eVar, wVar);
        }
        return new jn0.h3(f3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.h3 h3Var = (jn0.h3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h3Var, "value");
        fVar.z0("blockUserFromOrganization");
        aa.c.b(aa.c.c(x1.a, false)).b(fVar, wVar, h3Var.a);
    }
}
