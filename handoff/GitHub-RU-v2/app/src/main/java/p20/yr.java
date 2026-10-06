package p20;

import java.util.List;
import u10.t40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yr implements aaShadow.a {
    public static final yr a = new yr();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(wr.a, false)))).a(eVar, wVar);
        }
        return new t40(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t40 t40Var = (t40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t40Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(wr.a, false)))).b(fVar, wVar, t40Var.a);
    }
}
