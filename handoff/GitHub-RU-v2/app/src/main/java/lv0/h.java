package lv0;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "actor", "subIssue", "createdAt"});

    public static d c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        c cVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                cVar = (c) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
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
        if (zonedDateTime != null) {
            return new d(str, str2, aVar, cVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, dVar.c);
        fVar.z0("subIssue");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, dVar.d);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, dVar.e);
    }
}
