package sa0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class s implements aa.a {
    public static final s a = new s();
    public static final List b = d0Shadow.n("nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(t.a, true)))).a(eVar, wVar);
        }
        return new ra0.d0(list);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ra0.d0Shadow d0Var = (ra0.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(t.a, true)))).b(fVar, wVar, d0Var.a);
    }
}
