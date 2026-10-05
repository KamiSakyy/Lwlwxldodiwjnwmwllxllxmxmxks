package qx;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "name", "login"});

    public static q0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        eq.g c = eq.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 != null) {
            return new q0(str, str2, str3, str4, c);
        }
        k41.b.B(eVar, "login");
        throw null;
    }
}
