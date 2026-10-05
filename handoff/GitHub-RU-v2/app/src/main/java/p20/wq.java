package p20;

import java.util.List;
import u10.d30;
import u10.e30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wq implements aa.a {
    public static final wq a = new wq();
    public static final List b = sy.d0.n("unminimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e30 e30Var = null;
        while (eVar.r0(b) == 0) {
            e30Var = (e30) aa.c.b(aa.c.c(xq.a, true)).a(eVar, wVar);
        }
        return new d30(e30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d30 d30Var = (d30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d30Var, "value");
        fVar.z0("unminimizedComment");
        aa.c.b(aa.c.c(xq.a, true)).b(fVar, wVar, d30Var.a);
    }
}
