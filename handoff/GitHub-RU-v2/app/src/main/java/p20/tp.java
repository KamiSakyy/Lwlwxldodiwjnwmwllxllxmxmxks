package p20;

import java.util.List;
import u10.k10;
import u10.m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tp implements aaShadow.a {
    public static final tp a = new tp();
    public static final List b = sy.d0Shadow.n("unresolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10 m10Var = null;
        while (eVar.r0(b) == 0) {
            m10Var = (m10) aa.c.b(aa.c.c(vp.a, false)).a(eVar, wVar);
        }
        return new k10(m10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k10 k10Var = (k10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k10Var, "value");
        fVar.z0("unresolveReviewThread");
        aa.c.b(aa.c.c(vp.a, false)).b(fVar, wVar, k10Var.a);
    }
}
