package fd0;

import java.util.List;
import kc0.v60;
import kc0.x60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lt implements aa.a {
    public static final lt a = new lt();
    public static final List b = sy.d0.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x60 x60Var = null;
        while (eVar.r0(b) == 0) {
            x60Var = (x60) aa.c.b(aa.c.c(nt.a, false)).a(eVar, wVar);
        }
        return new v60(x60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v60 v60Var = (v60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v60Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(nt.a, false)).b(fVar, wVar, v60Var.a);
    }
}
