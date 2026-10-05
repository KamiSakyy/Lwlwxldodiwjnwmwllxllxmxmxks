package ww;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "actor", "subIssue", "createdAt"});

    public static l c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        i iVar = null;
        k kVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                iVar = (i) aa.c.b(aa.c.c(m.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                kVar = (k) aa.c.b(aa.c.c(o.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
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
        if (zonedDateTime != null) {
            return new l(str, str2, iVar, kVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, l lVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, lVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(m.a, true)).b(fVar, wVar, lVar.c);
        fVar.z0("subIssue");
        aa.c.b(aa.c.c(o.a, true)).b(fVar, wVar, lVar.d);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, lVar.e);
    }
}
