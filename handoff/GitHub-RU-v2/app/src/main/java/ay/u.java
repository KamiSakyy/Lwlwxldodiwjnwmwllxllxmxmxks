package ay;

import dw.h1;
import gv.g6;
import gv.l7;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static zx.h0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        yw.f fVar = yw.f.a;
        yw.b c = yw.f.c(eVar, wVar);
        eVar.s0();
        g6 c2 = l7.c(eVar, wVar);
        eVar.s0();
        dw.e1 c3 = h1.c(eVar, wVar);
        if (str != null) {
            return new zx.h0(str, c, c2, c3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, zx.h0 h0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h0Var.a);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, h0Var.b);
        List list = l7.a;
        l7.d(fVar, wVar, h0Var.c);
        List list2 = h1.a;
        h1.d(fVar, wVar, h0Var.d);
    }
}
