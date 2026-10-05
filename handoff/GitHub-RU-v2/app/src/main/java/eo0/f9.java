package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f9 implements aa.a {
    public static final f9 a = new f9();
    public static final List b = sy.d0.o(new String[]{"trendingRepositories", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(g9.a, true)))).a(eVar, wVar);
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
            return new jn0.ud(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ud udVar = (jn0.ud) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(udVar, "value");
        fVar.z0("trendingRepositories");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(g9.a, true)))).b(fVar, wVar, udVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, udVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, udVar.c);
    }
}
