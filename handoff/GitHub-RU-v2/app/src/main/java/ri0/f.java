package ri0;

import gn0.hn;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "lastEditedAt", "state", "id"});

    public static e c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        hn hnVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gn0.r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, gn0.r6.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                hn.Companion.getClass();
                Iterator it = hn.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hn) obj).r.equals(u)) {
                        break;
                    }
                }
                hn hnVar2 = (hn) obj;
                hnVar = hnVar2 == null ? hn.v : hnVar2;
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
        if (hnVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new e(str, zonedDateTime, hnVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
