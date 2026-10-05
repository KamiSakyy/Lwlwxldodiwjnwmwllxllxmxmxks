package fd0;

import java.util.List;
import kc0.i30;
import kc0.k30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dr implements aa.a {
    public static final dr a = new dr();
    public static final List b = sy.d0.n("unresolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k30 k30Var = null;
        while (eVar.r0(b) == 0) {
            k30Var = (k30) aa.c.b(aa.c.c(fr.a, false)).a(eVar, wVar);
        }
        return new i30(k30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i30 i30Var = (i30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i30Var, "value");
        fVar.z0("unresolveReviewThread");
        aa.c.b(aa.c.c(fr.a, false)).b(fVar, wVar, i30Var.a);
    }
}
