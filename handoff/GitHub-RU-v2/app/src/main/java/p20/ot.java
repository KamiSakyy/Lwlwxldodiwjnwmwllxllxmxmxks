package p20;

import java.util.List;
import u10.w60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ot implements aaShadow.a {
    public static final ot a = new ot();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(jt.a, true)))).a(eVar, wVar);
        }
        return new w60(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w60 w60Var = (w60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w60Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(jt.a, true)))).b(fVar, wVar, w60Var.a);
    }
}
