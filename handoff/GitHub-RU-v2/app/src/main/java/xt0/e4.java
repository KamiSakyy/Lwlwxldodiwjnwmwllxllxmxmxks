package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "timelineItems"});

    public static b4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a4 a4Var = null;
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
                a4Var = (a4) aa.c.c(f4.a, false).a(eVar, wVar);
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
        if (a4Var != null) {
            return new b4(str, str2, a4Var);
        }
        k41.b.B(eVar, "timelineItems");
        throw null;
    }
}
