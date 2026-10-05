package ep;

import java.util.List;
import jo.f60;
import jo.g60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nt implements aa.a {
    public static final nt a = new nt();
    public static final List b = sy.d0.n("labelableRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f60 f60Var = null;
        while (eVar.r0(b) == 0) {
            f60Var = (f60) aa.c.b(aa.c.c(mt.a, true)).a(eVar, wVar);
        }
        return new g60(f60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g60 g60Var = (g60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g60Var, "value");
        fVar.z0("labelableRecord");
        aa.c.b(aa.c.c(mt.a, true)).b(fVar, wVar, g60Var.a);
    }
}
