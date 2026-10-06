package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n1 implements aaShadow.a {
    public static final List a = sy.d0.n("suggestedAssignees");

    public static kc0.s2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.w2 w2Var = null;
        while (eVar.r0(a) == 0) {
            w2Var = (kc0.w2) aa.c.c(r1.a, false).a(eVar, wVar);
        }
        if (w2Var != null) {
            return new kc0.s2(w2Var);
        }
        k41.b.B(eVar, "suggestedAssignees");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.s2 s2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s2Var, "value");
        fVar.z0("suggestedAssignees");
        aa.c.c(r1.a, false).b(fVar, wVar, s2Var.a);
    }
}
