package ap0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "relatedItems"});

    public static t c(ea.e eVar, aa.w wVar) {
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
                arrayList = aa.c.a(aa.c.c(v.a, true)).c(eVar, wVar);
            }
        }
        eVar.s0();
        y c = a0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (arrayList != null) {
            return new t(str, arrayList, c);
        }
        k41.b.B(eVar, "relatedItems");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, t tVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, tVar.a);
        fVar.z0("relatedItems");
        aa.c.a(aa.c.c(v.a, true)).e(fVar, wVar, tVar.b);
        List list = a0.a;
        a0.d(fVar, wVar, tVar.c);
    }
}
