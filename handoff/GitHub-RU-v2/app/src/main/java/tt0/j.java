package tt0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j implements aa.a {
    public static final List a = x61.l.r(new String[]{"description", "url", "files", "id"});

    public static c c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(g.a, false)))).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (str3 != null) {
            return new c(str, str2, list, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, cVar.a);
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("files");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(g.a, false)))).b(fVar, wVar, cVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.d);
    }
}
