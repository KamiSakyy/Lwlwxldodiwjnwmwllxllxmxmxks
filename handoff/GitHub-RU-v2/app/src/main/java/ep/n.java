package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = sy.d0.n("addDiscussionPollVote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.s sVar = null;
        while (eVar.r0(b) == 0) {
            sVar = (jo.s) aa.c.b(aa.c.c(m.a, false)).a(eVar, wVar);
        }
        return new jo.u(sVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.u uVar = (jo.u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("addDiscussionPollVote");
        aa.c.b(aa.c.c(m.a, false)).b(fVar, wVar, uVar.a);
    }
}
