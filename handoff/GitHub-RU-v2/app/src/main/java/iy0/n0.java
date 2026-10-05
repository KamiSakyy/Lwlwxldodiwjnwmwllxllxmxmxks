package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(l0.a, true)))).a(eVar, wVar);
        }
        return new j0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j0 j0Var = (j0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(l0.a, true)))).b(fVar, wVar, j0Var.a);
    }
}
