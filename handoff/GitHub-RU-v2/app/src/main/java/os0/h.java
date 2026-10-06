package os0;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import pz0.o7;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "createdAt", "isCrossRepository", "canonical"});

    public static e c(ea.e eVar, w wVar) {
        Boolean bool;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        b bVar = null;
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
                aVar = (a) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 4) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                bVar = (b) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
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
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (bool3 != null) {
            return new e(str, str2, aVar, zonedDateTime, bool3.booleanValue(), bVar);
        }
        k41.b.B(eVar, "isCrossRepository");
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
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, eVar.d);
        fVar.z0("isCrossRepository");
        f4Shadow.C(eVar.e, aa.c.f, fVar, wVar, "canonical");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, eVar.f);
    }
}
