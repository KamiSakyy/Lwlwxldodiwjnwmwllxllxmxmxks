package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.n("addPullRequestReviewThreadReply");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.h1 h1Var = null;
        while (eVar.r0(b) == 0) {
            h1Var = (jo.h1) aa.c.b(aa.c.c(n0.a, false)).a(eVar, wVar);
        }
        return new jo.m1(h1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.m1 m1Var = (jo.m1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m1Var, "value");
        fVar.z0("addPullRequestReviewThreadReply");
        aa.c.b(aa.c.c(n0.a, false)).b(fVar, wVar, m1Var.a);
    }
}
