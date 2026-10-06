package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements aa.a {
    public static final n3 a = new n3();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o3.a, false)))).a(eVar, wVar);
        }
        return new g3(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g3 g3Var = (g3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g3Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o3.a, false)))).b(fVar, wVar, g3Var.a);
    }
}
