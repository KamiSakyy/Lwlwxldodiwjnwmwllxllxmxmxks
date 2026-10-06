package pw0;

import java.util.List;
import ow0.q0;
import uu0.i6;
import uu0.l6;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f0 implements aa.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static q0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        l6 l6Var = l6.a;
        i6 c = l6.c(eVar, wVar);
        if (str != null) {
            return new q0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q0 q0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q0Var.a);
        l6 l6Var = l6.a;
        l6.d(fVar, wVar, q0Var.b);
    }
}
