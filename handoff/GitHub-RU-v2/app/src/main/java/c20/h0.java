package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aa.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b20.r0 r0Var = null;
        while (eVar.r0(b) == 0) {
            r0Var = (b20.r0) aa.c.b(aa.c.c(i0.a, true)).a(eVar, wVar);
        }
        return new b20.q0(r0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.q0 q0Var = (b20.q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(i0.a, true)).b(fVar, wVar, q0Var.a);
    }
}
