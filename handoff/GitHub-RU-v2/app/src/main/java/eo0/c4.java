package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c4 implements aaShadow.a {
    public static final List a = sy.d0.n("commits");

    public static jn0.h6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.y5 y5Var = null;
        while (eVar.r0(a) == 0) {
            y5Var = (jn0.y5) aa.c.c(u3.a, false).a(eVar, wVar);
        }
        if (y5Var != null) {
            return new jn0.h6(y5Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.h6 h6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h6Var, "value");
        fVar.z0("commits");
        aa.c.c(u3.a, false).b(fVar, wVar, h6Var.a);
    }
}
