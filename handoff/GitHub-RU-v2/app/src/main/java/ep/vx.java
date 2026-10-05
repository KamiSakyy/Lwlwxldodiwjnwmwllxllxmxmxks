package ep;

import java.util.List;
import jo.sc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vx implements aa.a {
    public static final vx a = new vx();
    public static final List b = sy.d0.n("filters");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(ux.a, true))).a(eVar, wVar);
        }
        return new sc0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sc0 sc0Var = (sc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sc0Var, "value");
        fVar.z0("filters");
        aa.c.b(aa.c.a(aa.c.c(ux.a, true))).b(fVar, wVar, sc0Var.a);
    }
}
