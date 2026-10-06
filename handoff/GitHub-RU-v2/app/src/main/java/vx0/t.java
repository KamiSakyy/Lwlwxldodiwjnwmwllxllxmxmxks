package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = sy.d0Shadow.n("sortValues");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(w.a, false))).a(eVar, wVar);
        }
        return new ux0.f0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.f0 f0Var = (ux0.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("sortValues");
        aa.c.b(aa.c.a(aa.c.c(w.a, false))).b(fVar, wVar, f0Var.a);
    }
}
