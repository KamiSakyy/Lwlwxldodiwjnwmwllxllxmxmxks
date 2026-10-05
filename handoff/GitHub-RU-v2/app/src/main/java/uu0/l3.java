package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 implements aa.a {
    public static final l3 a = new l3();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(m3.a, false)))).a(eVar, wVar);
        }
        return new e3(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e3 e3Var = (e3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e3Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(m3.a, false)))).b(fVar, wVar, e3Var.a);
    }
}
