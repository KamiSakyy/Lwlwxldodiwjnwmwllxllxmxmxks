package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aaShadow.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.n("addPullRequestReviewThreadReply");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.c1 c1Var = null;
        while (eVar.r0(b) == 0) {
            c1Var = (kc0.c1) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
        }
        return new kc0.h1(c1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.h1 h1Var = (kc0.h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("addPullRequestReviewThreadReply");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, h1Var.a);
    }
}
