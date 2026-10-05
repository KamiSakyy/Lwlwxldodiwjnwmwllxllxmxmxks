package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements aa.a {
    public static final c1 a = new c1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        sd0.n nVar = sd0.n.a;
        sd0.k c = sd0.n.c(eVar, wVar);
        if (str != null) {
            return new kc0.z1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.z1 z1Var = (kc0.z1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, z1Var.a);
        sd0.n nVar = sd0.n.a;
        sd0.n.d(fVar, wVar, z1Var.b);
    }
}
