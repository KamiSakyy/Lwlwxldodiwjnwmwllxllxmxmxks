package qx;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"notificationSettings", "id", "__typename"});

    public static l2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k2 k2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                k2Var = (k2) aa.c.b(aa.c.c(m2.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l2(k2Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
