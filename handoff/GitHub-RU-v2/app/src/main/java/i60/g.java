package i60;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "userLinkedOnlyClosingIssueReferences", "allClosingIssueReferences", "__typename"});

    public static e c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        d dVar = null;
        a aVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                dVar = (d) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new e(str, dVar, aVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("userLinkedOnlyClosingIssueReferences");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, eVar.b);
        fVar.z0("allClosingIssueReferences");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, eVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, eVar.d);
    }

}
