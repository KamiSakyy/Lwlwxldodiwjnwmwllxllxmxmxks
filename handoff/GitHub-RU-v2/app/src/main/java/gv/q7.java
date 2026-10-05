package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q7 implements aa.a {
    public static final q7 a = new q7();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b7.a, false)))).a(eVar, wVar);
        }
        return new c6(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c6 c6Var = (c6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c6Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b7.a, false)))).b(fVar, wVar, c6Var.a);
    }
}
