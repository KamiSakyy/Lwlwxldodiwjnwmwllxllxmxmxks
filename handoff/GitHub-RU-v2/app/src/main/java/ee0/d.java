package ee0;

import aa.w;
import ea.e;
import ea.f;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d implements aa.a {
    public static final List a = l.r(new String[]{"id", "actor", "createdAt", "__typename"});

    public static b c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                aVar = (a) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
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
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str2 != null) {
            return new b(str, aVar, zonedDateTime, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("actor");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, bVar.b);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, bVar.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, bVar.d);
    }
}
