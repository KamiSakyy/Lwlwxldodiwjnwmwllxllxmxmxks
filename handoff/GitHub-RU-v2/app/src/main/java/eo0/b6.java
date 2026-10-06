package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b6 implements aaShadow.a {
    public static final b6 a = new b6();
    public static final List b = sy.d0.n("deleteRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.h9 h9Var = null;
        while (eVar.r0(b) == 0) {
            h9Var = (jn0.h9) aa.c.b(aa.c.c(c6.a, false)).a(eVar, wVar);
        }
        return new jn0.g9(h9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.g9 g9Var = (jn0.g9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g9Var, "value");
        fVar.z0("deleteRef");
        aa.c.b(aa.c.c(c6.a, false)).b(fVar, wVar, g9Var.a);
    }
}
