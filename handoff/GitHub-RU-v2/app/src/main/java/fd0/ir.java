package fd0;

import java.util.List;
import kc0.r30;
import kc0.s30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ir implements aa.a {
    public static final ir a = new ir();
    public static final List b = sy.d0.n("unblockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s30 s30Var = null;
        while (eVar.r0(b) == 0) {
            s30Var = (s30) aa.c.b(aa.c.c(jr.a, false)).a(eVar, wVar);
        }
        return new r30(s30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r30 r30Var = (r30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r30Var, "value");
        fVar.z0("unblockUser");
        aa.c.b(aa.c.c(jr.a, false)).b(fVar, wVar, r30Var.a);
    }
}
