package fd0;

import java.util.List;
import kc0.j30;
import kc0.k30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fr implements aa.a {
    public static final fr a = new fr();
    public static final List b = sy.d0.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j30 j30Var = null;
        while (eVar.r0(b) == 0) {
            j30Var = (j30) aa.c.b(aa.c.c(er.a, true)).a(eVar, wVar);
        }
        return new k30(j30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k30 k30Var = (k30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k30Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(er.a, true)).b(fVar, wVar, k30Var.a);
    }
}
