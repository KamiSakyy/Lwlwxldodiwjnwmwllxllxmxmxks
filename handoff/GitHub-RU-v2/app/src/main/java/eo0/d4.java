package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d4 implements aa.a {
    public static final List a = sy.d0.n("gitObject");

    public static jn0.i6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.b6 b6Var = null;
        while (eVar.r0(a) == 0) {
            b6Var = (jn0.b6) aa.c.b(aa.c.c(w3.a, true)).a(eVar, wVar);
        }
        return new jn0.i6(b6Var);
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.i6 i6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i6Var, "value");
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(w3.a, true)).b(fVar, wVar, i6Var.a);
    }
}
