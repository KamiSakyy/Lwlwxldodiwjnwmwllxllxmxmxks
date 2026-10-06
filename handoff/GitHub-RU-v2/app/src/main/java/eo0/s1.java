package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s1 implements aaShadow.a {
    public static final List a = sy.d0.n("repository");

    public static jn0.z2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.b3 b3Var = null;
        while (eVar.r0(a) == 0) {
            b3Var = (jn0.b3) aa.c.c(u1.a, false).a(eVar, wVar);
        }
        if (b3Var != null) {
            return new jn0.z2(b3Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.z2 z2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z2Var, "value");
        fVar.z0("repository");
        aa.c.c(u1.a, false).b(fVar, wVar, z2Var.a);
    }
}
