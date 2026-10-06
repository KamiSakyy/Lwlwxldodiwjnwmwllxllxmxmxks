package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3 implements aa.a {
    public static final d3 a = new d3();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(t2.a, false)))).a(eVar, wVar);
        }
        return new h2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h2 h2Var = (h2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h2Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(t2.a, false)))).b(fVar, wVar, h2Var.a);
    }
}
