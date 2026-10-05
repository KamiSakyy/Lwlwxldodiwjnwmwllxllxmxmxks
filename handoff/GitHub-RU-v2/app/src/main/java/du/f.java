package du;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import m10.sa;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "mergeRefName", "commit", "createdAt"});

    public static c c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        String str3 = null;
        b bVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(d.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                bVar = (b) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
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
        if (str3 == null) {
            k41.b.B(eVar, "mergeRefName");
            throw null;
        }
        if (zonedDateTime != null) {
            return new c(str, str2, aVar, str3, bVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(d.a, true)).b(fVar, wVar, cVar.c);
        fVar.z0("mergeRefName");
        bVar.b(fVar, wVar, cVar.d);
        fVar.z0("commit");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, cVar.e);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, cVar.f);
    }

}
