package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 implements aa.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.n("addPullRequestReviewThreadReply");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.c1 c1Var = null;
        while (eVar.r0(b) == 0) {
            c1Var = (u10.c1) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
        }
        return new u10.h1(c1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.h1 h1Var = (u10.h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("addPullRequestReviewThreadReply");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, h1Var.a);
    }
}
