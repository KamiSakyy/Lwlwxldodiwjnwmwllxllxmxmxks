package vx0;

import java.util.List;
import ux0.l1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aa.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        wx0.c c = wx0.f.c(eVar, wVar);
        if (str != null) {
            return new l1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l1 l1Var = (l1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l1Var.a);
        List list = wx0.f.a;
        wx0.f.d(fVar, wVar, l1Var.b);
    }
}
