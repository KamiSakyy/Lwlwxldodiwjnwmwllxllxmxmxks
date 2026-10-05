package gv;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.b00;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "lastEditedAt", "state", "id"});

    public static o c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        b00 b00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, sa.a, eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                b00.Companion.getClass();
                Iterator it = b00.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b00) obj).r.equals(u)) {
                        break;
                    }
                }
                b00 b00Var2 = (b00) obj;
                b00Var = b00Var2 == null ? b00.v : b00Var2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        n3 n3Var = n3.a;
        z2 c = n3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (b00Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new o(str, zonedDateTime, b00Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
