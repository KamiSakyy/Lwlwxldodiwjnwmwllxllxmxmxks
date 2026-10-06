package ih0;

import aa.w;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c implements aa.a {
    public static final List a = x61.l.r(new String[]{"createdAt", "enqueuer", "id", "__typename"});

    public static b c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        a aVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
            } else if (r0 == 1) {
                aVar = (a) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new b(zonedDateTime, aVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, bVar.a);
        fVar.z0("enqueuer");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, bVar.b);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, bVar.d);
    }

    public Object b(Object p1) { return null; }
    public static final Object f = null;
    public static final Object i = null;
}
