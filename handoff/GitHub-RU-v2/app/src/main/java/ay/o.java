package ay;

import dw.c5;
import dw.t4;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static zx.x c(ea.e eVar, aa.w wVar) {
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
        c5 c5Var = c5.a;
        t4 c2 = c5.c(eVar, wVar);
        eVar.s0();
        dw.c c3 = dw.d.c(eVar, wVar);
        if (str != null) {
            return new zx.x(str, c, c2, c3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, zx.x xVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, xVar.a);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, xVar.b);
        c5 c5Var = c5.a;
        c5.d(fVar, wVar, xVar.c);
        List list = dw.d.a;
        dw.d.d(fVar, wVar, xVar.d);
    }
}
