package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u5 implements aa.a {
    public static final u5 a = new u5();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(v5.a, false)))).a(eVar, wVar);
        }
        return new o5(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o5 o5Var = (o5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o5Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(v5.a, false)))).b(fVar, wVar, o5Var.a);
    }
}
