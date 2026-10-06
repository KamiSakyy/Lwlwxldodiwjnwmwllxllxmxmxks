package fw0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.je;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0Shadow.o(new String[]{"interaction", "occurredAt", "commenter", "interactable"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        je jeVar = null;
        ZonedDateTime zonedDateTime = null;
        o oVar = null;
        p pVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                je.Companion.getClass();
                Iterator it = je.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((je) obj).r.equals(u)) {
                        break;
                    }
                }
                je jeVar2 = (je) obj;
                jeVar = jeVar2 == null ? je.t : jeVar2;
            } else if (r0 == 1) {
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 2) {
                oVar = (o) aa.c.b(aa.c.c(a0Shadow.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                pVar = (p) aa.c.c(c0.a, true).a(eVar, wVar);
            }
        }
        if (jeVar == null) {
            k41.b.B(eVar, "interaction");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "occurredAt");
            throw null;
        }
        if (pVar != null) {
            return new w(jeVar, zonedDateTime, oVar, pVar);
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
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, wVar2.b);
        fVar.z0("commenter");
        aa.c.b(aa.c.c(a0Shadow.a, true)).b(fVar, wVar, wVar2.c);
        fVar.z0("interactable");
        aa.c.c(c0.a, true).b(fVar, wVar, wVar2.d);
    }
}
