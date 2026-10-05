package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 implements aa.a {
    public static final c4 a = new c4();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o2.a, true)))).a(eVar, wVar);
        }
        return new t1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t1 t1Var = (t1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o2.a, true)))).b(fVar, wVar, t1Var.a);
    }
}
