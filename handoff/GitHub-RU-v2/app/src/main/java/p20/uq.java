package p20;

import java.util.List;
import u10.b30;
import u10.d30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uq implements aa.a {
    public static final uq a = new uq();
    public static final List b = sy.d0.n("unminimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d30 d30Var = null;
        while (eVar.r0(b) == 0) {
            d30Var = (d30) aa.c.b(aa.c.c(wq.a, false)).a(eVar, wVar);
        }
        return new b30(d30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b30 b30Var = (b30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b30Var, "value");
        fVar.z0("unminimizeComment");
        aa.c.b(aa.c.c(wq.a, false)).b(fVar, wVar, b30Var.a);
    }
}
