package ea0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 implements aa.a {
    public static final w1 a = new w1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        r70.f c = r70.h.c(eVar, wVar);
        if (str != null) {
            return new h1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h1 h1Var = (h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h1Var.a);
        List list = r70.h.a;
        r70.h.d(fVar, wVar, h1Var.b);
    }
}
