package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 implements aaShadow.a {
    public static final i1 a = new i1();
    public static final List b = sy.d0Shadow.n("approveDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.j2 j2Var = null;
        while (eVar.r0(b) == 0) {
            j2Var = (kc0.j2) aa.c.b(aa.c.c(h1.a, false)).a(eVar, wVar);
        }
        return new kc0.l2(j2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.l2 l2Var = (kc0.l2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l2Var, "value");
        fVar.z0("approveDeployments");
        aa.c.b(aa.c.c(h1.a, false)).b(fVar, wVar, l2Var.a);
    }
}
