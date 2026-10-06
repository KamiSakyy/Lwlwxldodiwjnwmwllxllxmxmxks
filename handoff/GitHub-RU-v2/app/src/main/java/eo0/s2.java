package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s2 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"requiredStatusChecks", "commits"});

    public static jn0.j4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.m4 m4Var = null;
        jn0.a4 a4Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                m4Var = (jn0.m4) aa.c.c(v2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                a4Var = (jn0.a4) aa.c.c(k2.a, false).a(eVar, wVar);
            }
        }
        if (m4Var == null) {
            k41.b.B(eVar, "requiredStatusChecks");
            throw null;
        }
        if (a4Var != null) {
            return new jn0.j4(m4Var, a4Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.j4 j4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j4Var, "value");
        fVar.z0("requiredStatusChecks");
        aa.c.c(v2.a, false).b(fVar, wVar, j4Var.a);
        fVar.z0("commits");
        aa.c.c(k2.a, false).b(fVar, wVar, j4Var.b);
    }
}
