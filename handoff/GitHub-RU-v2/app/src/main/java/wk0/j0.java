package wk0;

import gn0.fc;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0Shadow.o(new String[]{"interaction", "occurredAt", "commenter", "interactable"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fc fcVar = null;
        ZonedDateTime zonedDateTime = null;
        o oVar = null;
        p pVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                fc.Companion.getClass();
                Iterator it = fc.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((fc) obj).r.equals(u)) {
                        break;
                    }
                }
                fc fcVar2 = (fc) obj;
                fcVar = fcVar2 == null ? fc.t : fcVar2;
            } else if (r0 == 1) {
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
            } else if (r0 == 2) {
                oVar = (o) aa.c.b(aa.c.c(a0Shadow.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                pVar = (p) aa.c.c(c0.a, true).a(eVar, wVar);
            }
        }
        if (fcVar == null) {
            k41.b.B(eVar, "interaction");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "occurredAt");
            throw null;
        }
        if (pVar != null) {
            return new w(fcVar, zonedDateTime, oVar, pVar);
        }
        k41.b.B(eVar, "interactable");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w wVar2 = (w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("interaction");
        fVar.I(wVar2.a.r);
        fVar.z0("occurredAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, wVar2.b);
        fVar.z0("commenter");
        aa.c.b(aa.c.c(a0Shadow.a, true)).b(fVar, wVar, wVar2.c);
        fVar.z0("interactable");
        aa.c.c(c0.a, true).b(fVar, wVar, wVar2.d);
    }
}
