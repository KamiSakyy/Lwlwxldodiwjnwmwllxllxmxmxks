package cq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"title", "plans"});

    public static r2 c(ea.e eVar, aa.w wVar) {
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
                arrayList = aa.c.a(aa.c.c(t2.a, true)).c(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (arrayList != null) {
            return new r2(str, arrayList);
        }
        k41.b.B(eVar, "plans");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r2 r2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r2Var, "value");
        fVar.z0("title");
        aa.c.a.b(fVar, wVar, r2Var.a);
        fVar.z0("plans");
        aa.c.a(aa.c.c(t2.a, true)).e(fVar, wVar, r2Var.b);
    }
}
