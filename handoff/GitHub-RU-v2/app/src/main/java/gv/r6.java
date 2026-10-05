package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r6 implements aa.a {
    public static final r6 a = new r6();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(a7.a, true)))).a(eVar, wVar);
        }
        return new e5(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e5 e5Var = (e5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e5Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(a7.a, true)))).b(fVar, wVar, e5Var.a);
    }
}
