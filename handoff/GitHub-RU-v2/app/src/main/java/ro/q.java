package ro;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.b4;
import m10.sa;
import m10.t3;

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
        b4 b4Var = null;
        t3 t3Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, sa.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                b4.Companion.getClass();
                Iterator it = b4.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b4) obj).r.equals(u)) {
                        break;
                    }
                }
                b4 b4Var2 = (b4) obj;
                b4Var = b4Var2 == null ? b4.t : b4Var2;
            } else if (r0 == 3) {
                t3Var = (t3) aa.c.b(n10.a.d).a(eVar, wVar);
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
        if (b4Var == null) {
            k41.b.B(eVar, "status");
            throw null;
        }
        if (str2 != null) {
            return new qo.t(str, zonedDateTime, b4Var, t3Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qo.t tVar = (qo.t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tVar.a);
        fVar.z0("startedAt");
        sa.Companion.getClass();
        aa.c.b(wVar.e(sa.a)).b(fVar, wVar, tVar.b);
        fVar.z0("status");
        fVar.I(tVar.c.r);
        fVar.z0("conclusion");
        aa.c.b(n10.a.d).b(fVar, wVar, tVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tVar.e);
    }
}
