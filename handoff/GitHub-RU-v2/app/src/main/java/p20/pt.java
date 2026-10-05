package p20;

import java.util.List;
import u10.b70;
import u10.z60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pt implements aa.a {
    public static final pt a = new pt();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b70 b70Var = null;
        while (eVar.r0(b) == 0) {
            b70Var = (b70) aa.c.b(aa.c.c(rt.a, false)).a(eVar, wVar);
        }
        return new z60(b70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z60 z60Var = (z60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z60Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(rt.a, false)).b(fVar, wVar, z60Var.a);
    }
}
