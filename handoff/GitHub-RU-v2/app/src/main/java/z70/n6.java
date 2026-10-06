package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n6 implements aa.a {
    public static final n6 a = new n6();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c6.a, false)))).a(eVar, wVar);
        }
        return new a5(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a5 a5Var = (a5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a5Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c6.a, false)))).b(fVar, wVar, a5Var.a);
    }
}
