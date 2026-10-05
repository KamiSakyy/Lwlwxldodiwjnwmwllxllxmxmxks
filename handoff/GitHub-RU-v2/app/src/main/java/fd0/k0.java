package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.d1 d1Var = null;
        while (eVar.r0(b) == 0) {
            d1Var = (kc0.d1) aa.c.b(aa.c.c(l0.a, true)).a(eVar, wVar);
        }
        return new kc0.c1(d1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.c1 c1Var = (kc0.c1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c1Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(l0.a, true)).b(fVar, wVar, c1Var.a);
    }
}
