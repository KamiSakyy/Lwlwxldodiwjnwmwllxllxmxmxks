package ep;

import java.util.ArrayList;
import java.util.List;
import jo.pj0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i20 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerMergeActions"});

    public static pj0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(k20.a, false)).c(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (arrayList != null) {
            return new pj0(str, arrayList);
        }
        k41.b.B(eVar, "viewerMergeActions");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, pj0 pj0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pj0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, pj0Var.a);
        fVar.z0("viewerMergeActions");
        aa.c.a(aa.c.c(k20.a, false)).e(fVar, wVar, pj0Var.b);
    }
}
