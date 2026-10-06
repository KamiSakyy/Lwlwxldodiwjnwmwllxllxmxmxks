package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(k0.a, true)))).a(eVar, wVar);
        }
        return new a0Shadow(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a0Shadow a0Var = (a0Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(k0.a, true)))).b(fVar, wVar, a0Var.a);
    }
}
