package ye0;

import aa.w;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "subject", "createdAt"});

    public static e c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        d dVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                dVar = (d) aa.c.c(j.a, true).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (dVar == null) {
            k41.b.B(eVar, "subject");
            throw null;
        }
        if (zonedDateTime != null) {
            return new e(str, str2, aVar, dVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, eVar.c);
        fVar.z0("subject");
        aa.c.c(j.a, true).b(fVar, wVar, eVar.d);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, eVar.e);
    }
}
