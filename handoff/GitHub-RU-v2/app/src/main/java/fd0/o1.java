package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o1 implements aa.a {
    public static final List a = sy.d0.n("repository");

    public static kc0.t2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.v2 v2Var = null;
        while (eVar.r0(a) == 0) {
            v2Var = (kc0.v2) aa.c.c(q1.a, false).a(eVar, wVar);
        }
        if (v2Var != null) {
            return new kc0.t2(v2Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.t2 t2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t2Var, "value");
        fVar.z0("repository");
        aa.c.c(q1.a, false).b(fVar, wVar, t2Var.a);
    }
}
