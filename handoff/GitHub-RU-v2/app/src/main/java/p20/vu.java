package p20;

import java.util.ArrayList;
import java.util.List;
import u10.x80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vu implements aaShadow.a {
    public static final vu a = new vu();
    public static final List b = sy.d0.n("contributionDays");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(ru.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new x80(arrayList);
        }
        k41.b.B(eVar, "contributionDays");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x80 x80Var = (x80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x80Var, "value");
        fVar.z0("contributionDays");
        aa.c.a(aa.c.c(ru.a, false)).e(fVar, wVar, x80Var.a);
    }
}
