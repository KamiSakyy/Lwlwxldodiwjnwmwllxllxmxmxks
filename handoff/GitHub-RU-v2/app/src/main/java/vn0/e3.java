package vn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 implements aa.a {
    public static final e3 a = new e3();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(f3.a, false)))).a(eVar, wVar);
        }
        return new u2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u2 u2Var = (u2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u2Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(f3.a, false)))).b(fVar, wVar, u2Var.a);
    }
}
