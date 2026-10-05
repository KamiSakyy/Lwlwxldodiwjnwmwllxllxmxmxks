package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yc implements aa.a {
    public static final yc a = new yc();
    public static final List b = sy.d0.n("markPullRequestReadyForReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.pj pjVar = null;
        while (eVar.r0(b) == 0) {
            pjVar = (kc0.pj) aa.c.b(aa.c.c(zc.a, false)).a(eVar, wVar);
        }
        return new kc0.oj(pjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.oj ojVar = (kc0.oj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ojVar, "value");
        fVar.z0("markPullRequestReadyForReview");
        aa.c.b(aa.c.c(zc.a, false)).b(fVar, wVar, ojVar.a);
    }
}
