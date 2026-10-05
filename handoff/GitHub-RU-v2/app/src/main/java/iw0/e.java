package iw0;

import aa.w;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import k71.k;
import pz0.o7;
import pz0.y80;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "userSubject", "blockDuration", "createdAt"});

    public static c c(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        b bVar = null;
        y80 y80Var = null;
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
                bVar = (b) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 4) {
                String u = eVar.u();
                k.d(u);
                y80.Companion.getClass();
                Iterator it = y80.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((y80) obj).r.equals(u)) {
                        break;
                    }
                }
                y80 y80Var2 = (y80) obj;
                y80Var = y80Var2 == null ? y80.u : y80Var2;
            } else {
                if (r0 != 5) {
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
        if (y80Var == null) {
            k41.b.B(eVar, "blockDuration");
            throw null;
        }
        if (zonedDateTime != null) {
            return new c(str, str2, aVar, bVar, y80Var, zonedDateTime);
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
        fVar.z0("userSubject");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, cVar.d);
        fVar.z0("blockDuration");
        fVar.I(cVar.e.r);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, cVar.f);
    }

}
