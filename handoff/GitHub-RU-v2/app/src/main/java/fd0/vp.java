package fd0;

import java.util.ArrayList;
import java.util.List;
import kc0.o10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vp implements aa.a {
    public static final vp a = new vp();
    public static final List b = sy.d0.n("spokenLanguages");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.b(aa.c.c(wp.a, false))).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new o10(arrayList);
        }
        k41.b.B(eVar, "spokenLanguages");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o10 o10Var = (o10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o10Var, "value");
        fVar.z0("spokenLanguages");
        aa.c.a(aa.c.b(aa.c.c(wp.a, false))).e(fVar, wVar, o10Var.a);
    }
}
