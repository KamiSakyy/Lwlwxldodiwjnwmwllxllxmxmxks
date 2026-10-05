package rn0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.e3;
import pz0.o7;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0.o(new String[]{"id", "startedAt", "status", "conclusion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        e3 e3Var = null;
        y2 y2Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, o7.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                e3.Companion.getClass();
                Iterator it = e3.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((e3) obj).r.equals(u)) {
                        break;
                    }
                }
                e3 e3Var2 = (e3) obj;
                e3Var = e3Var2 == null ? e3.t : e3Var2;
            } else if (r0 == 3) {
                y2Var = (y2) aa.c.b(qz0.a.c).a(eVar, wVar);
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
        if (e3Var == null) {
            k41.b.B(eVar, "status");
            throw null;
        }
        if (str2 != null) {
            return new qn0.t(str, zonedDateTime, e3Var, y2Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.t tVar = (qn0.t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tVar.a);
        fVar.z0("startedAt");
        o7.Companion.getClass();
        aa.c.b(wVar.e(o7.a)).b(fVar, wVar, tVar.b);
        fVar.z0("status");
        fVar.I(tVar.c.r);
        fVar.z0("conclusion");
        aa.c.b(qz0.a.c).b(fVar, wVar, tVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tVar.e);
    }
}
