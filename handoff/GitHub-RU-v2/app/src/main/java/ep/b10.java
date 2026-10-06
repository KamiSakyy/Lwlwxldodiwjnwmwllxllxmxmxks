package ep;

import java.util.ArrayList;
import java.util.List;
import jo.lh0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b10 implements aaShadow.a {
    public static final b10 a = new b10();
    public static final List b = sy.d0Shadow.n("contributionDays");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(x00.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new lh0(arrayList);
        }
        k41.b.B(eVar, "contributionDays");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lh0 lh0Var = (lh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lh0Var, "value");
        fVar.z0("contributionDays");
        aa.c.a(aa.c.c(x00.a, false)).e(fVar, wVar, lh0Var.a);
    }
}
