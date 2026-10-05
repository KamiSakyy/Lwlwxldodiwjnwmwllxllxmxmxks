package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n implements aa.a {
    public static final List a = x61.l.r(new String[]{"fields", "id", "__typename"});

    public static l c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k kVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                kVar = (k) aa.c.c(m.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (kVar == null) {
            k41.b.B(eVar, "fields");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l(kVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, l lVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("fields");
        aa.c.c(m.a, true).b(fVar, wVar, lVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lVar.c);
    }
}
