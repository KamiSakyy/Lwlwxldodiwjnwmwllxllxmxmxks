package c20;

import hc0.h6;
import hc0.j2;
import hc0.p2;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0.o("id", "startedAt", "status", "conclusion", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        p2 p2Var = null;
        j2 j2Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, h6.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                p2.Companion.getClass();
                Iterator it = p2.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((p2) obj).r.equals(u)) {
                        break;
                    }
                }
                p2 p2Var2 = (p2) obj;
                p2Var = p2Var2 == null ? p2.t : p2Var2;
            } else if (r0 == 3) {
                j2Var = (j2) aa.c.b(ic0.a.b).a(eVar, wVar);
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
        if (p2Var == null) {
            k41.b.B(eVar, "status");
            throw null;
        }
        if (str2 != null) {
            return new b20.t(str, zonedDateTime, p2Var, j2Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.t tVar = (b20.t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tVar.a);
        fVar.z0("startedAt");
        h6.Companion.getClass();
        aa.c.b(wVar.e(h6.a)).b(fVar, wVar, tVar.b);
        fVar.z0("status");
        fVar.I(tVar.c.r);
        fVar.z0("conclusion");
        aa.c.b(ic0.a.b).b(fVar, wVar, tVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tVar.e);
    }
}
