package gv;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.rz;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r7 implements aa.a {
    public static final r7 a = new r7();
    public static final List b = sy.d0.o("state", "submittedAt", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rz rzVar = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                rz.Companion.getClass();
                Iterator it = rz.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((rz) obj).r.equals(u)) {
                        break;
                    }
                }
                rz rzVar2 = (rz) obj;
                rzVar = rzVar2 == null ? rz.t : rzVar2;
            } else if (r0 == 1) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, sa.a, eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (rzVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new d6(rzVar, zonedDateTime, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d6 d6Var = (d6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d6Var, "value");
        fVar.z0("state");
        fVar.I(d6Var.a.r);
        fVar.z0("submittedAt");
        sa.Companion.getClass();
        aa.c.b(wVar.e(sa.a)).b(fVar, wVar, d6Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d6Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d6Var.d);
    }
}
