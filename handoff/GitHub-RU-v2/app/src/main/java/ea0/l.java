package ea0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l implements aa.a {
    public static final List a = x61.l.r(new String[]{"dashboardPinnedItems", "id", "__typename"});

    public static j c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g gVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                gVar = (g) aa.c.c(k.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (gVar == null) {
            k41.b.B(eVar, "dashboardPinnedItems");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new j(gVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("dashboardPinnedItems");
        aa.c.c(k.a, false).b(fVar, wVar, jVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jVar.c);
    }
}
