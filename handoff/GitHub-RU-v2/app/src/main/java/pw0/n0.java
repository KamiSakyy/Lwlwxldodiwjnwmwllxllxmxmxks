package pw0;

import java.util.List;
import ow0.b1;
import ow0.c1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0Shadow.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b1 b1Var = null;
        while (eVar.r0(b) == 0) {
            b1Var = (b1) aa.c.b(aa.c.c(m0.a, false)).a(eVar, wVar);
        }
        return new c1(b1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c1 c1Var = (c1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c1Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(m0.a, false)).b(fVar, wVar, c1Var.a);
    }
}
