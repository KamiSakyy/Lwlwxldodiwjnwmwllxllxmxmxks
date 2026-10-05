package qy0;

import aa.w;
import java.util.List;
import py0.f0;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0.n("updateRepository");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f0 f0Var = null;
        while (eVar.r0(b) == 0) {
            f0Var = (f0) aa.c.b(aa.c.c(r.a, false)).a(eVar, wVar);
        }
        return new py0.d0(f0Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        py0.d0 d0Var = (py0.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("updateRepository");
        aa.c.b(aa.c.c(r.a, false)).b(fVar, wVar, d0Var.a);
    }
}
