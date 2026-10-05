package wk0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"notificationSettings", "id", "__typename"});

    public static j2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i2 i2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                i2Var = (i2) aa.c.b(aa.c.c(k2.a, false)).a(eVar, wVar);
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
            return new j2(i2Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
