package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerDidAuthor", "viewerLatestReviewRequest", "pendingReviews", "__typename"});

    public static j8 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        i8 i8Var = null;
        g8 g8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                i8Var = (i8) aa.c.b(aa.c.c(o8.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                g8Var = (g8) aa.c.b(aa.c.c(m8.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "viewerDidAuthor");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new j8(str, booleanValue, i8Var, g8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
