package fd0;

import java.util.List;
import kc0.n20;
import kc0.w20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mq implements aaShadow.a {
    public static final mq a = new mq();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w20 w20Var = null;
        while (eVar.r0(b) == 0) {
            w20Var = (w20) aa.c.b(aa.c.c(vq.a, false)).a(eVar, wVar);
        }
        return new n20(w20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n20 n20Var = (n20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n20Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(vq.a, false)).b(fVar, wVar, n20Var.a);
    }
}
