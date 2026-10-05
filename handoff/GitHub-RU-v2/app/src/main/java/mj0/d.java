package mj0;

import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d implements aa.a {
    public static final List a = l.r(new String[]{"id", "name", "target", "repository", "__typename"});

    public static c c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        b bVar = null;
        a aVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bVar = (b) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                aVar = (a) aa.c.c(e.a, false).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (aVar == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str3 != null) {
            return new c(str, str2, bVar, aVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("target");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, cVar.c);
        fVar.z0("repository");
        aa.c.c(e.a, false).b(fVar, wVar, cVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cVar.e);
    }
}
