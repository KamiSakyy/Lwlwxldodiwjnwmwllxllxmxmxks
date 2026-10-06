package p20;

import java.util.List;
import u10.q90;
import u10.r90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gv implements aaShadow.a {
    public static final gv a = new gv();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r90 r90Var = null;
        while (eVar.r0(b) == 0) {
            r90Var = (r90) aa.c.b(aa.c.c(hv.a, true)).a(eVar, wVar);
        }
        return new q90(r90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q90 q90Var = (q90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q90Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(hv.a, true)).b(fVar, wVar, q90Var.a);
    }
}
