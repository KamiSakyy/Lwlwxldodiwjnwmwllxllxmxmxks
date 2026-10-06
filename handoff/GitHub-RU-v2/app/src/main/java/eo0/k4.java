package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 implements aaShadow.a {
    public static final k4 a = new k4();
    public static final List b = sy.d0Shadow.n("__typename");

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
            return new jn0.r6(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.r6 r6Var = (jn0.r6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r6Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, r6Var.a);
        List list = wq0.b.a;
        wq0.b.d(fVar, wVar, r6Var.b);
    }
}
