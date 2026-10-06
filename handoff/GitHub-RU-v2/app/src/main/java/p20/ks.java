package p20;

import java.util.List;
import u10.m50;
import u10.n50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ks implements aaShadow.a {
    public static final ks a = new ks();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m50 m50Var = null;
        while (eVar.r0(b) == 0) {
            m50Var = (m50) aa.c.b(aa.c.c(js.a, false)).a(eVar, wVar);
        }
        return new n50(m50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n50 n50Var = (n50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n50Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(js.a, false)).b(fVar, wVar, n50Var.a);
    }
}
