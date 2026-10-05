package as;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import m10.sa;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "createdAt", "deploymentStatus", "pullRequest"});

    public static e c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        c cVar = null;
        d dVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 4) {
                cVar = (c) aa.c.c(i.a, false).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                dVar = (d) aa.c.c(j.a, false).a(eVar, wVar);
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
        if (cVar == null) {
            k41.b.B(eVar, "deploymentStatus");
            throw null;
        }
        if (dVar != null) {
            return new e(str, str2, aVar, zonedDateTime, cVar, dVar);
        }
        k41.b.B(eVar, "pullRequest");
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
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, eVar.d);
        fVar.z0("deploymentStatus");
        aa.c.c(i.a, false).b(fVar, wVar, eVar.e);
        fVar.z0("pullRequest");
        aa.c.c(j.a, false).b(fVar, wVar, eVar.f);
    }

}
