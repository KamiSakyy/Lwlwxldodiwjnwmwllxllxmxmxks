package eo0;

import java.util.List;
import jn0.se0;
import jn0.ue0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dz implements aa.a {
    public static final dz a = new dz();
    public static final List b = sy.d0.n("contributionCalendar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        se0 se0Var = null;
        while (eVar.r0(b) == 0) {
            se0Var = (se0) aa.c.c(bz.a, false).a(eVar, wVar);
        }
        if (se0Var != null) {
            return new ue0(se0Var);
        }
        k41.b.B(eVar, "contributionCalendar");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ue0 ue0Var = (ue0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ue0Var, "value");
        fVar.z0("contributionCalendar");
        aa.c.c(bz.a, false).b(fVar, wVar, ue0Var.a);
    }
}
