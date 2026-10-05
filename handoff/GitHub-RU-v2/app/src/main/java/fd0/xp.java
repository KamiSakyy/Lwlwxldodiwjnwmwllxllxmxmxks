package fd0;

import java.util.List;
import kc0.s10;
import kc0.w10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xp implements aa.a {
    public static final xp a = new xp();
    public static final List b = sy.d0.n("repositoryOwner");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w10 w10Var = null;
        while (eVar.r0(b) == 0) {
            w10Var = (w10) aa.c.b(aa.c.c(bq.a, true)).a(eVar, wVar);
        }
        return new s10(w10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s10 s10Var = (s10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s10Var, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(bq.a, true)).b(fVar, wVar, s10Var.a);
    }
}
