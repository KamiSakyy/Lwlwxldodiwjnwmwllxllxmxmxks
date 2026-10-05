package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w1 implements aa.a {
    public static final w1 a = new w1();
    public static final List b = sy.d0.n("blockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.d3 d3Var = null;
        while (eVar.r0(b) == 0) {
            d3Var = (kc0.d3) aa.c.b(aa.c.c(v1.a, false)).a(eVar, wVar);
        }
        return new kc0.f3(d3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.f3 f3Var = (kc0.f3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f3Var, "value");
        fVar.z0("blockUser");
        aa.c.b(aa.c.c(v1.a, false)).b(fVar, wVar, f3Var.a);
    }
}
