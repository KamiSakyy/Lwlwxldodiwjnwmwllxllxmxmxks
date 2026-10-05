package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 implements aa.a {
    public static final e1 a = new e1();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(d1.a, true)))).a(eVar, wVar);
        }
        return new b1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b1 b1Var = (b1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(d1.a, true)))).b(fVar, wVar, b1Var.a);
    }
}
