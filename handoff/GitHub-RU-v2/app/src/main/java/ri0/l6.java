package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 implements aa.a {
    public static final l6 a = new l6();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(t6.a, true)))).a(eVar, wVar);
        }
        return new w4(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w4 w4Var = (w4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w4Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(t6.a, true)))).b(fVar, wVar, w4Var.a);
    }
}
