package ep;

import java.util.List;
import jo.qe0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ez implements aaShadow.a {
    public static final ez a = new ez();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(az.a, true)))).a(eVar, wVar);
        }
        return new qe0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qe0 qe0Var = (qe0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qe0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(az.a, true)))).b(fVar, wVar, qe0Var.a);
    }
}
