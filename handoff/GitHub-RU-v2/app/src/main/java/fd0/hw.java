package fd0;

import java.util.ArrayList;
import java.util.List;
import kc0.xa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hw implements aa.a {
    public static final hw a = new hw();
    public static final List b = sy.d0.n("contributionDays");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(dw.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new xa0(arrayList);
        }
        k41.b.B(eVar, "contributionDays");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xa0 xa0Var = (xa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xa0Var, "value");
        fVar.z0("contributionDays");
        aa.c.a(aa.c.c(dw.a, false)).e(fVar, wVar, xa0Var.a);
    }
}
