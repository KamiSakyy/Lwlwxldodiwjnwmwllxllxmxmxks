package ep;

import java.util.List;
import jo.ag0;
import jo.xf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b00 implements aaShadow.a {
    public static final b00 a = new b00();
    public static final List b = sy.d0Shadow.n("updatePullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ag0 ag0Var = null;
        while (eVar.r0(b) == 0) {
            ag0Var = (ag0) aa.c.b(aa.c.c(e00.a, false)).a(eVar, wVar);
        }
        return new xf0(ag0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xf0 xf0Var = (xf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xf0Var, "value");
        fVar.z0("updatePullRequestReviewComment");
        aa.c.b(aa.c.c(e00.a, false)).b(fVar, wVar, xf0Var.a);
    }
}
