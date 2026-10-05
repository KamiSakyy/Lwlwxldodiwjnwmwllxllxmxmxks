package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 implements aa.a {
    public static final k3 a = new k3();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.l5 l5Var = null;
        while (eVar.r0(b) == 0) {
            l5Var = (kc0.l5) aa.c.b(aa.c.c(m3.a, false)).a(eVar, wVar);
        }
        return new kc0.j5(l5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.j5 j5Var = (kc0.j5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j5Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(m3.a, false)).b(fVar, wVar, j5Var.a);
    }
}
