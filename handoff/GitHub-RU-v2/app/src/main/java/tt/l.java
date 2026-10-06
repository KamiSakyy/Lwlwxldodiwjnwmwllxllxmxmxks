package tt;

import aa.w;
import java.util.List;
import m10.n40;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = d0Shadow.o("id", "viewerPermission", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        n40 n40Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                n40Var = (n40) aa.c.b(n10.b.A).a(eVar, wVar);
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
            return new d(str, n40Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d dVar = (d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("viewerPermission");
        aa.c.b(n10.b.A).b(fVar, wVar, dVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dVar.c);
    }
}
