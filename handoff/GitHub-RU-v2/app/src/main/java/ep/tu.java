package ep;

import java.util.List;
import jo.c80;
import jo.f80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tuShadow implements aaShadow.a {
    public static final tuShadow a = new tuShadow();
    public static final List b = sy.d0.n("submitPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f80 f80Var = null;
        while (eVar.r0(b) == 0) {
            f80Var = (f80) aa.c.b(aa.c.c(wu.a, false)).a(eVar, wVar);
        }
        return new c80(f80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c80 c80Var = (c80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c80Var, "value");
        fVar.z0("submitPullRequestReview");
        aa.c.b(aa.c.c(wu.a, false)).b(fVar, wVar, c80Var.a);
    }
}
