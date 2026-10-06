package fd0;

import java.util.List;
import kc0.sa0;
import kc0.ua0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ew implements aaShadow.a {
    public static final ew a = new ew();
    public static final List b = sy.d0Shadow.n("contributionCalendar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        sa0 sa0Var = null;
        while (eVar.r0(b) == 0) {
            sa0Var = (sa0) aa.c.c(cw.a, false).a(eVar, wVar);
        }
        if (sa0Var != null) {
            return new ua0(sa0Var);
        }
        k41.b.B(eVar, "contributionCalendar");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ua0 ua0Var = (ua0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ua0Var, "value");
        fVar.z0("contributionCalendar");
        aa.c.c(cw.a, false).b(fVar, wVar, ua0Var.a);
    }
}
