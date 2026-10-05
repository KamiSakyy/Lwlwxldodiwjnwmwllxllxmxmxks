package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 implements aa.a {
    public static final y4 a = new y4();
    public static final List b = sy.d0.n("createPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.m7 m7Var = null;
        while (eVar.r0(b) == 0) {
            m7Var = (jn0.m7) aa.c.b(aa.c.c(x4.a, false)).a(eVar, wVar);
        }
        return new jn0.n7(m7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.n7 n7Var = (jn0.n7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n7Var, "value");
        fVar.z0("createPullRequest");
        aa.c.b(aa.c.c(x4.a, false)).b(fVar, wVar, n7Var.a);
    }
}
