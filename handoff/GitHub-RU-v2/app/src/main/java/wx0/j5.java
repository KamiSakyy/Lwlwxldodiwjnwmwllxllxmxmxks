package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name", "nameHTML"});

    public static i5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
        if (str3 != null) {
            return new i5(str, str2, str3);
        }
        k41.b.B(eVar, "nameHTML");
        throw null;
    }
}
