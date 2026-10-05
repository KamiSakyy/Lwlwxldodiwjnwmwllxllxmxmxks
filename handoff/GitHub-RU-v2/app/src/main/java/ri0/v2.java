package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v2 implements aa.a {
    public static final v2 a = new v2();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(a3.a, false)))).a(eVar, wVar);
        }
        return new f2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f2 f2Var = (f2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f2Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(a3.a, false)))).b(fVar, wVar, f2Var.a);
    }
}
