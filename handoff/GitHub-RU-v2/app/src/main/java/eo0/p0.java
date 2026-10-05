package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 implements aa.a {
    public static final p0 a = new p0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        wq0.a c = wq0.b.c(eVar, wVar);
        if (str != null) {
            return new jn0.i1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.i1 i1Var = (jn0.i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i1Var.a);
        List list = wq0.b.a;
        wq0.b.d(fVar, wVar, i1Var.b);
    }
}
