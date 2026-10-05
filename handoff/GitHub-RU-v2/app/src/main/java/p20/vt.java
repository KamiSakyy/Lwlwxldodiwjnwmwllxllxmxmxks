package p20;

import java.util.List;
import u10.j70;
import u10.m70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vt implements aa.a {
    public static final vt a = new vt();
    public static final List b = sy.d0.n("updatePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m70 m70Var = null;
        while (eVar.r0(b) == 0) {
            m70Var = (m70) aa.c.b(aa.c.c(yt.a, false)).a(eVar, wVar);
        }
        return new j70(m70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j70 j70Var = (j70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j70Var, "value");
        fVar.z0("updatePullRequestReviewComment");
        aa.c.b(aa.c.c(yt.a, false)).b(fVar, wVar, j70Var.a);
    }
}
