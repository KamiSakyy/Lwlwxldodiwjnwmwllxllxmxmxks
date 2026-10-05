package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 implements aa.a {
    public static final g3 a = new g3();
    public static final List b = sy.d0.n("closePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.b5 b5Var = null;
        while (eVar.r0(b) == 0) {
            b5Var = (jn0.b5) aa.c.b(aa.c.c(f3.a, false)).a(eVar, wVar);
        }
        return new jn0.d5(b5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.d5 d5Var = (jn0.d5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d5Var, "value");
        fVar.z0("closePullRequest");
        aa.c.b(aa.c.c(f3.a, false)).b(fVar, wVar, d5Var.a);
    }
}
