package ep;

import java.util.List;
import jo.r80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dv implements aaShadow.a {
    public static final dv a = new dv();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(gvShadow.a, false)))).a(eVar, wVar);
        }
        return new r80(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r80 r80Var = (r80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r80Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(gvShadow.a, false)))).b(fVar, wVar, r80Var.a);
    }
}
