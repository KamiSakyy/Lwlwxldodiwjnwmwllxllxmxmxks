package ea0;

import hc0.h6;
import hc0.rb;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0.o("interaction", "occurredAt", "commenter", "interactable");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rb rbVar = null;
        ZonedDateTime zonedDateTime = null;
        o oVar = null;
        p pVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                rb.Companion.getClass();
                Iterator it = rb.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((rb) obj).r.equals(u)) {
                        break;
                    }
                }
                rb rbVar2 = (rb) obj;
                rbVar = rbVar2 == null ? rb.t : rbVar2;
            } else if (r0 == 1) {
                h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
            } else if (r0 == 2) {
                oVar = (o) aa.c.b(aa.c.c(a0.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                pVar = (p) aa.c.c(c0.a, true).a(eVar, wVar);
            }
        }
        if (rbVar == null) {
            k41.b.B(eVar, "interaction");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "occurredAt");
            throw null;
        }
        if (pVar != null) {
            return new w(rbVar, zonedDateTime, oVar, pVar);
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
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, wVar2.b);
        fVar.z0("commenter");
        aa.c.b(aa.c.c(a0.a, true)).b(fVar, wVar, wVar2.c);
        fVar.z0("interactable");
        aa.c.c(c0.a, true).b(fVar, wVar, wVar2.d);
    }
}
