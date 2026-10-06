package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s6 implements aa.a {
    public static final s6 a = new s6();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z6.a, true)))).a(eVar, wVar);
        }
        return new f5(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f5 f5Var = (f5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f5Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z6.a, true)))).b(fVar, wVar, f5Var.a);
    }
}
