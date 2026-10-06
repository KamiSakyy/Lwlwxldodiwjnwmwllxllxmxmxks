package bm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 implements aa.a {
    public static final s0 a = new s0();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(r0.a, false)))).a(eVar, wVar);
        }
        return new am0.v0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        am0.v0 v0Var = (am0.v0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(r0.a, false)))).b(fVar, wVar, v0Var.a);
    }
}
