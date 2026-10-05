package mz;

import java.util.List;
import lz.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y0.a, true)))).a(eVar, wVar);
        }
        return new e1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e1 e1Var = (e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y0.a, true)))).b(fVar, wVar, e1Var.a);
    }
}
