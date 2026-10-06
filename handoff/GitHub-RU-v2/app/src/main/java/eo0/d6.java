package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d6 implements aaShadow.a {
    public static final d6 a = new d6();
    public static final List b = sy.d0Shadow.n("deletePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.l9 l9Var = null;
        while (eVar.r0(b) == 0) {
            l9Var = (jn0.l9) aa.c.b(aa.c.c(e6.a, false)).a(eVar, wVar);
        }
        return new jn0.k9(l9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.k9 k9Var = (jn0.k9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k9Var, "value");
        fVar.z0("deletePullRequestReviewComment");
        aa.c.b(aa.c.c(e6.a, false)).b(fVar, wVar, k9Var.a);
    }
}
