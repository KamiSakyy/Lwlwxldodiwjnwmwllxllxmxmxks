package sz;

import java.util.List;
import rz.i1;
import rz.j1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0Shadow.n("updateProjectV2LastViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j1 j1Var = null;
        while (eVar.r0(b) == 0) {
            j1Var = (j1) aa.c.b(aa.c.c(n0.a, false)).a(eVar, wVar);
        }
        return new i1(j1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("updateProjectV2LastViewed");
        aa.c.b(aa.c.c(n0.a, false)).b(fVar, wVar, i1Var.a);
    }
}
