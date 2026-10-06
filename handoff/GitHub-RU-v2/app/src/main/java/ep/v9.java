package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v9 implements aaShadow.a {
    public static final v9 a = new v9();
    public static final List b = sy.d0.o("trendingRepositories", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(w9.a, true)))).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
            return new jo.re(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.re reVar = (jo.re) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(reVar, "value");
        fVar.z0("trendingRepositories");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(w9.a, true)))).b(fVar, wVar, reVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, reVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, reVar.c);
    }
}
