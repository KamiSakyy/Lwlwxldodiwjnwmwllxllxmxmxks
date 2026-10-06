package p20;

import java.util.List;
import u10.s80;
import u10.u80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class su implements aaShadow.a {
    public static final su a = new su();
    public static final List b = sy.d0.n("contributionCalendar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s80 s80Var = null;
        while (eVar.r0(b) == 0) {
            s80Var = (s80) aa.c.c(qu.a, false).a(eVar, wVar);
        }
        if (s80Var != null) {
            return new u80(s80Var);
        }
        k41.b.B(eVar, "contributionCalendar");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u80 u80Var = (u80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u80Var, "value");
        fVar.z0("contributionCalendar");
        aa.c.c(qu.a, false).b(fVar, wVar, u80Var.a);
    }
}
