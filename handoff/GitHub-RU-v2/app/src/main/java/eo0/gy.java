package eo0;

import java.util.List;
import jn0.jd0;
import jn0.md0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gy implements aaShadow.a {
    public static final gy a = new gy();
    public static final List b = sy.d0Shadow.n("updatePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        md0 md0Var = null;
        while (eVar.r0(b) == 0) {
            md0Var = (md0) aa.c.b(aa.c.c(jy.a, false)).a(eVar, wVar);
        }
        return new jd0(md0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jd0 jd0Var = (jd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jd0Var, "value");
        fVar.z0("updatePullRequestReviewComment");
        aa.c.b(aa.c.c(jy.a, false)).b(fVar, wVar, jd0Var.a);
    }
}
