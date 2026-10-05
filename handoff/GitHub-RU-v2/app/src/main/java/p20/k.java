package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0.n("addDiscussionPollVote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (u10.n) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
        }
        return new u10.p(nVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.p pVar = (u10.p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("addDiscussionPollVote");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, pVar.a);
    }
}
