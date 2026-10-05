package cq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"title", "planRows"});

    public static n2 c(ea.e eVar, aa.w wVar) {
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
                arrayList = aa.c.a(aa.c.c(p2.a, true)).c(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (arrayList != null) {
            return new n2(str, arrayList);
        }
        k41.b.B(eVar, "planRows");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n2 n2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n2Var, "value");
        fVar.z0("title");
        aa.c.a.b(fVar, wVar, n2Var.a);
        fVar.z0("planRows");
        aa.c.a(aa.c.c(p2.a, true)).e(fVar, wVar, n2Var.b);
    }
}
