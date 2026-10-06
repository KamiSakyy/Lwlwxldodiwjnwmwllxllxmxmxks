package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ze implements aaShadow.a {
    public static final ze a = new ze();
    public static final List b = sy.d0Shadow.n("markPullRequestReadyForReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.lm lmVar = null;
        while (eVar.r0(b) == 0) {
            lmVar = (jo.lm) aa.c.b(aa.c.c(af.a, false)).a(eVar, wVar);
        }
        return new jo.km(lmVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.km kmVar = (jo.km) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kmVar, "value");
        fVar.z0("markPullRequestReadyForReview");
        aa.c.b(aa.c.c(af.a, false)).b(fVar, wVar, kmVar.a);
    }
}
