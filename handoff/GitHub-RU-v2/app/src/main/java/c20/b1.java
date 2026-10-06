package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.a {
    public static final b1 a = new b1();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b20.r1 r1Var = null;
        while (eVar.r0(b) == 0) {
            r1Var = (b20.r1) aa.c.b(aa.c.c(c1.a, true)).a(eVar, wVar);
        }
        return new b20.q1(r1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.q1 q1Var = (b20.q1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q1Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(c1.a, true)).b(fVar, wVar, q1Var.a);
    }
}
