package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 implements aa.a {
    public static final o2 a = new o2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        eq.c c = eq.d.c(eVar, wVar);
        if (str != null) {
            return new g0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g0 g0Var = (g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g0Var.a);
        List list = eq.d.a;
        eq.d.d(fVar, wVar, g0Var.b);
    }
}
