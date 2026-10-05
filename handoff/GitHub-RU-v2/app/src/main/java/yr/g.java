package yr;

import aa.w;
import java.util.List;
import k71.k;
import m10.kc;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o("__typename", "state", "environment", "latestStatus", "id");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        kc kcVar = null;
        String str2 = null;
        c cVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                kcVar = (kc) aa.c.b(n10.a.x).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                cVar = (c) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 != null) {
            return new b(str, kcVar, str2, cVar, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("state");
        aa.c.b(n10.a.x).b(fVar, wVar, bVar.b);
        fVar.z0("environment");
        aa.c.i.b(fVar, wVar, bVar.c);
        fVar.z0("latestStatus");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, bVar.d);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.e);
    }
}
