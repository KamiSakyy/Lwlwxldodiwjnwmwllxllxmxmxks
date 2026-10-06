package vx0;

import java.util.List;
import ux0.e1;
import ux0.f1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0Shadow.n("projectV2Item");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e1 e1Var = null;
        while (eVar.r0(b) == 0) {
            e1Var = (e1) aa.c.b(aa.c.c(k0.a, true)).a(eVar, wVar);
        }
        return new f1Shadow(e1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f1Shadow f1Var = (f1Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("projectV2Item");
        aa.c.b(aa.c.c(k0.a, true)).b(fVar, wVar, f1Var.a);
    }
}
