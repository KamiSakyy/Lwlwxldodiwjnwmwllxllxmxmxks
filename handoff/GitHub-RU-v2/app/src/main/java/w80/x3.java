package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x3 implements aa.a {
    public static final x3 a = new x3();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y3.a, true)))).a(eVar, wVar);
        }
        return new t3(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t3 t3Var = (t3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t3Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y3.a, true)))).b(fVar, wVar, t3Var.a);
    }
}
