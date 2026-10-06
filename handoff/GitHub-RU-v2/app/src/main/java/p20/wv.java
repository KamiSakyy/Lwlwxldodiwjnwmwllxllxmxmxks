package p20;

import java.util.List;
import u10.ta0;
import u10.xa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wv implements aaShadow.a {
    public static final wv a = new wv();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xa0 xa0Var = null;
        while (eVar.r0(b) == 0) {
            xa0Var = (xa0) aa.c.c(aw.a, false).a(eVar, wVar);
        }
        if (xa0Var != null) {
            return new ta0(xa0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ta0 ta0Var = (ta0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ta0Var, "value");
        fVar.z0("viewer");
        aa.c.c(aw.a, false).b(fVar, wVar, ta0Var.a);
    }
}
