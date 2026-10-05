package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z4 implements aa.a {
    public static final z4 a = new z4();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        us.a c = us.b.c(eVar, wVar);
        if (str != null) {
            return new l4(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l4 l4Var = (l4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l4Var.a);
        List list = us.b.a;
        us.b.d(fVar, wVar, l4Var.b);
    }
}
