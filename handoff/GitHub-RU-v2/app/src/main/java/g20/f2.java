package g20;

import hc0.w00;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name", "state", "runs", "__typename"});

    public static c2 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        w00 w00Var = null;
        b2 b2Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                w00.Companion.getClass();
                Iterator it = w00.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((w00) obj).r.equals(u)) {
                        break;
                    }
                }
                w00 w00Var2 = (w00) obj;
                w00Var = w00Var2 == null ? w00.t : w00Var2;
            } else if (r0 == 3) {
                b2Var = (b2) aa.c.c(e2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (w00Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (b2Var == null) {
            k41.b.B(eVar, "runs");
            throw null;
        }
        if (str3 != null) {
            return new c2(str, str2, w00Var, b2Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
