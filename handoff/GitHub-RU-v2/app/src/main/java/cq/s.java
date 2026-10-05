package cq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "relatedItems"});

    public static r c(ea.e eVar, aa.w wVar) {
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
                arrayList = aa.c.a(aa.c.c(t.a, true)).c(eVar, wVar);
            }
        }
        eVar.s0();
        w c = y.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (arrayList != null) {
            return new r(str, arrayList, c);
        }
        k41.b.B(eVar, "relatedItems");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rVar.a);
        fVar.z0("relatedItems");
        aa.c.a(aa.c.c(t.a, true)).e(fVar, wVar, rVar.b);
        List list = y.a;
        y.d(fVar, wVar, rVar.c);
    }
}
