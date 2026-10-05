package ef0;

import aa.w;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "actor", "isCrossRepository", "source", "createdAt"});

    public static i c(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        h hVar = null;
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
                aVar = (a) aa.c.b(aa.c.c(j.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                hVar = (h) aa.c.c(r.a, true).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
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
        if (hVar == null) {
            k41.b.B(eVar, "source");
            throw null;
        }
        if (zonedDateTime != null) {
            return new i(str, str2, aVar, booleanValue, hVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(j.a, true)).b(fVar, wVar, iVar.c);
        fVar.z0("isCrossRepository");
        f4.C(iVar.d, aa.c.f, fVar, wVar, "source");
        aa.c.c(r.a, true).b(fVar, wVar, iVar.e);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, iVar.f);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
