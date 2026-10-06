package ay;

import dw.e7;
import dw.h7;
import java.util.List;
import zx.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x0 implements aa.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static q1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        h7 h7Var = h7.a;
        e7 c = h7.c(eVar, wVar);
        if (str != null) {
            return new q1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q1 q1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q1Var.a);
        h7 h7Var = h7.a;
        h7.d(fVar, wVar, q1Var.b);
    }
}
