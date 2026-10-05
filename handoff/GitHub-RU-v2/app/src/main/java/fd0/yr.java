package fd0;

import java.util.List;
import kc0.n40;
import kc0.p40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yr implements aa.a {
    public static final yr a = new yr();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n40 n40Var = null;
        while (eVar.r0(b) == 0) {
            n40Var = (n40) aa.c.b(aa.c.c(wr.a, false)).a(eVar, wVar);
        }
        return new p40(n40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p40 p40Var = (p40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p40Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(wr.a, false)).b(fVar, wVar, p40Var.a);
    }
}
