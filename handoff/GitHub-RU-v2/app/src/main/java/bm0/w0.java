package bm0;

import am0.b1;
import am0.f1;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 implements aa.a {
    public static final w0 a = new w0();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f1 f1Var = null;
        while (eVar.r0(b) == 0) {
            f1Var = (f1) aa.c.c(a1.a, false).a(eVar, wVar);
        }
        if (f1Var != null) {
            return new b1(f1Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b1 b1Var = (b1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("viewer");
        aa.c.c(a1.a, false).b(fVar, wVar, b1Var.a);
    }
}
