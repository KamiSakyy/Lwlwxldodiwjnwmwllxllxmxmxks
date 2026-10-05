package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0.n("addDiscussionPollVote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (kc0.n) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
        }
        return new kc0.p(nVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.p pVar = (kc0.p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("addDiscussionPollVote");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, pVar.a);
    }
}
