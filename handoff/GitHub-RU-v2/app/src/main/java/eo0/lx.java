package eo0;

import java.util.List;
import jn0.hc0;
import jn0.kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lx implements aaShadow.a {
    public static final lx a = new lx();
    public static final List b = sy.d0Shadow.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0 kc0Var = null;
        while (eVar.r0(b) == 0) {
            kc0Var = (kc0) aa.c.b(aa.c.c(ox.a, false)).a(eVar, wVar);
        }
        return new hc0(kc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hc0 hc0Var = (hc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hc0Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(ox.a, false)).b(fVar, wVar, hc0Var.a);
    }
}
