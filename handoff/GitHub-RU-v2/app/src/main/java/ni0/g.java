package ni0;

import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"id", "projects"});

    public static d c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        c cVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                cVar = (c) aa.c.c(h.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (cVar != null) {
            return new d(str, cVar);
        }
        k41.b.B(eVar, "projects");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, dVar.a);
        fVar.z0("projects");
        aa.c.c(h.a, false).b(fVar, wVar, dVar.b);
    }
}
