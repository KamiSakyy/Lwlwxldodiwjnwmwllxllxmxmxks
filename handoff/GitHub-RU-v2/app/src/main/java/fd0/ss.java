package fd0;

import java.util.List;
import kc0.v50;
import kc0.x50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ss implements aa.a {
    public static final ss a = new ss();
    public static final List b = sy.d0.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x50 x50Var = null;
        while (eVar.r0(b) == 0) {
            x50Var = (x50) aa.c.b(aa.c.c(us.a, false)).a(eVar, wVar);
        }
        return new v50(x50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v50 v50Var = (v50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v50Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(us.a, false)).b(fVar, wVar, v50Var.a);
    }
}
