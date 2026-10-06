package ri0;

import gn0.xm;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l7 implements aa.a {
    public static final l7 a = new l7();
    public static final List b = sy.d0Shadow.o(new String[]{"state", "submittedAt", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xm xmVar = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                xm.Companion.getClass();
                Iterator it = xm.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((xm) obj).r.equals(u)) {
                        break;
                    }
                }
                xm xmVar2 = (xm) obj;
                xmVar = xmVar2 == null ? xm.t : xmVar2;
            } else if (r0 == 1) {
                gn0.r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, gn0.r6.a, eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (xmVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new v5(xmVar, zonedDateTime, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v5 v5Var = (v5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v5Var, "value");
        fVar.z0("state");
        fVar.I(v5Var.a.r);
        fVar.z0("submittedAt");
        gn0.r6.Companion.getClass();
        aa.c.b(wVar.e(gn0.r6.a)).b(fVar, wVar, v5Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v5Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v5Var.d);
    }
}
