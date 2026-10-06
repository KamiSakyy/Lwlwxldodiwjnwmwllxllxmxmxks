package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 implements aa.a {
    public static final z1 a = new z1();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s1.a, false)))).a(eVar, wVar);
        }
        return new e1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e1 e1Var = (e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s1.a, false)))).b(fVar, wVar, e1Var.a);
    }
}
