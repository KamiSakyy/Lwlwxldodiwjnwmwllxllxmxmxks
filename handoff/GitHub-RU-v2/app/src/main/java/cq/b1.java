package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.a {
    public static final b1 a = new b1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        w0 c = x0.c(eVar, wVar);
        if (str != null) {
            return new y0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y0 y0Var = (y0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, y0Var.a);
        List list = x0.a;
        x0.d(fVar, wVar, y0Var.b);
    }
}
