package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 implements aaShadow.a {
    public static final j1 a = new j1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cq.t0 t0Var = cq.t0.a;
        cq.q0 c = cq.t0.c(eVar, wVar);
        if (str != null) {
            return new jo.k2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k2 k2Var = (jo.k2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, k2Var.a);
        cq.t0 t0Var = cq.t0.a;
        cq.t0.d(fVar, wVar, k2Var.b);
    }
}
