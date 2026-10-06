package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y3 implements aaShadow.a {
    public static final List a = sy.d0.n("commits");

    public static kc0.b6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.s5 s5Var = null;
        while (eVar.r0(a) == 0) {
            s5Var = (kc0.s5) aa.c.c(q3.a, false).a(eVar, wVar);
        }
        if (s5Var != null) {
            return new kc0.b6(s5Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.b6 b6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b6Var, "value");
        fVar.z0("commits");
        aa.c.c(q3.a, false).b(fVar, wVar, b6Var.a);
    }
}
