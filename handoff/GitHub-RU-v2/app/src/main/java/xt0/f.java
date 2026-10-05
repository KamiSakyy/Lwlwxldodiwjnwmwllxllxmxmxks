package xt0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "lastEditedAt", "state", "id"});

    public static e c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        gu guVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                pz0.o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, pz0.o7.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                gu.Companion.getClass();
                Iterator it = gu.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gu) obj).r.equals(u)) {
                        break;
                    }
                }
                gu guVar2 = (gu) obj;
                guVar = guVar2 == null ? gu.v : guVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        d3 d3Var = d3.a;
        p2 c = d3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (guVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new e(str, zonedDateTime, guVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
