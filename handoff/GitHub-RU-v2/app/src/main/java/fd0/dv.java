package fd0;

import java.util.List;
import kc0.a90;
import kc0.b90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dv implements aa.a {
    public static final dv a = new dv();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a90 a90Var = null;
        while (eVar.r0(b) == 0) {
            a90Var = (a90) aa.c.b(aa.c.c(cv.a, false)).a(eVar, wVar);
        }
        return new b90(a90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b90 b90Var = (b90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b90Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(cv.a, false)).b(fVar, wVar, b90Var.a);
    }
}
