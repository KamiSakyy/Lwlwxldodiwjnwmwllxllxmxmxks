package z70;

import hc0.fm;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "lastEditedAt", "state", "id"});

    public static e c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        fm fmVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                hc0.h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, hc0.h6.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                fm.Companion.getClass();
                Iterator it = fm.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((fm) obj).r.equals(u)) {
                        break;
                    }
                }
                fm fmVar2 = (fm) obj;
                fmVar = fmVar2 == null ? fm.v : fmVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        w2 w2Var = w2.a;
        l2 c = w2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (fmVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new e(str, zonedDateTime, fmVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
