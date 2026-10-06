package qy0;

import aa.w;
import java.util.List;
import py0.e0;
import py0.f0;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0Shadow.n("repository");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e0 e0Var = null;
        while (eVar.r0(b) == 0) {
            e0Var = (e0) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
        }
        return new f0(e0Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f0 f0Var = (f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, f0Var.a);
    }
}
