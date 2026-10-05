package is0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q implements aa.a {
    public static final List a = x61.l.r(new String[]{"userLinkedOnlyClosedByPullRequestReferences", "allClosedByPullRequestReferences", "id", "__typename"});

    public static o c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n nVar = null;
        k kVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                nVar = (n) aa.c.b(aa.c.c(t.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                kVar = (k) aa.c.b(aa.c.c(p.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new o(nVar, kVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("userLinkedOnlyClosedByPullRequestReferences");
        aa.c.b(aa.c.c(t.a, false)).b(fVar, wVar, oVar.a);
        fVar.z0("allClosedByPullRequestReferences");
        aa.c.b(aa.c.c(p.a, false)).b(fVar, wVar, oVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oVar.d);
    }
}
