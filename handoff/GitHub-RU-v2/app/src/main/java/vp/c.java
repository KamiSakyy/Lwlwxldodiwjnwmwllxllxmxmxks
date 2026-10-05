package vp;

import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0;
import up.d;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.o("featureFlags", "id", "__typename");

    public final Object a(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(b.a, false))).a(eVar, wVar);
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
            return new d(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        d dVar = (d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("featureFlags");
        aa.c.b(aa.c.a(aa.c.c(b.a, false))).b(fVar, wVar, dVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dVar.c);
    }
}
