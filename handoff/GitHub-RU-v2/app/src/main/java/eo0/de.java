package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class de implements aa.a {
    public static final de a = new de();
    public static final List b = sy.d0.n("markPullRequestReadyForReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.gl glVar = null;
        while (eVar.r0(b) == 0) {
            glVar = (jn0.gl) aa.c.b(aa.c.c(ee.a, false)).a(eVar, wVar);
        }
        return new jn0.fl(glVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.fl flVar = (jn0.fl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(flVar, "value");
        fVar.z0("markPullRequestReadyForReview");
        aa.c.b(aa.c.c(ee.a, false)).b(fVar, wVar, flVar.a);
    }
}
