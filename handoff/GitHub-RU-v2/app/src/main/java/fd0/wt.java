package fd0;

import java.util.List;
import kc0.o70;
import kc0.z70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wt implements aaShadow.a {
    public static final wt a = new wt();
    public static final List b = sy.d0.n("updatePullRequestBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z70 z70Var = null;
        while (eVar.r0(b) == 0) {
            z70Var = (z70) aa.c.b(aa.c.c(hu.a, false)).a(eVar, wVar);
        }
        return new o70(z70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o70 o70Var = (o70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o70Var, "value");
        fVar.z0("updatePullRequestBranch");
        aa.c.b(aa.c.c(hu.a, false)).b(fVar, wVar, o70Var.a);
    }
}
