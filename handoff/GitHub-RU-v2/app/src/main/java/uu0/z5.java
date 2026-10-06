package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 implements aa.a {
    public static final z5 a = new z5();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        mw0.a c = mw0.b.c(eVar, wVar);
        if (str != null) {
            return new t5(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t5 t5Var = (t5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t5Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, t5Var.a);
        List list = mw0.b.a;
        mw0.b.d(fVar, wVar, t5Var.b);
    }
}
