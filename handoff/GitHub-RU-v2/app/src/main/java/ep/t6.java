package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t6 implements aaShadow.a {
    public static final t6 a = new t6();
    public static final List b = sy.d0Shadow.n("deletePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ia iaVar = null;
        while (eVar.r0(b) == 0) {
            iaVar = (jo.ia) aa.c.b(aa.c.c(u6.a, false)).a(eVar, wVar);
        }
        return new jo.ha(iaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ha haVar = (jo.ha) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(haVar, "value");
        fVar.z0("deletePullRequestReviewComment");
        aa.c.b(aa.c.c(u6.a, false)).b(fVar, wVar, haVar.a);
    }
}
