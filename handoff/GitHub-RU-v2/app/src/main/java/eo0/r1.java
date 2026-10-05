package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r1 implements aa.a {
    public static final List a = sy.d0.n("suggestedAssignees");

    public static jn0.y2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.c3 c3Var = null;
        while (eVar.r0(a) == 0) {
            c3Var = (jn0.c3) aa.c.c(v1.a, false).a(eVar, wVar);
        }
        if (c3Var != null) {
            return new jn0.y2(c3Var);
        }
        k41.b.B(eVar, "suggestedAssignees");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.y2 y2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y2Var, "value");
        fVar.z0("suggestedAssignees");
        aa.c.c(v1.a, false).b(fVar, wVar, y2Var.a);
    }
}
