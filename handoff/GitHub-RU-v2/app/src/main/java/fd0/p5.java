package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p5 implements aaShadow.a {
    public static final p5 a = new p5();
    public static final List b = sy.d0.n("deletePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.r8 r8Var = null;
        while (eVar.r0(b) == 0) {
            r8Var = (kc0.r8) aa.c.b(aa.c.c(q5.a, false)).a(eVar, wVar);
        }
        return new kc0.q8(r8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.q8 q8Var = (kc0.q8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q8Var, "value");
        fVar.z0("deletePullRequestReviewComment");
        aa.c.b(aa.c.c(q5.a, false)).b(fVar, wVar, q8Var.a);
    }
}
