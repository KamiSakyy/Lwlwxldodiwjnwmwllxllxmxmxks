package p20;

import java.util.List;
import u10.o60;
import u10.v60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ft implements aa.a {
    public static final ft a = new ft();
    public static final List b = sy.d0.n("requestReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v60 v60Var = null;
        while (eVar.r0(b) == 0) {
            v60Var = (v60) aa.c.b(aa.c.c(nt.a, false)).a(eVar, wVar);
        }
        return new o60(v60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o60 o60Var = (o60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o60Var, "value");
        fVar.z0("requestReviews");
        aa.c.b(aa.c.c(nt.a, false)).b(fVar, wVar, o60Var.a);
    }
}
