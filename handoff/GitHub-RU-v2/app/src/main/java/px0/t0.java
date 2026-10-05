package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 implements aa.a {
    public static final t0 a = new t0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s0.a, false)))).a(eVar, wVar);
        }
        return new ox0.w0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ox0.w0 w0Var = (ox0.w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s0.a, false)))).b(fVar, wVar, w0Var.a);
    }
}
