package hy0;

import gy0.a0;
import gy0.g0;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z implements aa.a {
    public static final List a = d0Shadow.n("groups");

    public static g0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a0 a0Var = null;
        while (eVar.r0(a) == 0) {
            a0Var = (a0) aa.c.c(t.a, false).a(eVar, wVar);
        }
        if (a0Var != null) {
            return new g0(a0Var);
        }
        k41.b.B(eVar, "groups");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g0 g0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("groups");
        aa.c.c(t.a, false).b(fVar, wVar, g0Var.a);
    }
}
