package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerDidAuthor", "viewerLatestReviewRequest", "pendingReviews", "__typename"});

    public static c8 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        b8 b8Var = null;
        z7 z7Var = null;
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
                b8Var = (b8) aa.c.b(aa.c.c(h8.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                z7Var = (z7) aa.c.b(aa.c.c(f8.a, false)).a(eVar, wVar);
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
            return new c8(str, booleanValue, b8Var, z7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
