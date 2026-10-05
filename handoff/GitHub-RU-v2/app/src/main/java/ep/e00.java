package ep;

import java.util.List;
import jo.ag0;
import jo.zf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e00 implements aa.a {
    public static final e00 a = new e00();
    public static final List b = sy.d0.n("pullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zf0 zf0Var = null;
        while (eVar.r0(b) == 0) {
            zf0Var = (zf0) aa.c.b(aa.c.c(d00.a, true)).a(eVar, wVar);
        }
        return new ag0(zf0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ag0 ag0Var = (ag0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ag0Var, "value");
        fVar.z0("pullRequestReviewComment");
        aa.c.b(aa.c.c(d00.a, true)).b(fVar, wVar, ag0Var.a);
    }
}
