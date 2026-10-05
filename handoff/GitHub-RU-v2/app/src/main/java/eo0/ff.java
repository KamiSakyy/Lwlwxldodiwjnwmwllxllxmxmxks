package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ff implements aa.a {
    public static final ff a = new ff();
    public static final List b = sy.d0.o(new String[]{"repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.wm wmVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wmVar = (jn0.wm) aa.c.b(aa.c.c(lf.a, false)).a(eVar, wVar);
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
            return new jn0.rm(wmVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.rm rmVar = (jn0.rm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rmVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(lf.a, false)).b(fVar, wVar, rmVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rmVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rmVar.c);
    }
}
