package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0.n("addDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l lVar = null;
        while (eVar.r0(b) == 0) {
            lVar = (jo.l) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
        }
        return new jo.p(lVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.p pVar = (jo.p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("addDiscussionComment");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, pVar.a);
    }
}
