package n00;

import aa.w;
import java.util.List;
import m00.e0;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0.n("repository");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m00.d0 d0Var = null;
        while (eVar.r0(b) == 0) {
            d0Var = (m00.d0) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
        }
        return new e0(d0Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        e0 e0Var = (e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, e0Var.a);
    }
}
