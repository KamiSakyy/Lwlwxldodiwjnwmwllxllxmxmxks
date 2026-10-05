package n00;

import aa.w;
import java.util.List;
import m00.c0;
import m00.e0;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0.n("updateRepository");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e0 e0Var = null;
        while (eVar.r0(b) == 0) {
            e0Var = (e0) aa.c.b(aa.c.c(r.a, false)).a(eVar, wVar);
        }
        return new c0(e0Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("updateRepository");
        aa.c.b(aa.c.c(r.a, false)).b(fVar, wVar, c0Var.a);
    }
}
