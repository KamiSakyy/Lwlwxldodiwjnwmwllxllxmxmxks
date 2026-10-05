package bu;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"createdAt", "enqueuer", "reason", "id", "__typename"});

    public static r c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        q qVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 1) {
                qVar = (q) aa.c.b(aa.c.c(s.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new r(zonedDateTime, qVar, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, rVar.a);
        fVar.z0("enqueuer");
        aa.c.b(aa.c.c(s.a, false)).b(fVar, wVar, rVar.b);
        fVar.z0("reason");
        aa.c.i.b(fVar, wVar, rVar.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rVar.e);
    }
}
