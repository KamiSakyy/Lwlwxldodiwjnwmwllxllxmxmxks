package bm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url"});

    public static am0.r c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new am0.r(str, str2);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, am0.r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, rVar.b);
    }
}
