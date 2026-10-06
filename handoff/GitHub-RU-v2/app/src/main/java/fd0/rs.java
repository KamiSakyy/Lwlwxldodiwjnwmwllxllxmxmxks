package fd0;

import java.util.List;
import kc0.p50;
import kc0.s50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rs implements aaShadow.a {
    public static final rs a = new rs();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p50 p50Var = null;
        while (eVar.r0(b) == 0) {
            p50Var = (p50) aa.c.b(aa.c.c(ps.a, true)).a(eVar, wVar);
        }
        return new s50(p50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s50 s50Var = (s50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s50Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(ps.a, true)).b(fVar, wVar, s50Var.a);
    }
}
