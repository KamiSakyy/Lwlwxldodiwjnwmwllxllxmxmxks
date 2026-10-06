package fd0;

import java.util.List;
import kc0.m50;
import kc0.n50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class os implements aaShadow.a {
    public static final os a = new os();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m50 m50Var = null;
        while (eVar.r0(b) == 0) {
            m50Var = (m50) aa.c.b(aa.c.c(ns.a, true)).a(eVar, wVar);
        }
        return new n50(m50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n50 n50Var = (n50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n50Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(ns.a, true)).b(fVar, wVar, n50Var.a);
    }
}
