package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 implements aa.a {
    public static final x0 a = new x0();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b20.l1 l1Var = null;
        while (eVar.r0(b) == 0) {
            l1Var = (b20.l1) aa.c.b(aa.c.c(y0.a, true)).a(eVar, wVar);
        }
        return new b20.k1(l1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.k1 k1Var = (b20.k1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(y0.a, true)).b(fVar, wVar, k1Var.a);
    }
}
