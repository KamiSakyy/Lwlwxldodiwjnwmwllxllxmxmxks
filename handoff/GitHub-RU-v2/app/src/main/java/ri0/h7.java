package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h7 implements aa.a {
    public static final h7 a = new h7();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s6.a, true)))).a(eVar, wVar);
        }
        return new r5(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r5 r5Var = (r5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r5Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s6.a, true)))).b(fVar, wVar, r5Var.a);
    }
}
