package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(q0.a, false)))).a(eVar, wVar);
        }
        return new fb0.u0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0.u0 u0Var = (fb0.u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(q0.a, false)))).b(fVar, wVar, u0Var.a);
    }
}
