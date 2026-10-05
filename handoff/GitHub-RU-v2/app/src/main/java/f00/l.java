package f00;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "title", "updatedAt", "createdAt"});

    public static k c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 != 2) {
                aa.x xVar = sa.a;
                if (r0 == 3) {
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                } else {
                    if (r0 != 4) {
                        break;
                    }
                    sa.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                }
            } else {
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "updatedAt");
            throw null;
        }
        if (zonedDateTime2 != null) {
            return new k(str, str2, str3, zonedDateTime, zonedDateTime2);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }
}
