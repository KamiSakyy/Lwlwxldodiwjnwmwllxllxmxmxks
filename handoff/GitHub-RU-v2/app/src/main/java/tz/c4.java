package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"fieldValues", "id", "__typename"});

    public static x1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c0 c0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                c0Var = (c0) aa.c.c(k2.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (c0Var == null) {
            k41.b.B(eVar, "fieldValues");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new x1(c0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
