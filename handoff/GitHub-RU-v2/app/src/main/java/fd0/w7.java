package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w7 implements aa.a {
    public static final w7 a = new w7();
    public static final List b = sy.d0.n("dismissPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wb wbVar = null;
        while (eVar.r0(b) == 0) {
            wbVar = (kc0.wb) aa.c.b(aa.c.c(x7.a, false)).a(eVar, wVar);
        }
        return new kc0.vb(wbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vb vbVar = (kc0.vb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vbVar, "value");
        fVar.z0("dismissPullRequestReview");
        aa.c.b(aa.c.c(x7.a, false)).b(fVar, wVar, vbVar.a);
    }
}
