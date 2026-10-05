package cq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "relatedItems"});

    public static j6 c(ea.e eVar, aa.w wVar) {
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
                arrayList = aa.c.a(aa.c.c(k6.a, true)).c(eVar, wVar);
            }
        }
        eVar.s0();
        o6 c = r6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (arrayList != null) {
            return new j6(str, arrayList, c);
        }
        k41.b.B(eVar, "relatedItems");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j6 j6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j6Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, j6Var.a);
        fVar.z0("relatedItems");
        aa.c.a(aa.c.c(k6.a, true)).e(fVar, wVar, j6Var.b);
        List list = r6.a;
        r6.d(fVar, wVar, j6Var.c);
    }
}
