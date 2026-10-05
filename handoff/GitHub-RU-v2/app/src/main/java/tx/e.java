package tx;

import aa.w;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import k71.k;
import m10.sa;
import m10.tf0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
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
        tf0 tf0Var = null;
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
                tf0.Companion.getClass();
                Iterator it = tf0.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((tf0) obj).r.equals(u)) {
                        break;
                    }
                }
                tf0 tf0Var2 = (tf0) obj;
                tf0Var = tf0Var2 == null ? tf0.u : tf0Var2;
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
        if (tf0Var == null) {
            k41.b.B(eVar, "blockDuration");
            throw null;
        }
        if (zonedDateTime != null) {
            return new c(str, str2, aVar, bVar, tf0Var, zonedDateTime);
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
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, cVar.f);
    }
}
