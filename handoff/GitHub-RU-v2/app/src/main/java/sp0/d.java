package sp0;

import aa.w;
import ea.e;
import ea.f;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import pz0.o7;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "createdAt", "currentRefName", "previousRefName"});

    public static b c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 4) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
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
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "currentRefName");
            throw null;
        }
        if (str4 != null) {
            return new b(str, str2, aVar, zonedDateTime, str3, str4);
        }
        k41.b.B(eVar, "previousRefName");
        throw null;
    }

    public static void d(f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, bVar.c);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, bVar.d);
        fVar.z0("currentRefName");
        bVar2.b(fVar, wVar, bVar.e);
        fVar.z0("previousRefName");
        bVar2.b(fVar, wVar, bVar.f);
    }
}
