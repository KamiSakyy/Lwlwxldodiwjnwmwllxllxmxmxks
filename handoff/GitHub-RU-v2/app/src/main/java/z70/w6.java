package z70;

import hc0.vl;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w6 implements aa.a {
    public static final w6 a = new w6();
    public static final List b = sy.d0.o("state", "submittedAt", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vl vlVar = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                vl.Companion.getClass();
                Iterator it = vl.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((vl) obj).r.equals(u)) {
                        break;
                    }
                }
                vl vlVar2 = (vl) obj;
                vlVar = vlVar2 == null ? vl.t : vlVar2;
            } else if (r0 == 1) {
                hc0.h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, hc0.h6.a, eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (vlVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new i5(vlVar, zonedDateTime, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i5 i5Var = (i5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i5Var, "value");
        fVar.z0("state");
        fVar.I(i5Var.a.r);
        fVar.z0("submittedAt");
        hc0.h6.Companion.getClass();
        aa.c.b(wVar.e(hc0.h6.a)).b(fVar, wVar, i5Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i5Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i5Var.d);
    }
}
