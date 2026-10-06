package sc0;

import gn0.l2;
import gn0.r2;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "startedAt", "status", "conclusion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        r2 r2Var = null;
        l2 l2Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, r6.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                r2.Companion.getClass();
                Iterator it = r2.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r2) obj).r.equals(u)) {
                        break;
                    }
                }
                r2 r2Var2 = (r2) obj;
                r2Var = r2Var2 == null ? r2.t : r2Var2;
            } else if (r0 == 3) {
                l2Var = (l2) aa.c.b(hn0.a.b).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (r2Var == null) {
            k41.b.B(eVar, "status");
            throw null;
        }
        if (str2 != null) {
            return new rc0.t(str, zonedDateTime, r2Var, l2Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.t tVar = (rc0.t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tVar.a);
        fVar.z0("startedAt");
        r6.Companion.getClass();
        aa.c.b(wVar.e(r6.a)).b(fVar, wVar, tVar.b);
        fVar.z0("status");
        fVar.I(tVar.c.r);
        fVar.z0("conclusion");
        aa.c.b(hn0.a.b).b(fVar, wVar, tVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tVar.e);
    }
}
