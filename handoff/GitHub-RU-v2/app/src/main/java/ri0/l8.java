package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "viewerDidAuthor", "pendingReviews"});

    public static h8 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        g8 g8Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                bool = bool2;
                g8Var = (g8) aa.c.b(aa.c.c(k8.a, false)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        a8 c = d8.c(eVar, wVar);
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 != null) {
            return new h8(str, str2, bool3.booleanValue(), g8Var, c);
        }
        k41.b.B(eVar, "viewerDidAuthor");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, h8 h8Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h8Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h8Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, h8Var.b);
        fVar.z0("viewerDidAuthor");
        jo.f4.C(h8Var.c, aa.c.f, fVar, wVar, "pendingReviews");
        aa.c.b(aa.c.c(k8.a, false)).b(fVar, wVar, h8Var.d);
        List list = d8.a;
        d8.d(fVar, wVar, h8Var.e);
    }
}
