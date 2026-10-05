package fd0;

import java.util.List;
import kc0.ac0;
import kc0.bc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xw implements aa.a {
    public static final xw a = new xw();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bc0 bc0Var = null;
        while (eVar.r0(b) == 0) {
            bc0Var = (bc0) aa.c.b(aa.c.c(yw.a, false)).a(eVar, wVar);
        }
        return new ac0(bc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ac0 ac0Var = (ac0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ac0Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(yw.a, false)).b(fVar, wVar, ac0Var.a);
    }
}
