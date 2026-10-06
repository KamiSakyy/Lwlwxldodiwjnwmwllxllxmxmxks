package sr;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "actor", "isCrossRepository", "source", "createdAt"});

    public static j c(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        i iVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                aVar = (a) aa.c.b(aa.c.c(k.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                iVar = (i) aa.c.c(t.a, true).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isCrossRepository");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (iVar == null) {
            k41.b.B(eVar, "source");
            throw null;
        }
        if (zonedDateTime != null) {
            return new j(str, str2, aVar, booleanValue, iVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, jVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(k.a, true)).b(fVar, wVar, jVar.c);
        fVar.z0("isCrossRepository");
        f4Shadow.C(jVar.d, aa.c.f, fVar, wVar, "source");
        aa.c.c(t.a, true).b(fVar, wVar, jVar.e);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, jVar.f);
    }
}
