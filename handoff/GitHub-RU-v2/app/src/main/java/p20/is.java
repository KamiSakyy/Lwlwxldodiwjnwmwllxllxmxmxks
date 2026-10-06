package p20;

import java.util.List;
import u10.l50;
import u10.n50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class is implements aaShadow.a {
    public static final is a = new is();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n50 n50Var = null;
        while (eVar.r0(b) == 0) {
            n50Var = (n50) aa.c.b(aa.c.c(ks.a, false)).a(eVar, wVar);
        }
        return new l50(n50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l50 l50Var = (l50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l50Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(ks.a, false)).b(fVar, wVar, l50Var.a);
    }
}
