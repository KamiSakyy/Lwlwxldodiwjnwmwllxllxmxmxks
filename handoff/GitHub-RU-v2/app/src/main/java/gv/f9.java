package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f9 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerDidAuthor", "viewerLatestReviewRequest", "pendingReviews", "__typename"});

    public static x8 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        w8 w8Var = null;
        u8 u8Var = null;
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
                w8Var = (w8) aa.c.b(aa.c.c(e9.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                u8Var = (u8) aa.c.b(aa.c.c(c9.a, false)).a(eVar, wVar);
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
            return new x8(str, booleanValue, w8Var, u8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
