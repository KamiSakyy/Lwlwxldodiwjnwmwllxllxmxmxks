package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o7 implements aa.a {
    public static final o7 a = new o7();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h7 h7Var = null;
        while (eVar.r0(b) == 0) {
            h7Var = (h7) aa.c.b(aa.c.c(p7.a, false)).a(eVar, wVar);
        }
        return new g7(h7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g7 g7Var = (g7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g7Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(p7.a, false)).b(fVar, wVar, g7Var.a);
    }
}
