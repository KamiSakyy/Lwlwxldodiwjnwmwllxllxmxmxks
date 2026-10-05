package sz;

import java.util.List;
import rz.d1;
import rz.f1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0.n("updateProjectV2ItemFieldValue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f1 f1Var = null;
        while (eVar.r0(b) == 0) {
            f1Var = (f1) aa.c.b(aa.c.c(l0.a, false)).a(eVar, wVar);
        }
        return new d1(f1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d1 d1Var = (d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("updateProjectV2ItemFieldValue");
        aa.c.b(aa.c.c(l0.a, false)).b(fVar, wVar, d1Var.a);
    }
}
