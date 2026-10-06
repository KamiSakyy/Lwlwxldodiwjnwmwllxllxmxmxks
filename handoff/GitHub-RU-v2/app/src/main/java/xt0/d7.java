package xt0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.wt;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d7 implements aa.a {
    public static final d7 a = new d7();
    public static final List b = sy.d0Shadow.o(new String[]{"state", "submittedAt", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wt wtVar = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                wt.Companion.getClass();
                Iterator it = wt.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((wt) obj).r.equals(u)) {
                        break;
                    }
                }
                wt wtVar2 = (wt) obj;
                wtVar = wtVar2 == null ? wt.t : wtVar2;
            } else if (r0 == 1) {
                pz0.o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, pz0.o7.a, eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (wtVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new r5(wtVar, zonedDateTime, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r5 r5Var = (r5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r5Var, "value");
        fVar.z0("state");
        fVar.I(r5Var.a.r);
        fVar.z0("submittedAt");
        pz0.o7.Companion.getClass();
        aa.c.b(wVar.e(pz0.o7.a)).b(fVar, wVar, r5Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r5Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r5Var.d);
    }
}
