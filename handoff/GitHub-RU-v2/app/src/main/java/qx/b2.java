package qx;

import dw.m5;
import dw.n5;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 implements aa.a {
    public static final b2 a = new b2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        m5 c = n5.c(eVar, wVar);
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
        List list = n5.a;
        n5.d(fVar, wVar, l1Var.b);
    }
}
