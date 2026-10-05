package ep;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tg implements aa.a {
    public static final tg a = new tg();
    public static final List b = sy.d0.o("allFeatures", "disclaimers", "paywallProducts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                arrayList = aa.c.a(aa.c.c(qg.a, false)).c(eVar, wVar);
            } else if (r0 == 1) {
                arrayList2 = aa.c.a(aa.c.a).c(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                arrayList3 = aa.c.a(aa.c.c(ug.a, true)).c(eVar, wVar);
            }
        }
        if (arrayList == null) {
            k41.b.B(eVar, "allFeatures");
            throw null;
        }
        if (arrayList2 == null) {
            k41.b.B(eVar, "disclaimers");
            throw null;
        }
        if (arrayList3 != null) {
            return new jo.uo(arrayList, arrayList2, arrayList3);
        }
        k41.b.B(eVar, "paywallProducts");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.uo uoVar = (jo.uo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uoVar, "value");
        fVar.z0("allFeatures");
        aa.c.a(aa.c.c(qg.a, false)).e(fVar, wVar, uoVar.a);
        fVar.z0("disclaimers");
        aa.c.a(aa.c.a).e(fVar, wVar, uoVar.b);
        fVar.z0("paywallProducts");
        aa.c.a(aa.c.c(ug.a, true)).e(fVar, wVar, uoVar.c);
    }
}
